package ch06.ex06.case03;

//인터페이스 상속받을 시 implements. (class상속은 extends) 
public class Fridge implements Appliance {
	//인터페이스 상속시 오버라이드가 전제..?
	@Override
	public void on() {
		System.out.println("냉장고를 켜다.");
	}
	
	@Override
	public void off() {
		System.out.println("냉장고를 끄다.");
	}
}
