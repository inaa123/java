package ch03.home.ex06;

import java.util.Scanner;

public class Adjust {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = 0;
		double result = 0;
		
		System.out.print("x: ");
		x = sc.nextDouble();
		
		result = x - x % 1;
		System.out.println(result);
		
		/*
		double d = 0.0;
		
		System.out.print("x: ");
		d = sc.nextDouble();
		System.out.println(d - d % 1.0);
		 */
	}
}
/*
%연산자를 이용해서, 실수값의 소수점 이하를 내림처리하라.
(casting), Math API사용 안 한다.
실수 값은 sc.nextDouble()로 입력한다.
------
x: 3.1492
3.0
*/