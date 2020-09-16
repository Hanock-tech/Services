package com.vedika.functionhall.service;

import com.vedika.functionhall.model.BookingSlot;
import com.vedika.functionhall.model.Payment;
import com.vedika.functionhall.model.PaymentCallback;
import com.vedika.functionhall.model.PaymentDetail;
import com.vedika.functionhall.model.PaymentInfo;

public interface PaymentService {

	// String payuCallback(PaymentInfo paymentCallback);

	Payment proceedPayment(Payment paymentDetail);

	PaymentInfo payuCallback(PaymentInfo paymentinfo, BookingSlot bookingslot);

}
