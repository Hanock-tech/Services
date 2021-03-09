package com.csv2jsontask.response;

import java.util.ArrayList;
import java.util.List;

import com.csv2jsontask.model.Teacher;

public class TeacherRecord {
	private Integer recordCount;
	private List<Teacher> data = new ArrayList<Teacher>();

	public Integer getRecordCount() {
		return recordCount;
	}

	public void setRecordCount(Integer recordCount) {
		this.recordCount = recordCount;
	}

	public List<Teacher> getData() {
		return data;
	}

	public void setData(List<Teacher> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "TeacherRecord [recordCount=" + recordCount + ", data=" + data + "]";
	}

}
