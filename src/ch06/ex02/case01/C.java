package ch06.ex02.case01;

public class C extends A {
	public void test() {
		int x = 0;
		
		//클래스B와 객체의 변수명?만 다를뿐 같다.
		//x = this.a; this는 C객체 자신. 상속받은A클래스의멤버여도 private이면 사용X
		x = this.b;
		x = this.c;
		x = this.d;
		
		//this.m1(); private은 자식도 못써 나만 쓸 수 있어!
		this.m2();
		this.m3();
		this.m4();
	}
	
}
