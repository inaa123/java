package ch05.ex07.case02;

public class Stack {
	public static void first() { //first는 스택에 생긴다.
		System.out.println("Stack.first()시작.");
		int a = 0; 
		Stack.second(); 
		System.out.println("Stack.first()끝.");
	}
	
	public static void second() {
		System.out.println("Stack.second()시작.");
		int a = 0; 
		System.out.println("Stack.second()끝.");
	}
	
}
