package com.urdomain.lecture.ch03;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("-----------------------");

		x++;
		++x;
		
//		System.out.println(x++);
//		System.out.println(x);
//		System.out.println(++x);


		System.out.println("-----------------------");		
		y--;
		--y;
		System.out.println("y=" + y);	

		System.out.println("-----------------------");		
		z = x++;	// 12
		System.out.println("z=" + z); 	
		System.out.println("x=" + x);
		
		System.out.println("-----------------------");		
		z = ++x;
		System.out.println("z=" + z);	//
		System.out.println("x=" + x);	//
		
		System.out.println("-----------------------"); // 14, 8				
		z = ++x + y++; 
		System.out.println("z=" + z);	// 15 + 8 : 23
		System.out.println("x=" + x);	// 15	
		System.out.println("y=" + y);	// 9

	}

}
