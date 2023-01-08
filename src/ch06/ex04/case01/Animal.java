package ch06.ex04.case01;

public class Animal {
	private String name;
	
	//public Animal() {} //2 Cat클래스 super()오류 난거 해결!
	
	//생성자 정의 (직접) Animal엔 기본생성자X
	public Animal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
