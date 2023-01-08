package ch02.ex02;

public class C02Char {
	public static void main(String[] args) {
		//char타입은 양수값!!
		char c = 'A'; //VM은 문자A가 아닌 유니코드 숫자를 c변수에 저장.
		System.out.printf("%c, %s\n", c, Integer.toBinaryString(c));
		
		c = 65; //A의 숫자값은 65.
		System.out.printf("%c, %s\n", c, Integer.toBinaryString(c));
		
		c = 0x0041; //0041은 컴파일은 10진수로 판단하기때문에 앞에 16진수임을 알리기 위한 0x를 넣어야함. 
		System.out.printf("%c, %s\n", c, Integer.toBinaryString(c));
		
		c= '\u0041'; // 역슬래시u(특수문자)는 유니코드값
		
		System.out.printf("%c, %s", c, Integer.toBinaryString(c));
	}
} 
