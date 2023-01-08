package ch05.home.ex02.case02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Paper paper = new Paper();
		
		System.out.print("메시지: ");
		paper.setMsg(sc.nextLine());
		System.out.print("작성자명: ");
		paper.setWriterName(sc.nextLine());
		
		System.out.printf("\n%s from %s", paper.getMsg() ,paper.getWriterName());
	}
}
/* 
과제] 종이에 메세지와 작성자명을 기록한다.
---
메세지: hello
작성자명: terry

hello from terry.

//작성자하고 작성자명 구분 => 작성자:객체, 작성자명:속성
*/