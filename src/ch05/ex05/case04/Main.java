package ch05.ex05.case04;

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog();
		
		dog.setName("왈왈이");
		dog.setBreed("진도개");
		
		dog.shout(); //개가 짖다.
		dog.eat(); //개가 먹다. 이야기 끝!
	}
}