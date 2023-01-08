package ch02.ex03;

public class C02DoubleInt {
	public static void main(String[] args) {
		double d = 1.42;
		int i = (int)d; 
		System.out.printf("%d, %f\n", i, d);
		
		double f = Math.floor(d); // 내림처리. 1.92의 바닥 1.0,
		double r = Math.round(d); // 반올림처리.
		
		System.out.printf("%f, %f", f, r);
	}
}
