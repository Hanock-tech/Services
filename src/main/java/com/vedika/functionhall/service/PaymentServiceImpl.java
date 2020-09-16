package com.vedika.functionhall.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vedika.functionhall.model.BookingSlot;
import com.vedika.functionhall.model.Payment;
import com.vedika.functionhall.model.PaymentInfo;
import com.vedika.functionhall.model.PaymentStatus;
import com.vedika.functionhall.repository.BookingRepo;
import com.vedika.functionhall.repository.PaymentRepo;
import com.vedika.functionhall.util.PaymentUtil;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private PaymentRepo paymentRepository;
	@Autowired
	private BookingRepo bookingrepo;

	@Override
	public Payment proceedPayment(Payment paymentDetail) {
		PaymentUtil paymentUtil = new PaymentUtil();
		paymentDetail = paymentUtil.populatePaymentDetail(paymentDetail);
			savePaymentDetail(paymentDetail);
		return paymentDetail;
	}

	@Override
	public PaymentInfo payuCallback(PaymentInfo paymentinfo, BookingSlot bookingslot) {
	//	String msg = "Transaction failed.";
		String msg="something went wrong ";
		Payment payment = paymentRepository.findByTxnId(paymentinfo.getTxnid());
		if (payment != null) {
			// TODO validate the hash
			PaymentStatus paymentStatus = null;
			if (paymentinfo.getStatus().equals("failure")) {
				PaymentInfo paymentinfo1=new PaymentInfo();
				paymentinfo1.setStatus(paymentinfo.getStatus());
				paymentinfo1.setMihpayid(paymentinfo.getMihpayid());
				paymentinfo1.setMode(paymentinfo.getMode());
				paymentinfo1.setProductinfo(paymentinfo.getProductinfo());
				return paymentinfo1;
			} else if (paymentinfo.getStatus().equals("success")) {
				PaymentInfo paymentinfo2=new PaymentInfo();
				paymentinfo2.setMode(paymentinfo.getMode());
				paymentinfo2.setProductinfo(paymentinfo.getProductinfo());
				paymentinfo2.setStatus(paymentinfo.getStatus());
				paymentinfo2.setMihpayid(paymentinfo.getMihpayid());
				paymentStatus = PaymentStatus.Success;
			//	msg = "Transaction success";
				payment.setPaymentStatus(paymentStatus);
				payment.setMihpayId(paymentinfo.getMihpayid());
				payment.setMode(paymentinfo.getMode());
				bookingslot.setFunctionhallId(paymentinfo.getProductinfo());
				bookingslot.setDate(paymentinfo.getDate());
				bookingslot.setTimeSlot(paymentinfo.getTimeSlot());
				paymentRepository.save(payment);
				bookingrepo.save(bookingslot);
				
				return paymentinfo2;
			}

		}
		PaymentInfo paymentinfo3=new PaymentInfo();
		paymentinfo3.setStatus(paymentinfo.getStatus());
		return paymentinfo3;
	}

	private void savePaymentDetail(Payment paymentDetail) {
		Payment payment = new Payment();
		payment.setAmount(paymentDetail.getAmount());
		payment.setEmail(paymentDetail.getEmail());
		payment.setName(paymentDetail.getName());
		payment.setPaymentDate(new Date());
		payment.setPaymentStatus(PaymentStatus.Pending);
		payment.setPhone(paymentDetail.getPhone());
		payment.setProductInfo(paymentDetail.getProductInfo());
		payment.setTxnId(paymentDetail.getTxnId());
		paymentRepository.save(payment);
	}

}
