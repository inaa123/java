package ch07.ex01.case01;

public class Main {
	public static void main(String[] args) {
		C c = new C();
		B b = c; //c->b 자식타입이 부모타입으로 프로모션 
		A a = c; //c->a 자식타입이 부모타입으로 프로모션 
		//여기까지 시행 시 객체는 1개임! new한번, 타입만 요리죠리 바꾸는 것
		
		c = (C)a; //A타입을  C타입으로 바꾼게 c에 들어감.
		c = (C)b;
		//타입 = 객체 모양. 타입이 객체가아님. 객체 클래스를 바꾸는 것임.
		
		b = (B)a; //A타입을 B타입으로 바꾼 후 할당
		//객체가 가지고 있는 타입 내에서만 가능함.
		
		//String s = (String)c; 에러 : C에는 String타입이 없기 때문
	}
}
