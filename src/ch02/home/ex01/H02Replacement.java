package ch02.home.ex01;

import java.util.Scanner;

public class H02Replacement {
	public static void main(String[] args) {
		/* 내 답
		Scanner sc = new Scanner(System.in);
	
		System.out.print("a를 입력하세요\n>");
		int a = sc.nextInt(); 
	
		System.out.print("b를 입력하세요\n>");
		int b = sc.nextInt();
	
		int c = 0;
		c = a;
		a = b;
		b = c;
	
		System.out.println(a);
		System.out.println(b);
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a: "); //presentation logic 화면 로직
		int a = sc.nextInt();
		System.out.print("b: ");
		int b = sc.nextInt();
		System.out.printf("=> a : %d, b : %d\n", a, b);
		
		System.out.println("=> a, b 값을 교체합니다.");
		int temp = 0; //business logic
		temp = a; // backup
		a = b;
		b = temp;
		System.out.printf("=> a : %d, b : %d\n", a, b);
		System.out.println("교체가 끝났습니다.");
	}
}
/*
[과제] a, b 변수의 값을 교체하라.
	a와 b값을 임의로 입력받는다.
	교체 결과를 출력한ㄷ.
*/