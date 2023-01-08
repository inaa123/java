package ch03.home.ex09;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		int tot = 0;
		double avg = 0;
		char grade = 0;
		
		System.out.print("국어: ");
		kor = sc.nextInt();
		System.out.print("영어: ");
		eng = sc.nextInt();
		System.out.print("수학: ");
		math = sc.nextInt();
		
		tot = kor + eng + math;
		avg = tot / 3.0;
		grade = (avg >= 90) ? 'A' : (avg >= 80) ? 'B' : 'C'; 
		
		System.out.printf("\n총점: %d\n평균: %.1f\n학점: %c", tot, avg, grade); //.nf=> 소수점이하 n번째까지 출력.
	}
}
/*
국어, 영어, 수학 점수를 입력받는다.
총점, 평균, 학점을 출력한다.
평균점수는 소수점이하 1자리까지만 출력한다.(실수가 나올 수 있는 값)출력만!!!!!!!!!!! 값 자체는 ㄴ

90 <= mean <= 100: A
80 <= MEAN < 90: B
	 mean <80 : C
----
국어: 95
영어: 100
수학: 100

총점: 295
평균: 98.3
학점: A
*/