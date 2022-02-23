package com.urdomain.lecture.ch05;

class PersonSecond {
	
	final String nation = "Korea";		// 1번 초기화 방법
	final String ssn;
	String name;
	
	public PersonSecond(String ssn, String name) {		// 2번 초기화 방법
		this.ssn = ssn;
		this.name = name;
	}

}
