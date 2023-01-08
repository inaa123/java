package ch05.ex09.case01;

public class Main {
	public static void main(String[] args) {
		new Init();
		new Init(); //바이트코드 로딩 안돼서 static블럭 실행 X. 인스턴스블럭이 생성자보다 먼저 실행된다.
		//인스턴스블럭과 생성자의 공통점은. 객체 생성 후 실행되는데. 발생순서 인스턴스 먼저임.
		
		//인스턴스 블럭만든 이유
		new Init(1); //인스턴스와 생성자 차이는? 인스턴스블럭은 "실행"된다. 어떤 ㅇㅇㅇ를하든
					//그러나 생성자는 콜해야지 실행함.	
	}	
}
