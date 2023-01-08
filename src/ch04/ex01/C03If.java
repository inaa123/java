package ch04.ex01;

public class C03If {
	public static void main(String[] args) {
		/*
		int hour = 23;
		if(hour < 12) {
			System.out.println("Good Morning.");
		} else if(hour < 18) { //12시 이상 18시 미만
			System.out.println("Good Afternoon.");
		} else if (hour < 21) { //저녁이면
			System.out.println("Good Evening.");
		} else {
			System.out.println("Good Night.");
		}
		*/
		
		//println 중복코드 많아 가독성 떨어짐. 중복코드 줄이는 법
		int hour = 20;
		String bow = ""; //인사말 변수 bow선언.
		if(hour < 12) bow = "Good Moring";
		else if(hour < 18) bow = "Good Afternoon";
		else if(hour < 21) bow = "Good Evening";
		else bow = "Good Night";
		System.out.println(bow);
	}
}