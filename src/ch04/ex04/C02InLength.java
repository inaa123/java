package ch04.ex04;

import java.util.Scanner;

public class C02InLength { //한글자 입력 반복작업.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		int len = 0;
		
		do {
			System.out.print("한글자를 입력하세요.: ");
			input = sc.nextLine();
			len = input.length();
			System.out.println(len + "글자 입력했습니다.");
		} while(len != 1);
	}
}
