package com.Capgemini.TestingOPPS;

public class StudentService {

public int totalMarks(StudentData student) {
	int totalMarks = student.getMarks1() + student.getMarks2() + student.getMarks3();
	return totalMarks;
}

public double averageMarks(StudentData student) {
	int avgMarks = (student.getMarks1()+student.getMarks2()+student.getMarks3()) / 3;
	return avgMarks;
}

public boolean PassOrFail(StudentData student) {
	if(student.getMarks1() > 40) {
		return true;
	} else {
		return false;
	}
}
}