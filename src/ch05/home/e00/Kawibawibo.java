package ch05.home.e00;

import java.util.Scanner;

public class Kawibawibo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int playerChoice = 0;
		int appChoice = 0;
		String result = "";
		String choice1 = "";
		String choice2 = "";
		
		System.out.print("1.가위 2.바위 3.보\n> ");
		playerChoice = sc.nextInt(); sc.nextLine();
		appChoice = (int)(Math.random() * 3) + 1;
		
		// 0 : 비김, -2, 1: 이김, -1,2 : 짐
		if(0 < playerChoice && appChoice <= 3) {
			switch(playerChoice - appChoice) {
			case -2: case 1:
				result = "You win"; break;
			case 0:
				result = "Fair"; break;
			case -1: case 2:
				result = "You lose";
			}
		
			switch(playerChoice) {
			case 1: choice1 = "가위"; break;
			case 2: choice1 = "바위"; break;
			case 3: choice1 = "보"; 
			}
		
			switch(appChoice) {
			case 1: choice2 = "가위"; break;
			case 2: choice2 = "바위"; break;
			case 3: choice2 = "보"; 
			}
			
			System.out.printf("You: %s\nMe: %s\n%s ", choice1, choice2, result);
		}
	}
}
