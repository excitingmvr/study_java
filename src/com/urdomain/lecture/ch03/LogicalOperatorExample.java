package com.urdomain.lecture.ch03;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		
		int charCode = 'A';	// 65
		
		System.out.println("charCode: " + charCode);
//		&& = & : and 연산 참 참 참, 나머지 폴스
//		|| = | : or 연산 참 폴스 참, 폴스 참 참, 참 참 참, 폴스 폴스 폴스
		
		
//		if( (charCode>=65) & (charCode<=90) ) {	// true, true -> ture
//			System.out.println("대문자 이군요");	
//		} 
//		
//		if( (charCode>=97) && (charCode<=122) ) {	// false treu -> false
//			System.out.println("소문자 이군요");
//		}
//		
//		if( !(charCode<48) && !(charCode>57) ) {	// false-> true, true->false --> false
//			System.out.println("0~9 숫자 이군요");
//		}
		
		
//		if( (charCode>=65) | (charCode<=90) ) {		// true, true -> ture
//			System.out.println("대문자 이군요");	
//		}
//		
//		if( (charCode>=97) || (charCode<=122) ) {	// false true -> true
//			System.out.println("소문자 이군요");
//		}
//		
//		if( !(charCode<48) || !(charCode>57) ) {	// false-> true, true->false --> true
//			System.out.println("0~9 숫자 이군요");
//		}
		
		
		int value = 6;
		
		if( (value%2==0) | (value%3==0) ) {	// true true -> true
			System.out.println("2 또는 3의 배수 이군요");
		}
		
		if( (value%2==0) || (value%3==0) ) {	// true true -> true
			System.out.println("2 또는 3의 배수 이군요");
		}	
	}

}
