package com.urdomain.lecture.ch05;

public class Exc {

	public static void main(String[] args) {

//		2부터 9까지 정수형 배열 변수 2개을 만들고
//		for 문을 사용하여 구구단 출력을 하시요..
		
//		int[] arr1 = {2,3,4,5,6,7,8,9};
//		int[] arr2 = {1,2,3,4,5,6,7,8,9};
//		int k = 0;
//		
//		for(int i=0; i<arr1.length; i++) {
//			for(int j=0; j<arr2.length; j++) {
//				k = arr1[i]*arr2[j];
//
//				System.out.println(arr1[i] + "x" + arr2[j] + "=" + k);
//			}
//			System.out.println();
//		}
		
		int [] f_num= new int [8];
		
		for (int i=0; i<f_num.length; i++) {
			f_num[i] = i+2;
			int [] b_num= new int[8];
			for(int j=0; j<b_num.length; j++) {
				b_num[j]=j+2;
				int multi= f_num[i]*b_num[j];
				System.out.println(f_num[i] + "X" + b_num[j] + "=" + multi);
			}
			System.out.println();
			
		}
		
		
	}

}
