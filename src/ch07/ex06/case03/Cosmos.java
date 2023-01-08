package ch07.ex06.case03;

public class Cosmos { //팩토리 메서드. 동물의 이름을말만하면 우주가 줄거임
	public static Animal getAnimal(String animalName) {
		Animal animal = null;
		
		switch(animalName) {
		case "호랑이": animal = new Tiger(); break;
		case "매": animal = new Falcon();
		}
		
		return animal;
	}
} 
