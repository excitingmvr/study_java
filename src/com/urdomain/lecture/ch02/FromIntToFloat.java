package com.urdomain.lecture.ch02;

public class FromIntToFloat {

	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;
		System.out.println("num3: " + num3);
		num2 = (int) num3;
		System.out.println("num2: " + num2);
		
		
	}

}
