package ch05.ex07.case01;

public class Stack {
	public static void first() { //first는 스택에 생긴다.
		int a = 0; //first안의 a변수는 스택에 쌓인다.
		Stack.second(); //second가 static메소드니까 클래스이름 Stack.메소드로 
	}					//Stack에 a 변수 두개있음............... 	
	
	public static void second() {
		int a = 0; //메소드별로 지역변수 관리함. 다른 메소드에 동명 변수 생성가능
	}
	
}
