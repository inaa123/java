package ch05.ex06.case02;

import java.util.Scanner;

public class Console {
	private static Scanner sc;
	//static 블럭 =>바이트코드 로딩된 직후에 static블럭 바로 실행됨.
	static {
		sc = new Scanner(System.in); //static 어쩌구저쩌구 초기화 하고 싶었음.
	}
	
	private static void inMsg(String msg) {//입력안내메시지 input의 앞글자따옴ㅎ
		System.out.print(msg + "\n> ");		//안보이게...감추기...?privat..?
	}
	
	public static String inStr(String msg) { //외부에서 쓰기 위해 public
		Console.inMsg(msg);
		return sc.nextLine().trim(); //chainning. .해서 다른메소드 콜하고 콜하고 하는 거 
										//ㄴ chaining 쓰는 이유 : 
	}
	
	public static int inNum(String msg) {
		Console.inMsg(msg);
		int num = sc.nextInt(); sc.nextLine();
		return num;
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
