package ch05.ex03.case02;

public class Main {
	public static void main(String[] args) {
		Tv tv1 = new Tv(); //tv한 대.주소값다름(vm은 주소값)
		Tv tv2 = new Tv(); //tv두 대.주소값다름(vm은 주소값으로)
		
		System.out.printf("%s\n%s\n\n", tv1, tv2);
		System.out.printf("%s\n%s\n\n", tv1.getColor(), tv2.getColor());
		
		tv1.setColor("red");
		System.out.printf("%s\n%s\n\n", tv1.getColor(), tv2.getColor());
		
		tv2 = tv1; //tv1과 tv2의 타입이 같기때문에 할당 가능
		System.out.printf("%s\n%s\n\n", tv1, tv2); //tv1을 복사해서 tv2에 넣었기 때문에 주소같음
		System.out.printf("%s\n%s\n\n", tv1.getColor(), tv2.getColor());
	}
}
