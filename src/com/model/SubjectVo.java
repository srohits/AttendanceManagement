package com.model;

public class SubjectVo {
  private int subjectId;
  private String subjectName;
public int getSubjectId() {
	return subjectId;
}
public void setSubjectId(int subjectId) {
	this.subjectId = subjectId;
}
public String getSubjectName() {
	return subjectName;
}
public void setSubjectName(String subjectName) {
	this.subjectName = subjectName;
}

	@Override
	public String toString() {
		return subjectName;
	}
}

