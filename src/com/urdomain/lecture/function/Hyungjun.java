package com.urdomain.lecture.function;

import java.util.Scanner;

public class Hyungjun {
	
	public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print(">");
        String name = input.nextLine();
        func(name);
        System.out.println("을 추천드립니다.");

    }

    public static void func(String name){

        System.out.print(name + "님 오늘 먹을 메뉴를 선택해 주세요 : ");
        Menu();

    }

    public static void Menu(){
        String[] menu = {"1. 중식",  "2. 일식", "3. 한식"};

        System.out.println();
        for(int i = 0; i < menu.length; i++){
            System.out.println(menu[i]);
        }
        Scanner input = new Scanner(System.in);
        int n = (int)(input.nextInt() -1);
        String[] array = view(n);
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

    }

    public static String[] view(int n){
        String result[][] = {{"자장면", "짬뽕", "탕수육"}, {"초밥", "돈까스 덮밥", "가스오우동"}, {"김치볶음밥", "비빔밥"} };

        return result[n];
    }

}
