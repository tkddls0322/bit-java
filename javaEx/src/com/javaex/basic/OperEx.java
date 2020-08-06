package com.javaex.basic;

// 연산자 연습
public class OperEx {
	public static void main(String[] args) {
		arithOper();
		incDecOper();
		logicalOper();
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
