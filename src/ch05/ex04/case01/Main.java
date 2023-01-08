package ch05.ex04.case01;

public class Main {
	public static void main(String[] args) {
		System.out.printf("%d, %d", Card.width, Card.height); //Card클래스에있는 width.
		
		Card.width = 10; //존재함
		Card.height = 20;
		
		//Card.kind; //존재하지 않음.인스턴스멤버 
		//Card.number;
		
		Card card1 = new Card();
		Card card2 = new Card();
		
		card1.kind = "heart"; //card1.kind 접두사 ............
		card1.number = 7;
		
		card2.kind = "spade";
		card2.number = 4;
		
		System.out.printf("\n%s, %s\n", card1.kind, card2.kind);
		System.out.printf("%d, %d\n", Card.width, Card.height); //위엔 객체생성전, 이건 객체 생성 후.
		System.out.printf("%d, %d\n", card1.width, card1.height); //노란줄은 에러X 경고. 이렇게 쓰지말라 왜? 
		//Static변수 는 객체.ㅇㅇㅇ / 인스턴스변수는 클래스.ㅇㅇㅇㅇ 
		
		card1.width = 100;
		System.out.printf("%d, %d\n", card1.width, card2.width);
 	}
}