package com.urdomain.lecture.ch06;

public class ThirdCalculatorExample {

	public static void main(String[] args) {
		
		ThirdCalculator thirdCalculator = new ThirdCalculator();
		
//		double result1 = thirdCalculator.areaRectangle(10);	// 정사각형
//
//		double result2 = thirdCalculator.areaRectangle(10, 20);	// 직사각형
//		
//		System.out.println("사각형의 넓이: " + result1);
//		System.out.println("사각형의 넓이: " + result2);
		
		double result1 = 10 * 10 * ForthCalculator.pi;
		int result2 = ForthCalculator.plus(10, 5);
		int result3 = ForthCalculator.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		
		
				

	}

}
