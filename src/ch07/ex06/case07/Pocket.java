package ch07.ex06.case07;

import java.util.List;

public class Pocket {
	{//인스턴스블럭
		int i = 1 * 2;
		double d = 1.0 * 2.0;
		i = new Integer(1) + new Integer(2);
		d = new Double(1.0) + new Double(2.0);
	//Integer클래스는 Number를 상속받음.
	//Double클래스는 Number를 상속받음.
	
		//new Number(1) * new Number(2) => Number는 추상클래스?여서 불가능
	}
	
	//unbounded wildcard
	public void printList(List<?> List) { 
		System.out.println(List);
	}
	
	//upper bounded wildcard
	public double add(List<? extends Number> list) {//리턴 타입 double
		double sum = 0;
		//for(Integer i: list) //더블이 될지 모름. add가 호출될때 정해짐
		//for(Double i: list) //integer였으면 double로 프로모션, double이면 double
		for(Number n: list) sum += n.doubleValue(); //넘버타입은 계산X BUT doublevalue가 있음
		
		return sum;
	}
	
	//lower bounded wildcard 하한...
	public List<? super Integer> add2(List<? super Integer> list) {
		return list;
	}
}
