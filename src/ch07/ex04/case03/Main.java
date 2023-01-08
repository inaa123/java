package ch07.ex04.case03;

public class Main {
	public static void main(String[] args) {
		Cat[] cats = new Cat[3]; //고양이 집을 만듦. 고양이가 들어갈 멤버변수.
		
		cats[0] = new Cat("헤롱이");
		cats[1] = new Cat("야코미");
		cats[2] = new Cat("새코미");
		
		//cats[2] = new Dog(); => X
		
		for(Cat cat: cats) System.out.println(cat);
	}
}
