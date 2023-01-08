package ch07.ex04.case07;

public class Main {
	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		
		animals[0] = new Cat();
		animals[1] = new Snake();
		animals[2] = new Snake();
		
		//동물의 관점으로 하나씩 꺼내기
		for(Animal animal: animals)
			animal.eat(); //개나 뱀으로 본게 아니라 아무거나 먹어라
	}
}
