package ch04.ex01;

public class C04Condition {
	public static void main(String[] args) {
		int a = 3;
		if(0 < a && a < 4) System.out.println("good");
		//(a > 0 && a < 4)보다 좋은 코드임
		
		//[과제1] b값이, 'a'초과 'c' 미만 범위에 속하면, good를 말하라.
		char b = 'b';
		if('a' < b && b < 'c') 
			System.out.println("good"); 
		
		int x = 0;
		int y = 0;
		if((x = 1 + 2) > 0 || (y = 1 - 2) > 0) //좋은 코드는 아님.
			System.out.printf("x: %d, y: %d\n", x, y);
		
		//과제 s값이 he, HE, He, hE중에 하나면, he를 말하라.
		String s = "HE";
		if(s.equals("he") || s.equals("HE") || s.equals("He") ||s.equals("hE")) 
			System.out.println("he");
		
		s = ""; //값이 없는 경우
		if(s.equals("")) System.out.println("값이 없다.");
		
		//[과제] 값이 있으면, 값이 있다.를 말하라.
		s = "hello";
		if(!s.equals(""))System.out.println("값이 있다."); //논리부정연산자 "!"붙이기
		
		boolean power = false;//토글___? 시 논리연산자 유용
		if(!power) System.out.println("전원을 켠다."); 
	}
}