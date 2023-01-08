package ch03.ex04;

public class C01Artih {
	public static void main(String[] args) {
		byte a = 3;
		byte b = 2;
		//byte c = a + b;
		byte c = (byte)(a + b);//[과제2]casting과 할당연산자 등으로 컴파일 에러를 해결하라.
		System.out.println(c);
		
		//c = c + 1;
		c++;
		System.out.println(c);
		
		double d = a / b;
		System.out.println(d); // =>버그의 원인 : overflow
		
		//[과제]버그 해결
		//d = (double)a / (double)b; Me
		d = (double)a / b;
		//d = 1.0 * a / b; 방법2
		//d = a / b * 1.0; 버그. 이건X
		System.out.println(d);
	}
}
