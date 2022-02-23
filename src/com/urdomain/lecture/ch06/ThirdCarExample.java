package com.urdomain.lecture.ch06;

public class ThirdCarExample {

	public static void main(String[] args) {

		ThirdCar ThirdCar1 = new ThirdCar();
		System.out.println("ThirdCar1.company : " + ThirdCar1.company);
		System.out.println();
		
		ThirdCar ThirdCar2 = new ThirdCar("자가용");
		System.out.println("ThirdCar2.company : " + ThirdCar2.company);
		System.out.println("ThirdCar2.model : " + ThirdCar2.model);
		System.out.println();
		
		ThirdCar ThirdCar3 = new ThirdCar("자가용", "빨강");
		System.out.println("ThirdCar3.company : " + ThirdCar3.company);
		System.out.println("ThirdCar3.model : " + ThirdCar3.model);
		System.out.println("ThirdCar3.color : " + ThirdCar3.color);
		System.out.println();
		
		ThirdCar ThirdCar4 = new ThirdCar("택시", "검정", 200);
		System.out.println("ThirdCar4.company : " + ThirdCar4.company);
		System.out.println("ThirdCar4.model : " + ThirdCar4.model);
		System.out.println("ThirdCar4.color : " + ThirdCar4.color);
		System.out.println("ThirdCar4.maxSpeed : " + ThirdCar4.maxSpeed);
		
		double result1 = 10 * 10 * ForthCalculator.pi;
		int result2 = ForthCalculator.plus(10, 5);
		int result3 = ForthCalculator.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
	}

}
