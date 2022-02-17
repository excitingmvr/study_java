package com.urdomain.lecture.function;

public class Youngmin {
	
public static void main(String[] args) {
		
		System.out.println(menu("한식"));
		
	}
	
	public static String menu(String a) {
		
		String[] todaysmenu = {"칼국수", "파스타", "라멘", "짜장면"};
		
		String value = "";
		
		switch(a) {
		case "한식":
			value = todaysmenu[0];
			break;
		case "양식":
			value = todaysmenu[1];
			break;
		case "일식":
			value = todaysmenu[2];
			break;
		case "중식":
			value = todaysmenu[3];
			break;
		default:
			value = "공기밥";
			break;
		}
		return "오늘의 메뉴는 " + value + "입니다.";
	}

}
