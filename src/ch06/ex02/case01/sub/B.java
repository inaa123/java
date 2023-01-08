package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;

public class B {
	public void test() {
		//A a = new A(); 컴파일에러 :  sub패키지에 A클래스가 없다.
		A a = new A(); //import해서 A클래스의 위치를 컴파일러에게 알려줌.
		
		int x = 0;
		//x = a.a;
		//x = a.b; default b도 에러 => 같은 패키지에선 접근가능, 다른패키지는 접근X
		//x = a.c; protected도 같은패키지는 접근가능, 다른패키지는 접근불가능
		x = a.d; //public은 가능
		
		// a.m1(); private이어서안보임
		//a.m2(); 다른패키지여서 안 보임
		//a.m3(); 다른 패키지여서 안 보임
		a.m4();
	}
}
