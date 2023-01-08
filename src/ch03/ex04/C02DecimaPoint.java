package ch03.ex04;

public class C02DecimaPoint {
	public static void main(String[] args) {
		double pi = 3.141592;
		
		double shortPi = (int)(pi * 10) / 10.0; //소숫점이하 1자리.  pi*10 -> int ->  / 10.0
		System.out.println(shortPi);
		
		//[과제]3.141
		shortPi = (int)(pi * 1000) / 1000.0; //0의 개수가 소숫점이하의 자릿수
		System.out.println(shortPi);
		
		//[과제]3.142
		shortPi = Math.round(pi*1000) / 1000.0;
		System.out.println(shortPi);
	}
}
