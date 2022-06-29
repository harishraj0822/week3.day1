package org.system;

public class Students {
	
	public void getStudentInfo(long id) {
		System.out.println("Student ID = "+id);
		
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("Student ID = " + id + "; Student Name = " + name);
	}
	
    public void getStudentInfo (String email, long mobNumber) {
    	System.out.println("Student Email = " + email + "; Student Mobile Number = " + mobNumber);
    }
    
    public static void main(String[] args) {
		
         Students s = new Students();
          s.getStudentInfo(15106040);
          s.getStudentInfo(15106040, "Harish Raj");
          s.getStudentInfo("harish18@gmail.com", 86105136);
	}
	
}
