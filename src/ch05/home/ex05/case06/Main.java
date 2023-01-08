package ch05.home.ex05.case06;

public class Main {
	public static void main(String[] args) {
		Phone phone = new Phone();
		Person person = new Person();
		
		phone.setMakerName("삼성");
		phone.setPrice(1_000_000);
		
		person.setName("최한석");
		
		person.setPhone(phone); //이때! 폰과 한석이 관계를 맺음. person has a phone
		
		person.sendMsg();
		person.call();
		person.playGame();
	}
}
/*
최한석은 삼성폰을 1백만원 주고 샀다.
손에 든 폰을 보니 흐뭇하다.

메시지를 보내봅니다.
답장이 없이, 전화를 걸어보니, 연결이 안 되네요.
잠시 뒤에 다시 연락해 봅니다.
기다리는 동안 폰으로 게임합니다.
*/