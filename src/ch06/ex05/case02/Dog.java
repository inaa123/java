package ch06.ex05.case02;

public class Dog extends Animal{
	private int age;
	
	public Dog(int age) {
		super(age);
		this.age = age;
	}
	
	//override하지않으면 main클래스실행시 animal클래스의 getAge값이 나옴.
	@Override
	public int getAge() {
		return this.age;
	}
}
