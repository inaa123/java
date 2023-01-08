package ch06.ex02.case02.sub;

import ch06.ex02.case02.Parent;

public class Child extends Parent { //다른동네사는 자식 
	public void play() {
		//this.getRegNum(); private접근X
		this.getName();
		this.getMoney(); //protected 자식은 접근가능
		//this.addMoney(1000);
	}
}
