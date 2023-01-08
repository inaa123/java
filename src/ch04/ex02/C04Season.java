package ch04.ex02;

import java.util.Scanner;

public class C04Season {
	public static void main(String[] args) {
		int month = 0;
		String season = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월: ");
		month = sc.nextInt();
		
		switch(month) {
		case 3:						
		case 4:
		case 5:
			season = "봄"; break; //중복이 많기 때문에 흘려보내고 마지막거에만 season을 적어주면 됨
		case 6: case 7: case 8: //가로 정렬도 가능
			season = "여름"; break; 
		case 9: case 10: case 11:
			season = "가을"; break;
		case 12: case 1: case 2:
			season = "겨울";		
		}
		
		System.out.printf("%d월은 %s입니다.", month, season);
	}
}
