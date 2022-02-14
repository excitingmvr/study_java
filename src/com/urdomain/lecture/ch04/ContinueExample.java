package com.urdomain.lecture.ch04;

public class ContinueExample {

	public static void main(String[] args) {
		
//		for(int i=1; i<=10; i++) {
//			if(i%2 != 0) {	// 짝수가 아니라면 (홀수면)
//				continue;
//			}
//			System.out.println(i);	// 
//		}
		
		int a = 1;
		
		while(a<=10) {	// 1(ture), 2(true), 2(true)
			
			if(a%2 == 0) {	// 1(false), 2(ture), 2(ture)
				continue;
			}
			
			System.out.println(a);	// 1
			a++;
		}

	}

}
