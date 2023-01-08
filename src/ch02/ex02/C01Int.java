package ch02.ex02;

public class C01Int {
	public static void main(String[] args) {
	int x = 10; //decimal
	System.out.println(Integer.toBinaryString(x)); //이진수, (리턴)타입은 String
	
	x = 012; // octal, 그냥 12면 십진수 12, 컴파일러에게 8진수임을 알리기 위해 맨앞에 0을 붙임
	System.out.println(Integer.toBinaryString(x));
	
	x = 0xA; //hexa 16진수 
	System.out.println(Integer.toBinaryString(x));
	
	x = 0b1010; // binary 이진수
	System.out.println(Integer.toBinaryString(x));
	
	x = 1_234_567; //숫자 천단위 구분 시 ,가 아닌  _언더사용. 리터럴에도 _사용가능해짐~
	System.out.println(x + 1);
	
	double y = 1e1; // 1 * 10의 1승 , 지수로 나타낼땐 double사용
	System.out.println(y);
	}
}
