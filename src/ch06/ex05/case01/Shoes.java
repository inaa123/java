package ch06.ex05.case01;

public class Shoes extends Product { //Shoes에는 price가 두개야... 안보이지만 부모의 멤버변수도..있ㄷ음...
	private int price; //멤버변수가 부모와 똑같음.
	
	public Shoes(int price) {
		super(price);
		this.price = price;
	}
}