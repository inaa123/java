package ch04.ex04;

import java.util.Scanner;

public class C01DoWhile {//C01dowhile블록
	public static void main(String[] args) { //메인블록
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int result = 0;
		
		do { //do블록
			System.out.print("a: ");
			a = sc.nextInt();
			
			System.out.print("b: ");
			b = sc.nextInt();
			
			System.out.printf("%d + %d = %d\n\n", a, b, result = a + b);
		} while(result != 0); //조건문. 명령문으로 끝날땐 세미콜론.
	}
}//while은 실행횟수가 0회 이상 실행한다, do while은 1회 이상 실행한다. 
