package ch02.home.ex03;

import java.util.Scanner;

public class Unicode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자: ");
		char ch = sc.nextLine().charAt(0); // *.charAt(n)은 String타입 n번째문자를 Char타입으로 전환.*
		
		int unicode = ch;
		System.out.printf("%c의 unicode는 %d", ch, unicode);
		/*내 답
		char c = 0;
		int unicode = 0;
		
		System.out.print("문자: ");
		c = sc.nextLine().charAt(0);
		unicode = c;
		System.out.printf("%c의 uniCode는 %d입니다.", c, unicode);
		*/
	}
}
/*
과제1] 입력한 문자의 unicode를 출력하라. => char타입
-----

문자: A(입력)
A의 unicode는 65입니다.
*/