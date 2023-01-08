package ch07.ex01.case07;

public class Main {
	public static void main(String[] args) {
		Human human = new Human();
		Kimchi kimchi = new Kimchi();
		Ramen ramen = new Ramen();
		
		human.eat(kimchi);
		human.eat(ramen);
		human.eat(new Apple());
	}
}
//다형성을 이용하면 앱 확장가능!! 인터페이스 이용이유 확장성때문!!