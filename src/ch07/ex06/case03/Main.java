package ch07.ex06.case03;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Animal> zoo = new ArrayList<>();
		//팩토리 메소드안쓸때
		zoo.add(new Tiger());
		zoo.add(new Falcon());
		
		zoo.clear(); //list에 있는 clear메서드 : list의 원소 초기화
		zoo.add(Cosmos.getAnimal("호랑이"));
		zoo.add(Cosmos.getAnimal("매"));
		
		for(Animal animal: zoo) {
			animal.eat();
			animal.move();
		}
	}
}
