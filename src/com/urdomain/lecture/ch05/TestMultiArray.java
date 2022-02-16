package com.urdomain.lecture.ch05;

public class TestMultiArray {

	public static void main(String[] args) {

		
		String[][] bbs = {
				{"필독", "2022 대학별 추가합격 순위 결과! 과연 올해는?! [4]", "편입의신", "2022.02.15", "404"},	
				{"필독", "[편입 합격기념 초대박 이벤트]전원 5천원 증정+간식 대방출! [37]", "편입의신", "2022.01.28", "1,497"},	
				{"공지", "편입 성적 [3] new", "광탈러", "01:30", "151"},	
				{"공지", "시험보면서 느꼈던 학교 캠퍼스 특징 [1] new", "alikj22", "11:30", "108"},	
				{"공지", "편입영어 문법 핵심노트+편입수학 미적분 문제집 무료! [4] new", "편입의신", "01:04", "29"},	

		};
		
		for (int i=0; i < bbs.length; i++) {
			for(String bb : bbs[i]) {
				System.out.print(bb + "\t");
			}
			System.out.println();
		}
	}
}
