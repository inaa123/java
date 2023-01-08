package ch07.ex01.case09;

public class Shooter { //has a Gun
	private Gun gun; //defendency
	
	public void fire() {
		this.gun.fire();
	}
	
	public void setGun(Gun gun) { //디펜던시 타입은 인터페이스로 둔다! => why? 확장성위하여
		this.gun = gun;
	}
}
