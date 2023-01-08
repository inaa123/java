package ch06.ex05.case02;

public class Animal {
	private int age;
	
	public Animal(int age) {
		this.age = 1000 * age;
	}
	
	public void shout() {
		System.out.println("À¸¸£¸ª.");
	}
	
	public int getAge() {
		return this.age;
	}
}