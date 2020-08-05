package com.javaex.basic;

public class TypeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		floatDouble();
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
