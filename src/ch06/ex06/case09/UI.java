package ch06.ex06.case09;

public interface UI {
	//인터페이스에서 스태틱메소드 만들 수 있다.
	static void in() {
		System.out.println("키보드로 입력하다.");
	}
	
	void out();
	
}
