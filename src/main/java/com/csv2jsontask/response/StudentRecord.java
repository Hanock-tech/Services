package com.csv2jsontask.response;

import java.util.ArrayList;
import java.util.List;

import com.csv2jsontask.model.Student;

public class StudentRecord {
	
	private Integer recordCount;
	private List<Student> data = new ArrayList<Student>();
	public Integer getRecordCount() {
		return recordCount;
	}
	public void setRecordCount(Integer recordCount) {
		this.recordCount = recordCount;
	}
	public List<Student> getData() {
		return data;
	}
	public void setData(List<Student> data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "StudentRecord [recordCount=" + recordCount + ", data=" + data + "]";
	}


}
