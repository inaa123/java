package ch06.ex06.case06;

public class Fridge implements HomeAppliance {
	//인터페이스로 상속하면 코드를 줄일 수 있다. 간단하잖아. 부모클래스 한번만 받아도됨!
	@Override public void on() {}
	@Override public void off() {}
	
	@Override public void displayMsg() {}
	@Override public int getTemperature() { return 0; }
	@Override public String getModelName() { return null; }

}
