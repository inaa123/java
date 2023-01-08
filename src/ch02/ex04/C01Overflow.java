package ch02.ex04;

public class C01Overflow {
	public static void main(String[] args) {
		byte b = 10;
		int i = b; //byte10 -> int 10 promotion,casting
		i = (int)b; // casting, promotion 
		System.out.println(i); //promotion되는 거는 Overflow발생 x
		
		//overflow발생하는 경우
		int i2 = 300;
		byte b2 = (byte)i2;//i2를 byte 캐스팅연산자 사용 캐스팅리턴값을 복사해서 b2에 넣음.
		System.out.println(b2); //변질된 현상 : overflow
	}
}
