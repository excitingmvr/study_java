package com.urdomain.lecture.ch06;

public class PersonExample {

	public static void main(String[] args) {
		
		Person person = new Person("123456-1234567", "전지현");
		
		System.out.println(person.nation);
		System.out.println(person.ssn);
		System.out.println(person.name);
		
//		person.nation = "usa";
//		person.ssn = "654321-7654321";
		person.name = "고소영";

	}

}
