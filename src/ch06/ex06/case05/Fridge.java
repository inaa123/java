package ch06.ex06.case05;

import ch06.ex06.case03.Appliance;

public class Fridge implements Appliance, Electronic {
	@Override public void on() {}
	@Override public void off() {}
	
	@Override public void displayMsg() {}
	@Override public int getTemperature() { return 0; }
	@Override public String getModelName() { return null; }
	
 }
//implements 다음엔 인터페이스하나, 클래스하나,  n개사용가능.
//extends 1개, implements n개!