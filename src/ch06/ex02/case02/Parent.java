package ch06.ex02.case02;

public class Parent {
	//개인정보
	private String regNum;
	private String Name;
	private int money;
	
	//getter만 사용
	private String getRegNum() { //주민번호는 private
		return regNum;
	}
	
	public String getName() {
		return Name;
	}
	
	protected int getMoney() { //자식에만 보이게 하기 위해.(상속 = protected)
		return money;
	}
	
	void addMoney(int money) { //setMoney보다 add머니가 더 ㅇㅇ에 가까워서 사용함
		this.money += money;  //add머니는 디폴트
	}
}
