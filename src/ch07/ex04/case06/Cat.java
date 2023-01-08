package ch07.ex04.case06;

public class Cat implements Animal {
	private String name;
	
	public Cat(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
