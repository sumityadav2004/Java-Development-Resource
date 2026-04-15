package com.spring.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("obj")
public class Student {
	@Value("Sumit Yadav")
private String StudentName;
	@Value("27")
private String StudentRollno;
	@Value("#{temp}")
	private List<String> name;
	
public String getStudentName() {
	return StudentName;
}
public void setStudentName(String studentName) {
	StudentName = studentName;
}
public String getStudentRollno() {
	return StudentRollno;
}
public void setStudentRollno(String studentRollno) {
	StudentRollno = studentRollno;
}

public List<String> getName() {
	return name;
}
public void setName(List<String> name) {
	this.name = name;
}
@Override
public String toString() {
	return "Student [StudentName=" + StudentName + ", StudentRollno=" + StudentRollno + "]";
}

}
