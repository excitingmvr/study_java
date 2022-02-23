package com.urdomain.lecture.ch06;

public class EarchExample {

	public static void main(String[] args) {
		
		System.out.println("지구의 반지름: " + Earth.EARTH_RADIUS + " km");
		System.out.println("지구의 표면적: " + Earth.EARTH_SURFACE_AREA + "  km^2");
		
		Earth earth = new Earth();
		System.out.println("earth.EARTH_RADIUS: " + earth.EARTH_RADIUS);
		
		
		System.out.println("Math.PI: " + Math.PI);
		
//		PersonSecond personSecond = new PersonSecond("112312312-123123", "전지현");
//		
//		System.out.println(personSecond.ssn);
		
	}

}
