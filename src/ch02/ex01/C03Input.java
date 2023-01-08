package ch02.ex01;

import java.util.Scanner;

public class C03Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //ctrl + shift + O 로 scanner가 존재하는ㄴ 패키지를 import한다.		
		/*
		sc.nextLine(); nextLine()은 String타입인듯
		System.out.print("문자열을 입력하세요.\n>");
		[과제2] <입력데이터>를 입력했습니다. (Hello를 입력했씁니다.) //"hello"라는 값을 변수에 저장을 해야한다. 
	
		내가푼거
		String str = sc.nextLine(); 
		System.out.println( str + "를 입력했습니다.");
		
		정답
		String inVal = sc.nextLine();
		System.out.printf("%s를 입력했습니다.", inVal);
		
		[과제3] 문자열 입력 X -> 고치기
		System.out.print("숫자를 입력하세요.\n>");
		int i = sc.nextInt();
		System.out.println(i + "를 입력했습니다.");
		
		System.out.print("숫자를 입력하세요.\n>");
		int i2 = sc.nextInt();
		sc.nextLine();// 정답.
		System.out.println(i2 + "를 입력했습니다.");
 		
		System.out.print("문자열을 입력하세요.\n>");
		String inVal = sc.nextLine();
		System.out.printf("%s를 입력했습니다.", inVal);
		*/

		System.out.print("문자를 입력하세요.\n>");
		char c = sc.nextLine().charAt(3);
		System.out.println(c);
	}
}
