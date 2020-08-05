package com.javaex.basic;

public class TypeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		floatDouble();
		booleanEx();
		charEx();
	}
	
	
	// char 형 연습
	public static void charEx() {
		// 2바이트(부호없음)
		// 유니코드 한 글자의 수치화된 코드
		// ' <- char
		// " <- String
		char ch1 = 'A';
		char ch2 = '한';
		
		System.out.println("A ->"+ch1);
		System.out.println("B =>"+ch2);
		
		System.out.println(ch1+ch2);
		
	}
	// boolean 연습
	public static void booleanEx() {
		// 논리값 tru or false
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1);
		System.out.println(b2);
		
		int v1 = 3;
		int v2 = 5;
		
		boolean result = v1 < v2;
		System.out.println("v1 < v2 1? "+result);
		
	}
	
	
	
	public static void floatDouble() {
		
		float fVar;
		double dVar;
		
		fVar = 0.1234567890123456789F;
		dVar = 0.1234567890123456789;
		
		System.out.println("float:"+fVar);
		System.out.println("double:"+dVar);
		
		// 지수 표기법
		fVar = 1234567890E-10F;
		System.out.println(fVar);
		
		// 실수 자료형의 처리는 정밀도가 떨어진다(표현 범위를 넓힘)
		System.out.println(0.1 * 3);
		// 금융권 같은 정밀도를 요구하는 개발에는 float, double
		// 사용은 유의해야 한다.
	}

}
