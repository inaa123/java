package ch05.home.ex06.case02;

import java.util.Scanner;

public class Console {
	private static Scanner sc;
	//static 블럭 =>바이트코드 로딩된 직후에 static블럭 바로 실행됨.
	static {
		sc = new Scanner(System.in); 
		}
	
	private static void inMsg(String msg) {//입력안내메시지
		System.out.print(msg + "\n> ");		
	}
	
	public static String inStr(String msg) { //외부에서 쓰기 위해 public
		String val = null;
		boolean isGood = false;
		
		do {
			Console.inMsg(msg);
			val = sc.nextLine().trim();
			if(val.length() > 0) isGood = true; 
			else Console.err("한글자 이상 입력하세요.");
		}while(!isGood);
		
		return val;
	}//chainning .해서 다른메소드 콜하고 콜하고 하는 거 
	
	public static int inNum(String msg) {
		int val = 0;
		String valStr = null;
		boolean isGood = false;
		
		do {
			Console.inMsg(msg);
			valStr = sc.nextLine().trim();
			
			if(valStr.length() == 1 &&
					'1' <= valStr.charAt(0) && valStr.charAt(0) <= '9') {
				val = Integer.parseInt(valStr);
				isGood = true;
			} else Console.err("한자리 자연수를 입력하세요");
		} while(!isGood);
		
		return val;
	}
	
	//알림메시지 보여주는 메서드
	public static void info(String msg) {
		System.out.println(msg);
	}
	//에러메시지
	public static void err(String msg) {
		System.out.println("ERROR] " + msg);
	}
}
