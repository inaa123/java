package ch04.ex04;

import java.util.Scanner;

public class C05Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		String aStr = "";
		String bStr = "";
		String op = "";
		boolean isGood = false;
		int result = 0;
		String isRepeat = "";
		
		do { 
			do { //a값 입력
				isGood = false;
				System.out.print("a: ");
				aStr = sc.nextLine();
				if(aStr.length() == 1 && '0' < aStr.charAt(0) && aStr.charAt(0) <= '9') {
					isGood = true;
					a = Integer.parseInt(aStr); //숫자형태인 String타입만 int로 전환 가능!
				} else System.out.println("ERROR] 10미만의 자연수를 입력하세요.");
			}while(!isGood);
			
			do { //op값입력
				isGood = false;
				System.out.print("op: ");
				op = sc.nextLine();
				if(op.length() == 1 && 
					(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"))) {
					isGood = true;
				} else System.out.println("ERROR] +, -, *, / 중에 하나를 입력하세요.");
			} while(!isGood);
			
			do { //b값입력
				isGood = false;
				System.out.print("b: ");
				bStr = sc.nextLine();
				if(bStr.length() == 1 && '0' < bStr.charAt(0) && bStr.charAt(0) <= '9') {
					isGood = true;
					b = Integer.parseInt(bStr); //숫자형태인 String타입만 int로 전환 가능!
				} else System.out.println("ERROR] 10미만의 자연수를 입력하세요.");
			}while(!isGood);
			
			switch(op) {
			case "+": result = a + b; break;
			case "-": result = a - b; break;
			case "*": result = a * b; break;
			case "/": result = a / b;
			}
			
			System.out.printf("%d %s %d = %d\n", a,op, b,result);
			
			do {
				isGood = false;
				System.out.print("계속할까요(y/n?) ");
				isRepeat = sc.nextLine();
				if(isRepeat.length() == 1 &&
						(isRepeat.equalsIgnoreCase("y") || isRepeat.equalsIgnoreCase("n"))) {
					isGood = true;
				} else System.out.println("ERROR] y 혹은 n을 입력하세요.");
			}while(!isGood);
			
		} while(isRepeat.equalsIgnoreCase("y")); //숫자면 ==로 비교할수있지만 문자는 .equals써야함.
			              //isRepeat에 대문자Y든 소문자y든 모두 true .
		
		System.out.println("끝.");
	}
}
//예외처리 a,b 숫자 x경우 op 연산자 x경우