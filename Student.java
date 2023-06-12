/*
 * Program 03 :
   ------------
   Create a class Student with instance variables name and grades.         Implement a constructor that sets the instance variables name 
   and grades as a list of integers. Implement an instance method getAverageGrade() that returns the average grade of the student.
    
   Create another class Classroom with an instance method getAverageClassGrade(students) that takes a list of Student objects and returns the average grade of the class. Create a few Student objects and pass them to the getAverageClassGrade() method 
   to get the average grade of the class.

 */

package com.nit.jun12;

public class Student {
	
	private String name;
	private int[] grade;
	
	public Student(String name, int[] grade) {
		this.name = name;
		this.grade = grade;
	}
	
	public double getAverageGrade() {
		
		int sum=0;
		
		for(int i=0;i<this.grade.length;i++) {
			sum +=this.grade[i];
		}
		
		double avg = sum/this.grade.length;
		
		return avg;
	}
}








