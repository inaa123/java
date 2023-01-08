package ch06.ex01.case01;

public class Main {
	public static void main(String[] args) {
		Leopard leopard = new Leopard();
		Lion lion = new Lion();
		
		leopard.run();//S V
		lion.run();
		//달린다 라는 행동에만 관심있을 시 run메서드 중복! = > 중복제거.
		
	}
}
