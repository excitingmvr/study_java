package com.urdomain.lecture.ch04;

public class IfNestedExample {

	public static void main(String[] args) {
		
		int score = 98;
		String grade = "";	
		
		if(score >= 90) {
			if(score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
				
			}
		}

		System.out.println("학점음 : " +  grade);
		
//		a+,a,b+,bc+,c D+df
	}

}
