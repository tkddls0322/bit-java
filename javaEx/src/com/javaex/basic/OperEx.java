package com.javaex.basic;

// 연산자 연습
public class OperEx {
	public static void main(String[] args) {
		arithOper();
		incDecOper();
		logicalOper();
		bitOper();
		conditionalOper();
	}
	
	// 3항 연산자
	public static void conditionalOper() {
		System.out.println("----- 3항 연산 -----");
		// 논리비교 ? 참일때 : 거짓일때
		int a = 10;
		// a가 짝수면 "짝수", 아니면 "홀수" 문자열
		String message = a % 2 == 0 ? "짝수" : "홀수";
		System.out.println("a는 짝수입니까 ? " + message);
		
		int score = 65;
		// 점수 80이상 Good 
		// 50이상 Pass
		// 나머지 Fail
		
		message = score >= 80 ? "Good" : score >= 50 ? "Pass" : "Fail";
		System.out.println("시험점수 : "+score+"\n"+"시험결과 : "+message);
		// 중첩 가능하긴 하지만 가독성 떨어짐
		
		
	}
	
	
	// 비트연산자
	public static void bitOper() {
		// and (&), or(|), not (~)
		// 정수형 데이터를 비트 단위로 제어하는 연산자
		System.out.println("----- 비트 연산 -----");
		byte b1 = 0b1101;
		byte b2 = 0b0111;
		System.out.println(b2);
		
		int result = b1 & b2; // bit and 연산
		System.out.println(Integer.toBinaryString(result));
		
		result = b1 | b2; // bit or 연산
		System.out.println(Integer.toBinaryString(result));
		
		result = ~b1;// bit not 연산 0 <-> 1
		System.out.println(Integer.toBinaryString(result));
		System.out.println(result);
		
		// 비트 시프트
		//		<< : 비트를 왼쪽으로 이동
		// 		>> : 비트를 오른쪽으로 이동
		
		int val = 1;
		System.out.println(val);
		System.out.println(Integer.toBinaryString(val << 1));
		
		val = 0b100;
		System.out.println(Integer.toBinaryString(val >> 2));
		
	}
	
	
	// 비교, 논리 연산
	public static void logicalOper() {
		System.out.println("----- 비교, 논리 연산 -----");
		int n = 5;
		boolean b1 = n > 0;
		boolean b2 = n < 10;
		boolean r = b1 && b2;
		boolean r2 = (n>0)&&(n<10);
		System.out.println("a is "+n);
		System.out.println("a > 0 and a < 10 ? "+r2);
		
		
		
		
	}
	
	
	
	
	// 증가, 감소 연산자
	public static void incDecOper() {
		System.out.println("----- 증가, 감소 연산자 -----");
		int a = 5;
		int b = 5;
		
		// 후위 연산자
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
		
		// 전위 연산자
		System.out.println(b);
		System.out.println(++b);
		System.out.println(b);
		
		
		
	}
		
	
	// 산술연산자
	public static void arithOper() {
		// 사칙연산
		int a = 7;
		int b = 3;
		
		System.out.println("7/3 => "+ (7/3));
		// int / int -> int(몫)
		System.out.println("7/3나머지 => "+7%3);
		
		// 정확학 실수값을 얻으려면 int -> float 변환
		System.out.println("7 / 3 실수 => "+((float)a/(float)b));
		
		// 만약 -> 정수를 0으로 나누면
		// ArithmeticException
		/*
		 *	System.out.println("정수나누기 0 => "+(a/0));
		 */
		// 실수를 0으로 나눈다.
		System.out.println("실수 / 0 => "+ 4.0/0);
		// Infinity는 숫자로도 본다
		System.out.println("무한대의 산술 => "+(4.0/0 - 10000000));
		// 연산 -> 계산할 수 없는 값(NaN -> Not a Number)
		System.out.println("0.0 / 0.0 => "+0.0/0.0);
		// 유한수인지 확인
		System.out.println("유한수의 확인 : "+Double.isFinite(4.0/0));
		// NaN인지 확인
		System.out.println("NaN 확인 => "+Double.isNaN(0.0/0.0));
		
		
	}

}
