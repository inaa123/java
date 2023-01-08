package ch07.ex05.case02;

public class AutoBoxing {
	public static void main(String[] args) {
		int a1 = 1;
		Integer a2 = new Integer(1); //객체만들기....?
		int a3 = new Integer(1); //왼쪽은 int 오른쪽은 Integer 타입이 다름. 프로모션도X
		Integer a4 = 1;
		
		boolean b1 = true;
		Boolean b2 = new Boolean(true);
		//오토 언박싱
		boolean b3 = new Boolean(true); //기본타입 boolean에 Boolean클래스..를 언박싱해서 true 리터럴이 b3에 담김
		Boolean b4 = true;
		
 	}
}
