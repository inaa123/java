package ch05.ex05.case01;

public class Calculator {
	public int add(int a,int b) { //transparent: ?????
		return a + b;				//앞에 int는 add끝났을때, 안에 int는 add전에
	}
	
	public int add(int a, int b, int c) { //오버로드 : 하나의 클래스에 이름이 같고 파라미터가 다른 메소드를 두개 이상 선언했다.
		return a + b + c;
	}
}
