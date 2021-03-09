package com.csv2jsontask;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.ResourceUtils;

import com.csv2jsontask.model.Student;
import com.csv2jsontask.model.Teacher;
import com.csv2jsontask.response.StudentRecord;
import com.csv2jsontask.response.TeacherRecord;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

@SpringBootApplication
public class Csv2JsonTaskApplication {

	private static Scanner scanner;

	public static void main(String[] args) throws IOException, ParseException {

		final String gender1 = "male";
		final String gender2 = "female";
		int studentCount = 1;
		int teacherCount = 1;
		SpringApplication.run(Csv2JsonTaskApplication.class, args);
		try {
			File file = ResourceUtils.getFile("classpath:master_Data/master-data2.csv");
			if (file.exists()) {
				System.out.println("file found");

			} else {
				throw new FileNotFoundException();

			}
			FileReader filereader = new FileReader(file);
			CSVReader csvReader = new CSVReaderBuilder(filereader).withSkipLines(1).build();
			List<String[]> fileData = csvReader.readAll();
			StudentRecord studentRecord = new StudentRecord();
			TeacherRecord teacherRecord = new TeacherRecord();
			List<Student> studentList = new ArrayList<Student>();
			List<Teacher> teacherList = new ArrayList<Teacher>();

			for (String[] row : fileData) {
				Student studentData = new Student();
				Teacher teacherData = new Teacher();

				if (row[1].contentEquals("student")) {
					studentData.setId(studentCount++);
					studentData.setFullName(row[2] + " " + row[3]);
					if (row[4].contentEquals("m")) {
						studentData.setGender(gender1);
					} else {
						studentData.setGender(gender2);
					}
					String date = dateValidation(row[5]);
					studentData.setDob(date);
					studentData.setAadhar(row[16]);
					String dateValue = row[5];
					String age = yearsAndMonthsValidation(dateValue);
					studentData.setAge(age);

					studentData.setCity(row[15]);

					studentData.setContact(row[17]);

					int rollNumber = Integer.parseInt(row[12]);
					studentData.setRollNumber(rollNumber);
					studentData.setStandard(row[8]);

					int totalMarks = Integer.parseInt(row[14]);
					studentData.setTotalMarks(totalMarks);
					String grade = gradeEvalution(totalMarks);
					studentData.setGrade(grade);
					int secPercentage = Integer.parseInt(row[21]);
					studentData.setSecPercentage(secPercentage);
					studentData.setHsStream(row[20]);
					studentList.add(studentData);

				} else {
					if (row[1].contentEquals("teacher")) {
						teacherData.setId(teacherCount++);
						teacherData.setFullName(row[2] + " " + row[3]);
						if (row[4].contentEquals("m")) {
							teacherData.setGender(gender1);
						} else {
							teacherData.setGender(gender2);
						}
						teacherData.setAadhar(row[16]);
						teacherData.setCity(row[15]);
						teacherData.setContact(row[17]);
						String dateValue = row[5];
						String date = dateValidation(row[7]);
						teacherData.setDob(date);
						String age = yearsAndMonthsValidation(dateValue);
						teacherData.setAge(age);
						teacherData.setEmpNo(row[13]);
						teacherData.setClassTeacherOf(row[11]);
						teacherData.setPerviousSchool(row[6]);
						teacherData.setPost(row[6]);
						teacherData.setSalary(row[10]);
						String dateofJoinValue = row[7];
						String dateofJoining = dateValidation(dateofJoinValue);
						teacherData.setDateOfJoining(dateofJoining);
						String servicePeriod = yearsAndMonthsValidation(dateValue);
						teacherData.setServicePeriod(servicePeriod);
						String subjectTeacher = row[19];
						String[] teacherSubjects = subjectTeacher.split("-");
						List<String> listOfSubjects = new ArrayList<>();
						for (String str : teacherSubjects) {
							listOfSubjects.add(str);
						}
						teacherData.setSubjectTeachers(listOfSubjects);
						teacherList.add(teacherData);

					}
				}

			}

			studentRecord.setData(studentList);
			studentRecord.setRecordCount(studentList.size());
			teacherRecord.setRecordCount(teacherList.size());
			teacherRecord.setData(teacherList);

			System.out.println("Please Enter the path to save two json Files" + ":");
			scanner = new Scanner(System.in);
			String path = scanner.nextLine();

			LocalDateTime currentTime = LocalDateTime.now();
			LocalDate date1 = currentTime.toLocalDate();
			String date12 = date1.toString();
			String localDate = date12.replaceAll("-", "");
			String savePath = path + "/student_record_" + localDate + ".json";
			String teachersavePath = path + "/teacher_record_" + localDate + ".json";
			String status = fileValidation(path);
			if (status.contentEquals("success")) {

				ObjectMapper mapper = new ObjectMapper();
				ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
				writer.writeValue(new FileWriter(savePath), studentRecord);
				writer.writeValue(new FileWriter(teachersavePath), teacherRecord);
				System.out.println("JSON files are successfully created");
			}

		} catch (

		FileNotFoundException ex) {

			System.out.println("File Not Found. Please Provide File");

		} catch (IOException ex) {

			System.out.println(ex.getLocalizedMessage());

		}

	}

	private static String dateValidation(String date) {

		String[] dateValue = date.split("/");
		List<String> datevalues = new ArrayList<String>();
		for (String s : dateValue) {
			if (s.length() == 1) {
				String date1 = "0" + s + "/";
				datevalues.add(date1);
			} else if (s.length() == 2) {
				String date2 = s + "/";
				datevalues.add(date2);
			} else if (s.length() > 3) {
				datevalues.add(s);
			}

		}
		String date2 = "";
		for (String date3 : datevalues) {
			date2 = date2 + date3;
		}
		return date2;
	}

	private static String yearsAndMonthsValidation(String date) {
		String yearsAndMonths = "";
		String[] list = date.split("/");
		int day = Integer.parseInt(list[1]);
		int month = Integer.parseInt(list[0]);
		int year = Integer.parseInt(list[2]);
		LocalDate bday = LocalDate.of(year, month, day);
		LocalDate today = LocalDate.now();
		Period age = Period.between(bday, today);
		int years = age.getYears();
		int months = age.getMonths();
		yearsAndMonths = years + " " + "Yrs" + " " + months + " " + "Months";
		return yearsAndMonths;
	}

	private static String fileValidation(String nextLine) throws IOException {

		String status = "success";
		String status1 = "failed";
		if (nextLine.isEmpty() || nextLine.isBlank()) {
			throw new FileNotFoundException();
		}
		File Originalfile = new File(nextLine);
		if (Originalfile.exists()) {
			throw new IOException("File already exits.Please try with diffrent path");
		} else {
			Boolean path = Originalfile.mkdir();
			if (path.booleanValue() == true) {
				return status;
			}
		}
		return status1;
	}

	private static String gradeEvalution(int totalMarks) {

		if (totalMarks >= 950) {
			return "A";
		} else if (totalMarks >= 800 && totalMarks <= 949) {
			return "B";
		} else if (totalMarks >= 650 && totalMarks <= 799) {
			return "c";
		} else if (totalMarks >= 500 && totalMarks <= 649) {
			return "D";
		}
		return "F";
	}

}
