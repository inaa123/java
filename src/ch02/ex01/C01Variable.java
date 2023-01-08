package ch02.ex01;

public class C01Variable {
	public static void main(String[] args) {
		boolean bl = false;  //boolean의 기본값은 false이다. b1을 false로 초기화. boolean은 1바이트 크기
		bl = true; //b1값이 false에서 true값으로 변경.
		byte b = 0; //byte는 정수값. 
		short s = 0; //2byte크기
		char c = 0; //2바이트
		int i = 0;
		long l = 0L; //L안 붙여도 문제 없음
		float f = 0.0f; //f 안붙이면 컴파일 도중 에러.(빨간줄) //f 안붙이면 0.0으로 double과 동일해짐 크기가 안맞음.
		double d = 0.0; //8바이트
		
		// String str = 0; 타입이 맞지 않음. String은 문자열타입 0은 정수
		String str = ""; //empty string
		
		//변수명은 유일해야 한다. 
		int a;
		a = 0;
		
		int x;
		int y;
		// int x, y; (x y변수 동시에 선언 가능. But 가독성이 없음)
		
		int x2, y2 = 0; //초기값 동시선언 가능 
	}
}
