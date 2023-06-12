
/*
 * Create another class Classroom with an instance method getAverageClassGrade(students) that takes a list of Student objects and returns the average grade of the class. Create a few Student objects and pass them to the getAverageClassGrade() method 
   to get the average grade of the class.

 */
package com.nit.jun12;

public class ClassRoom {

	public static  double getAverageClassGrade(Student[] students) {
	
		int sum=0;
		for(int i=0;i<students.length;i++) {
			sum += students[i].getAverageGrade();
		}
		
		double avg = sum/students.length;
		
		return avg;
	}
	
	
	public static void main(String[] args) {

		Student aman = new Student("Aman Khan", new int[] {60,76,78,89});
		Student birbal = new Student("Aman Birbal", new int[] {76,70,88,87});
		Student ntr = new Student("NTR Ramarao", new int[] {87,78,85,70});
		
		Student[] students = {aman,birbal,ntr};
		
		System.out.println("Aveg : "+ClassRoom.getAverageClassGrade(students));
		
	}
	
	
}










