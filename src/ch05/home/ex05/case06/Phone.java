package ch05.home.ex05.case06;

public class Phone { //삼성. 백만원 가치 ㅇ 생각 = 멤버변수 ㅇ, 가치x = 멤버변수x 
	private String makerName; //maker X => phone has a maker는 이상. 
	private int price;
	
	public void sendMsg() {}
	public void call() {}
	public void playGame() {} //메서드 이름은 동사
	
	public void setMakerName(String makerName) {
		this.makerName = makerName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	//Getter와 Setter => Getter지움.
}
