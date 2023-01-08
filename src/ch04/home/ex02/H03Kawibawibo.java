package ch04.home.ex02;

import java.util.Scanner;

public class H03Kawibawibo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int playerChoice = 0;
		int appChoice = 0;
		String result = "";
		String choice = "";
		
		System.out.print("1.가위, 2.바위, 3.보\n> ");
		playerChoice = sc.nextInt();
		appChoice = (int)(Math.random() * 3)  + 1;
		
		if(1 <= playerChoice && playerChoice <= 3) {//입력값의 유효성 검증
			switch(playerChoice - appChoice) {
			case -2: case 1:
				result = "You win."; break;
			case -1: case 2:
				result = "You lose."; break;
			case 0:
				result = "Fair.";
			}
			
			switch(playerChoice) { //디코딩. ?(숫자를 다시 문자로?)
			case 1: choice = "가위"; break;
			case 2: choice = "바위"; break;
			case 3: choice = "보";
 			}
			System.out.println("You: " + choice);
			
			switch(appChoice) {
			case 1: choice = "가위"; break;
			case 2: choice = "바위"; break;
			case 3: choice = "보";
 			}
			System.out.println("Me: " + choice);
		} else {
			result = "ERROR] 1, 2, 3 중의 하나를 입력하세요.";
		}
		
		System.out.println(result);
	}
}
//디코딩 부분은 출력부분에서 하기!!!!!!!!!!!!
/*
과제] 앱과 가위바위보를 하라.
게임 결과를 알려준다.
결과는
You win.
You lose.
Fair
중의 하나이다.
---
1.가위, 2.바위, 3.보
> 1
You: 가위
Me: 보

You win.
*/



/*
int you = 0;
int me = 0;
String result = "";
String yc = ""; //yourChoice
String mc = ""; //myChoice
String fair = "Fair";
String lose = "You lose";
String win = "You win";

System.out.print("1.가위, 2.바위, 3.보\n> ");
you = sc.nextInt();
me = (int)(Math.random()*2) + 1;

if (you == 1) {
	if(me == 1) result = fair;
	else if(me == 2) result = lose;
	else if(me == 3) result = win;
}

if(you == 2) {	
	if(me == 1) result = win;
	else if(me == 2) result = fair;
	else result = lose;
}

if(you == 3) {
	if(me == 1) result = lose;
	else if(me == 2) result = win;
	else result = fair;
}

if(you == 1) yc = "가위";
else if(you == 2) yc = "바위";
else yc = "보";

if(me == 1) mc = "가위";
else if(me == 2) mc = "바위";
else mc = "보";

System.out.printf("You: %s\nMe: %s\n\n%s", yc, mc, result);
*/