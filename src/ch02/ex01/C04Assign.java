package ch02.ex01;

public class C04Assign {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		System.out.printf("%d, %d\n", a, b);
		
		a = b; //a변수의 값 1은 덮어쓰기 됨. but 기존의 상수 1은 존재함.
		System.out.printf("%d, %d\n", a, b);
		
		a = b = 2;
		System.out.printf("%d, %d\n", a, b);
		
		double d = Math.random();
		System.out.printf("%.2f", d);
	}
}
