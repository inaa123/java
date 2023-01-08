package ch05.ex05.case06;

public class Shooter {
	//총잡이가 총을 갖고 있다. 
	private Gun gun; //dependency 
	
	public void fire() { //총잡이가 총을 쏜다. 그러나 총잡이가 쏘는게 x 
		gun.fire(); //총에 의존한다. has a 관계에서 A는 B에 의존(사용한다.)
	}

	public Gun getGun() {
		return gun;
	}

	public void setGun(Gun gun) {
		this.gun = gun;
	}
}
//Shooter has a gun표현하기 