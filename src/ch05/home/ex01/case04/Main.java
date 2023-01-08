package ch05.home.ex01.case04;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String name = ""; 
		int age = 0;
		LocalDate regDate = null; //쓰레기값없애기 위해 기본값 초기화해야함
		
		System.out.print("이름: ");
		name = sc.nextLine();
		System.out.print("나이: ");
		age = sc.nextInt();
		regDate = LocalDate.now();
		
		User user= new User();
		user.setName(name);
		user.setAge(age);
		user.setRegDate(regDate);
		
		System.out.printf("\n이름: %s\n나이: %d\n가입일: %s", 
				user.getName(), user.getAge(), user.getRegDate());
		/*
		Scanner sc = new Scanner(System.in);
		User user = new User();
		
		System.out.print("이름: ");
		user.setName(sc.nextLine());
		System.out.print("나이: ");
		user.setAge(sc.nextInt());
		user.setSignDay(LocalDate.now());
		
		System.out.printf("\n이름: %s\n나이: %d\n가입일: %s", user.getName(), user.getAge(), user.getSignDay());
		*/
	}
}
/*
과제] 사용자를 생성하라.
사용자의 이름, 나이를 수동 입력 받는다.(유저가 입력)
가입일은 오늘 날짜를 자동 입력 받는다.
----

이름: gambit(입력)
나이: 25(입력)

이름: gambit(입력)
나이: 25(입력)
가입일: 2022-06-22
*/