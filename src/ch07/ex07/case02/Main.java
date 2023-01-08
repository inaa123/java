package ch07.ex07.case02;

public class Main {
	public static void main(String[] args) {
		Human human = () -> System.out.println("Human say.");
		human.say();
		Human.walk();
		//human.walk();
		human.sleep(); // 람다에서 default메소드 사용가능?
		
		human = new Student();
		human.say();
		//human.walk(); Student엔 walk메서드 없음
		human.sleep();
	}
}
