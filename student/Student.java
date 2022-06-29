package org.student;

import org.college.College;

public class Student extends College{

	public void studentName() {
	System.out.println("Harish");	
	}
	
	public void studentDepartment() {
		System.out.println("ECE");
	}
	
	public void studentID() {
		System.out.println("JEC1226");
	}
	
	public static void main(String[] args) {
		
		Student st = new Student();
		st.collegeName();
		st.collegeCode();
		st.collegeRank();
		st.departmentName();
		st.studentName();
		st.studentDepartment();
		st.studentID();
	}
 }
