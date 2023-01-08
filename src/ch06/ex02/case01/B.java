package ch06.ex02.case01;

public class B {
	public void test() {
		A a = new A(); //누가test메소드콜하면 A객체 생성할 것(당연 B객체가 존재하는상태에서 실행,B.test로할거기때문)
		
		int x = 0;
		//x = a.a; => 컴파일에러 : A객체의 a는 private접근자,A객체내부사용ㅇ,외부 사용X)
		x = a.b;
		x = a.c;
		x = a.d;
		
		//a.m1(); 메소드도 마찬가지. private이기때문. 존재하지만 존재하지 않은것
		a.m2();
		a.m3();
		a.m4();
		
	}
}
