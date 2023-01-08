package ch06.ex03.case03;

public class Main {
	public static void main(String[] args) {
		Duck duck = new Duck();
		Hen hen = new Hen();
		
		System.out.println(duck);
		System.out.println(hen); //toString오버라이드X , Object에 있는toString그대로 사용.
	}
}
