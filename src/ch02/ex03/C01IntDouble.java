package ch02.ex03;

public class C01IntDouble {
	public static void main(String[] args) {
		int i = 1;
		double d = 0.0;
		
		d = i; //promotion, 할당연산자가 복사하는 데이터는 i변수의 데이터를 읽어서 프로모션한 상수의 1
		System.out.printf("%f, %d\n", d, i); //d는 실수니까 %f, i는 정수니까 %d 
											//d 1.00으로 바뀐 시점은? d에 들어가기 전에 할당연산자 실행과정 시 1.0이 만들어짐.
											//변수 옆에 할당연산자 없으면 읽기, 있으면 쓰기, i는 읽기, d는 쓰기
		d = (double)i; //()가 캐스팅연산자, i변수의값복사x i변수값을 읽어서 캐스팅연산자가 double타입으로 리턴한 값을 할당연산자가 복사함.캐스팅연산자 리턴값 복사
		System.out.printf("%f, %d\n", d, i);
		
		//i = d;
		i = (int)d; //할당연산자는 캐스팅연산자의 리턴값을 받음.
		System.out.printf("%f, %d\n", d, i);
	}
}
