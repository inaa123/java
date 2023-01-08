package ch07.ex04.case03;

public class Cat {
	private String name;
	
	public Cat(String name) {
		this.name = name;
	}
	
	@Override
	public String toString( ) {
		return this.name;
	}
}
