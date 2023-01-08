package ch07.ex05.case05;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
	public static void main(String[] args) {
		//2층고양이집 만들기! 먼저 1층부터
		List<Cat> floor1 = new ArrayList<>();
		List<Cat> floor2 = new ArrayList<>();
		List<List<Cat>> house = new ArrayList<>(); //floor1,2 조립할려고!		
		
		//집에 고양이 넣기
		for(int i = 0; i < 3; i++) {
			floor1.add(new Cat("고양이" + i));
			floor2.add(new Cat("야옹이" + i));
		}
		
		System.out.printf("%s\n%s\n", floor1, floor2);
		
		//1층2층집 만들기
		house.add(floor1);
		house.add(floor2);
		System.out.println(house);
		
		//과제] 고양이 여섯마리에게 밥을 먹이세요.
		for(List<Cat> floor: house) //house를 floor에 담겠다. cat도 끄낼 수 있다.
			for(Cat cat: floor) cat.eat();
	} 
}
