package ch06.ex06.case02;

import ch06.ex06.case01.Appliance;

public class Fridge extends Appliance {
	//상속값 오버라이딩
	@Override
	public void on() {
		System.out.println("냉장고를 켜다.");
	}
}
