package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName() {
		System.out.println("This is Student Name");
	}
	
	public void studentDept() {
		System.out.println("This is Student Department");
	}
	
	public void studentId() {
		System.out.println("This is Student ID");
	}
	
	public static void main(String[] args) {
		
		Student MultiInhert = new Student();
		MultiInhert.studentName();
		MultiInhert.studentDept();
		MultiInhert.studentId();
		MultiInhert.deptName();
		MultiInhert.collegeName();
		MultiInhert.collegeCode();
		MultiInhert.collegeRank();
		
	}
}
