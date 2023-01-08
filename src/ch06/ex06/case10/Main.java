package ch06.ex06.case10;

public class Main {
	public static void main(String[] args) {
		BusCard card = new BusCard() {//이 블럭은 클래스블럭,  buscard상속받은 이름없는 클래스,
			@Override
			public void tagOn() {
				System.out.println("tag On");
			}
			
			@Override
			public void tagOff() {
				System.out.println("tag Off");
			}
		}; //할당연산자 붙여야함! //이름이없는 클래스기 때문에 한번밖에 못씀. newClass하면 끝임.
		
		card.tagOn();
		card.tagOff();
	}
}
//안드로이드의 코딩스타일