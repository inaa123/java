package ch06.ex02.case02;

public class Friend {
	public void play() {
		Parent parent = new Parent(); //친구가 아버지를 딱 만남.
		
		//parent.getRegNum(); 주민번호는 묻지 못함.
		parent.getName(); 
		parent.getMoney(); //같은패키지면 물어볼 수 잇음.
		parent.addMoney(1000);
	}
}
