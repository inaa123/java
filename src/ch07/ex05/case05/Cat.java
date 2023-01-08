package ch07.ex05.case05;

public class Cat {
	private String name;
	
	public Cat(String name) {
		this.name = name;
	}
	
	public void eat() { //고양이가 먹다
		System.out.println(this.name + ", 먹다."); //누가먹는지 선택가능
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}