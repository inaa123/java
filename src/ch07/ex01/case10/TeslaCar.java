package ch07.ex01.case10;

public class TeslaCar implements SelfCar {//하드웨어만들 목적
	private SelfCar os; //os가 필요해. os에는 구글이나애플이올것
	
	@Override
	public void start() {
		os.start(); //알고리즘 직접구현X고 디펜던시 알고리즘 이용할 것.
	}
	
	public void setOS(SelfCar selfCar) {
		this.os = selfCar;
	}
}
