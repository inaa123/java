package ch07.ex04.case06;

public class Dog implements Animal{
	private String name;
	
	public Dog(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
