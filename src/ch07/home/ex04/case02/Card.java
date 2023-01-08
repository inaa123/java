package ch07.home.ex04.case02;

public class Card {
	//각각의카드를 인덱스로 구분했음.
	private int num;
	
	public Card(int num) {
		this.num = num;
	}
	
	@Override
	public String toString() {
		return this.num + " ";
	}
}
