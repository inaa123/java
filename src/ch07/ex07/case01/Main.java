package ch07.ex07.case01;

public class Main {
	public static void main(String[] args) {
		Human human = () -> System.out.println("hello");//say메서드가 human에 저장, say메서드가 HUMAN타입이니까
		human.say();
	}
}
