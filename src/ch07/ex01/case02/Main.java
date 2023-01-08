package ch07.ex01.case02;

public class Main {
	public static void main(String[] args) {
		C c = new C();
		B b = c;
		A a = c;
		Object o = c; //A클래스 A object가 생략되어있음. 꼭대기에 있는 object를 루트라고함.
		
		c = (C)o;
		c = (C)a;
		c = (C)b;
		
		b = (B)a;
		
	}
}
