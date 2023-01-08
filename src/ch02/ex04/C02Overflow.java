package ch02.ex04;

public class C02Overflow {
	public static void main(String[] args) {
		//byte b = 128; //타입 mismatch byte - int
		byte b = 127;
		//b = b + 1; //컴파일에러
		
		//(하나의 연산자) ++쁠쁠연산자, b변수의 데이터를 읽어서 1더함/ 읽기 쓰기 가능 (1을가지고만)
		b++; //b의값을 읽고 1증가시켜 다시 b에 write한다.
		b++;
		System.out.println(b);
	}
}
