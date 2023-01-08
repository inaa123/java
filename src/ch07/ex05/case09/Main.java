package ch07.ex05.case09;

public class Main {
	public static void main(String[] args) {
		C c = new C(); //a,b,c타입 ㅇ
		String msg = "";
		//c객체는 C클래스의 인스턴스다. 맞으면 true출력.
		if(c instanceof C) msg += "C ";
		if(c instanceof B) msg += "B ";
		if(c instanceof A) msg += "A ";
		if(c instanceof Object) msg += "Object";
		System.out.println(msg);
		
		B b = new B(); //B, Object타입가짐
		msg = "";
		//c객체는 C클래스의 인스턴스다. 맞으면 true출력.
		if(b instanceof C) msg += "C "; //거짓
		if(b instanceof B) msg += "B "; //참
		if(b instanceof A) msg += "A "; //거짓
		if(b instanceof Object) msg += "Object"; //참
		System.out.println(msg);
		//instanceof옆에 쓴것은 상속관계로 엮인 것들만 적었음.
		
		//F는 엮여있지않은 클래스. 에러
		//if(b instanceof F)
		//if(c instanceof F)
		
		F f = new F();
		msg = "";
		if(f instanceof A) msg += "A"; //인터페이스는 자유롭게 쓸수있음. 클래스는 엮인것만 쓸수있다.
		System.out.println(msg);//에러도 X, 실행도 잘됨 (그러나 거짓이어서 출력x)
			
	}
}
