package ch04.ex01;

import java.util.Scanner;

public class C06Present {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String prize = "";
		
		System.out.print("1.냉장고, 2.세탁기\n> "); //냉장고의 코드 값은 1번, 세탁기의 코드값은 2버
		choice = sc.nextInt();
		
		if(choice == 1) prize = "냉장고";
		else if(choice == 2) prize = "세탁기";
		else prize = "화장지"; //예외처리 : 다른 메뉴를 선택하면 화장지를 준다.
		
		System.out.println(prize);
	}
}
