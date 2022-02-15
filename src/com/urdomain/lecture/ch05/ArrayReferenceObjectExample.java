package com.urdomain.lecture.ch05;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		
		// 갯수만 우선 정하고 데이터는 나중에 채워 넣겠다.
		String[] strArray = new String[3];
		
		strArray[0] = "장원영";
		strArray[1] = "장원영";
		strArray[2] = new String("장원영");

//		String strArray1 = "장원영";
//		String strArray2 = "장원영";
//		String strArray3 = new String("장원영");
		
		
		for(int i=0; i<strArray.length; i++) {
			
			System.out.println(strArray[i]);
		}
		
		System.out.println(strArray[0] == strArray[1]);	// true
		System.out.println(strArray[0] == strArray[2]);	// false
		
		System.out.println(strArray[0].equals(strArray[1]));	// true
		System.out.println(strArray[0].equals(strArray[2]));	// true
		
	}

}
