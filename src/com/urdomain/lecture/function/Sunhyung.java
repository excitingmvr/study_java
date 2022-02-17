package com.urdomain.lecture.function;

import java.util.Scanner;

public class Sunhyung {
	
	public static String[] food(String a) {
		String[] foods = new String[3];
		
		switch (a) {
		case "중식":
			foods = new String[] { "짜장면", "짬뽕", "우동" };
			break;
		case "일식":
			foods = new String[] { "초밥", "라멘", "소바" };
			break;
		case "양식":
			foods = new String[] { "스테이크", "스파게티", "리조또" };
			break;
		case "한식":
			foods = new String[] { "냉면", "제육볶음", "김치찌개" };
			break;
		}

		return foods;
	}

	public static void print(String[] a) {
		int i = (int) (Math.random() * 3);

		System.out.println("오늘 추천 드리는 메뉴는 " + a[i] + "입니다");

	}

	public static void main(String[] args) {
		System.out.print("먹고 싶은 음식 종류를 입력해주세요 (일식,양식,중식,한식)>>");
		Scanner sc = new Scanner(System.in);
		String foodtype = sc.nextLine();
		
		
		print(food(foodtype));

	}

}
