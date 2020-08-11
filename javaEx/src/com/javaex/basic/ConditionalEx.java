package com.javaex.basic;

import java.util.Scanner;

public class ConditionalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ifElseEx();
//		ifElseEx2();
//		ifElseEx3();
//		switchEx();
//		whileEx();
//		dowhileEx();
		randomEx();
	}
	
	public static void randomEx() {
		// 복수번의 랜덤 (1~6)을 뽑아서 합산
		int rollCnt = 6; // 횟수
		int total = 0;	// 합산변수
		
		for (int i = 1; i <= rollCnt; i++) {
			// 랜덤으로 주사위 값을 추출
			int num = (int)(Math.random()*6)+1;
			System.out.println(i+"번재 주사위:"+num);
			total += num;
		}
		
		System.out.println("주사위 총합:"+total);
	}
	
	
	
	public static void dowhileEx() {
		int num = 0;
		int total = 0;
		
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("정수입력.[0이면종료]:");
			num = scanner.nextInt();
			total += num;
		}
		while(num != 0); {
			System.out.println("합산값:"+total);
			scanner.close();
		}
	}
	
	public static void whileEx3() {
		// while은 종료를 위한 제어 변수를 잘 제어하여
		// 무한루프에 빠지지 않도록 해야 한다
		// 경우에 따라서는 의도적으로 무한루프를 사용하기도 한다
		while(true) {	// 조건이 true면 항상 반족
			System.out.println("무한루프... ctrl+C to Quit");
		}
	}
	
	public static void whileEx2() {
		System.out.print("단을 입력:");
		Scanner scanner = new Scanner(System.in);
		int dan = scanner.nextInt();
		
		int i = 1;
		
		while (i<10) {
			System.out.println(dan + " * "+i+" = "+(dan*i));
			i++;
		}
	}
	
	public static void whileEx() {
		// 반복문사용, 1~100 숫자 합산 출력
		int num = 1;
		int total = 0;
		
		// while loop
		while (num<= 100) {
			total += num;
			System.out.println("num:"+num+"\ttotal:"+total);
			
			num++;
		}
	}
	
	
	
	public static void switchEx() {
		// ifElseEx3와 동일한 내용 작성
		Scanner scan = new Scanner(System.in);
		System.out.print("1:C, 2:C++, 3:Java, 4:Python - ");
		
		int code = scan.nextInt();
		switch(code) {
		case 1:
			System.out.println("R1");
			break; // 잊지 말자 break
		case 2:
			System.out.println("R2");
			break;
		case 3:
			System.out.println("R3");
			break;
		case 4:
			System.out.println("R4");
			break;
		default:
			System.out.println("관리자에문의");
		}
		
	}
	
	
	public static void ifElseEx3() {
		// 과목 번호 입력
		// 1~4 -> R101 ~ R404
		Scanner scan = new Scanner(System.in);
		System.out.print("1:C, 2:C++, 3:Java, 4:Python - ");
		
		int code = scan.nextInt();
		if (code == 1) {
			System.out.println("R101");
		} else if (code == 2) {
			System.out.println("R202");
		} else if (code == 3) {
			System.out.println("R303");
		} else if (code == 4){
			System.out.println("R404");
		} else {
			System.out.println("관리자문의");
		}
		
		
	}
	
	
	public static void ifElseEx2() {
		// 정수 입력
		// 0보다 크면 양수, 0이면 0, 0보다 작으면 음수 출력
		// if ~ else if ~ else
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를입력:");
		int num = scanner.nextInt();
		
//		if (num > 0)		System.out.println("양수");
//		else if(num == 0)	System.out.println("0");
//		else	 			System.out.println("음수");
		
		if (num == 0) {
			System.out.println("0");
		} else {
			if (num > 0) {
				System.out.println("양수");
			} else {
				System.out.println("음수");
			}
		}
		
		
		
		
	}
	
	public static void ifElseEx() {
		// Scanner 점수입력
		// 60점 이상 "합격"
		// 그렇지 않으면  "불합격"
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("input your score : ");
		int score = scanner.nextInt();
		
		// 판별
		if (score >= 60) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
		
	}

}
