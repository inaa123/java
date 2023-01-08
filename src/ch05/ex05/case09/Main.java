package ch05.ex05.case09;

public class Main {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		cat1.setName("늠름이"); //엄마고양이
		
		Cat cat2 = cat1.breed(); //엄마고양이 새끼고양이낳음 => Cat타입 cat2에 담자.
		cat2.setName("튼튼이");
		
		//메소드 태어난 이유 : 중복코드 제거하기 위해
		
	}
}
