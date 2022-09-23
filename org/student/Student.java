package org.student;

import org.college.College;

public class Student extends College {
	public void studentName() {
		System.out.println("Student name method");

	}
public void studentDept() {
		System.out.println("Student Department method");
	}
public void studentId() {
	System.out.println("Student ID method");

}
	public static void main(String[] args) {
		Student obj=new Student();
		obj.collegeCode();
		obj.collegeName();
		obj.collegeRank();
		obj.deptName();
		obj.studentDept();
		obj.studentId();
		obj.studentName();
	
	}

}
