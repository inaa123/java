package ch03.ex07;

public class C01Compare {
	public static void main(String[] args) {
		boolean b = 'A' < 'B'; //TRUE, b변수에는 true가 저장
		b = '0' == 0; //False, 문자'0'과 숫자0
		b = 'A' != 65; //False
		
		b = 10.0 ==10.0f; //TRUE, double 10.0과 float 10.0
		b = 0.1 == 0.1f; //0.1이후 소숫점 첫째자리 이후 자리가 늘어나면서 다른 값들 생김.
		b = (float)0.1 == 0.1f;
		System.out.println(b);
	}
}