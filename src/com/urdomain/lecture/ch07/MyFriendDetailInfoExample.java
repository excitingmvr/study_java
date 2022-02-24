package com.urdomain.lecture.ch07;

public class MyFriendDetailInfoExample {

	public static void main(String[] args) {

		MyFriendDetailInfo myFriendDetailInfo = new MyFriendDetailInfo();
		
		myFriendDetailInfo.setName("이순신");
		myFriendDetailInfo.setAge(50);
		myFriendDetailInfo.setAddress("서울특별시 강남구 어디동");
		myFriendDetailInfo.setPhone("010-9999-9999");
		
		System.out.println("이름: " + myFriendDetailInfo.getName());
		System.out.println("나이: " + myFriendDetailInfo.getAge());
		System.out.println("주소: " + myFriendDetailInfo.getAddress());
		System.out.println("전화: " + myFriendDetailInfo.getPhone());
		
	}

}
