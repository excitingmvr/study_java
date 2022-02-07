package com.urdomain.lecture.ch02;

public class FloatDoubleExample {

	public static void main(String[] args) {
		//실수값 저장
		double var1 = 3.14;		
//		float var2 = 3.14;		//컴파일 에러(Type mismatch)
		float var3 = 3.14F;
		
		//정밀도 테스트
		double var4 = 0.1234567890123456789;
		float var5 =  0.1234567890123456789F;
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		
		//e 사용하기
		int var6 = 3000000;
		double var7 = 3e6;	// 10에 6승
		float var8 = 3e6F;	// 10에 6승
		double var9 = 2e-3;	// 10에 -3승 소수점 3자리ㅏ
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);
		System.out.println("var9: " + var9);
	}

}
