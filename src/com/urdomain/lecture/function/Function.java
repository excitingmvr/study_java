package com.urdomain.lecture.function;

/**
 * @author seoul
 *
 */
/**
 * @author seoul
 *
 */
/**
 * @author seoul
 *
 */
public class Function {

	public static void main(String[] args) {
		
//		함수의 사용
//		add(3, 4);
//		println(add(3, 4));
//		println(minus(3, 4));
		
//		arithmeticOperation(3,4);
		
		int result[] = arithmeticOperation2(6, 3);
		for(int i = 0; i < result.length; i++)
			System.out.println(result[i]);
		
		System.out.println();
		
		for(int a : allInOne(6, 3)) {
			System.out.println(a);
		}
		
		System.out.println(bbb("장원영", "천재"));
		
	}

	// 오늘 뭐 먹지 프로그램
	// 배열 사용
	// 함수 사용
	// 출력을 위한 함수도 별도로 제작
	
	
//	중식, 한식, 양식, 일식
//	오늘 추천 드리는 메뉴는 ?? 입니다.
	
	
	
	// 문자열을 합치는 함수
//	input : 문자열갯수에 상관없이
//	output : String
	
	public static String bbb(String a, String b) {
		
		String ccc = a + b;
		
		return ccc;
	}
	
	public static int[] allInOne(int a, int b) {
		int sum = 0;
		int[] sum2 = new int[5];
			sum2[0] = a + b;
			sum2[1] = a-b;
			sum2[2] = a*b;
			sum2[3] = a/b;
			sum2[4] = a%b;
		
		return sum2;
	}
	
	public static int[] arithmeticOperation2(int a, int b) {
		
		int plus = a + b;
		int minus = a - b;
		int multiply = a * b;
		int divide = a / b;
		int result[] = {plus, minus, multiply, divide};
		
//		System.out.println("a + b = " + plus);
//		System.out.println("a - b = " + minus);
//		System.out.println("a * b = " + multiply);
//		System.out.println("a / b = " + divide);
		
		return result;
	}
	
	public static void arithmeticOperation(int a, int b) {
		
		int plus = a + b;
		int minus = a - b;
		int multiply = a * b;
		int divide = a / b;
		
		System.out.println("a + b = " + plus);
		System.out.println("a - b = " + minus);
		System.out.println("a * b = " + multiply);
		System.out.println("a / b = " + divide);
		
		
	}
	

	/**
	 * @param a
	 * @param b
	 * @return
	 */
	public static int add(int a, int b) {
		int result = a + b;
		return result;
	}

	/**
	 * @param a
	 * @param b
	 * @return
	 */
	public static int minus(int a, int b) {
		int result;
		result = a - b;
		return result;
	}
	
	
	public static int multi(int a, int b) {
		return a*b;
	}
	
	
	public static int divide(int a, int b) {
		return a/b;
	}
	
	public static int reminder(int a, int b) {
		return a%b;
	}

	/**
	 * @param a
	 */
	public static void println(int num) {
		System.out.println(num);
	}
	
	public static void println(Double num) {
		System.out.println(num);
	}
	
	public static void println(String str) {
		System.out.println(str);
	}
	
	
	public int aaa (int a, int b, int c, String d, boolean e) {
		System.out.println(a);
		return 1;
	}
	
//	덧셈함수
//	input : int, int
//	output : int 
	
	public static int addd(int a, int b) {
		
		return 1;
	}
	

}
