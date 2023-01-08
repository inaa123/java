package ch04.home.ex01;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 0;
		int tenDigit = 0; //10의자리 정수 쪼개기
		int oneDigit = 0; //1의자리 정수 쪼개기
		String grade = "";
		
		System.out.print("점수: ");
		score = sc.nextInt();
		
		tenDigit = score / 10; //정수쪼개기 10으로 나눈 값 = 십의자리
		oneDigit = score % 10; //정수쪼개기 10으로 나눈 나머지 = 일의자리
		
		if(tenDigit >= 9) grade = "A";
		else if(tenDigit >= 8) grade = "B";
		else grade = "C";
		
		if(score >= 80) {
			if(oneDigit >= 8 || tenDigit == 10) grade += "+";
		else if(0 <= oneDigit && oneDigit < 4) grade += "-";
		}
		//if(tenDigit >=8 && tenDigit == 10 | oneDigit >= 8) grade += "+";
		//else if(0 <= oneDigit && oneDigit < 4) grade += "-";
		System.out.println(grade);
	}
		/*
		int score = 0;
		String grade = "";
		String a = "A";
		String b = "B";
		
		System.out.print("점수: ");
		score = sc.nextInt();
		
		if(score >= 98) grade = a + "+";
		else if(score >= 94) grade = a;
		else if(score >= 90) grade = a + "-";
		else if(score >= 88) grade = b + "+";
		else if(score >= 84) grade = b;
		else if(score >= 80) grade = b + "-";
		else grade = "C";
		
		System.out.println(grade);
		*/
}

/*
다음 구간별로 학점을 부여하라.
98 이상 A+
94 이상 A
90 이상 A-
88 이상 B+
84 이상 B
80 이상 B-
80 미만 C
----

점수: 100 (입력)
A+
*/