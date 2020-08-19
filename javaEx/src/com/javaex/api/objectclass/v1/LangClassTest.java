package com.javaex.api.objectclass.v1;

public class LangClassTest {

	public static void main(String[] args) {
		Point p = new Point(10, 20);
		
		
		//	JAVA의 최상의 클래스는 Object
		//	모든 클래스는 Object 클래스의
		//	모든 기능을 물려받는다
		//	Object로부터 물려받은 내용들
		System.out.println(p.getClass().getSimpleName());
		System.out.println(p.hashCode()); //	객체 식별 코드
		System.out.println(p.toString()); 
		System.out.println(p);	//	toString() 코드와 동일
		
		//	부모 정보의 확인
		System.out.println(p.getClass()
				.getSuperclass().getName());
		
		// toString : print 혹은 문자열과 연결될 때 호출되어서
		//	출력 값을 지정
		
		
	}

}
