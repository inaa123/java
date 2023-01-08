package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;
//상속할때도 A클래스 못찾음 => import해야해! 
public class C extends A {
	public void test() {
		int x = 0;
		
		//x = this.a; private
		//x = this.b; 다른패키지
		x = this.c; //다른패키지라도 자식이면 보여줌 : protected =>default와 차이
		x = this.d;
		
		//this.m1();
		//this.m2();
		this.m3();
		this.m4();
	}
	
}
