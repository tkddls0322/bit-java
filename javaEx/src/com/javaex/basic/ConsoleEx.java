package com.javaex.basic;
import java.util.Scanner;

public class ConsoleEx {

	public static void main(String[] args) {
		consoleOutput();
		consoleInput();
	}
	
	// 콘솔 출력
	public static void consoleOutput() {
		// System.out.print -> 출력 후 개행 없음
		// System.out.println -> 출력 후 개행
		// System.out.printf
		// 		-> 형식화된 출력 : String 할때 정리
		System.out.println("----- 콘솔 출력 -----");
		System.out.print("Hello ");
		System.out.println("Java");
		
		System.out.println("Hello\nJava");
		System.out.println("Hello\tJava");
		System.out.println("Hello\"Java\"");
		System.out.println("Hello\\Java");
		
		// 파일을 다뤄야 하는데
		// C:\mydir\myfile.txt
		
		String dir = "C:\\mydir\\myfile.txt";
		System.out.println(dir);
		
	}
	
	public static void consoleInput() {
		System.out.println("----- 콘솔 입력 -----");
		Scanner scan = new Scanner(System.in);
		
		System.out.print("당신의 이름은 ? : ");
		String name = scan.nextLine();
		System.out.print("당신의 나이는 ? : ");
		int age = scan.nextInt();
		
		System.out.println("이름 : "+name+"\n나이 : "+age);
		scan.close();
		
	}

}
