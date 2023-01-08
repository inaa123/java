package ch05.ex05.case02;

public class Calculator {
	public double add(int a, int b) {
		return a + b; //a+b의 값이 프로모션되서 double값으로 리턴됨
	}
	
	public double add(double a, double b) {
		return a + b;
	}
}
