package ch04.home.ex02;

import java.util.Scanner;

public class H02Season {
	public static void main(String[] args) {
		int month = 0;
		String season = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��: ");
		month = sc.nextInt();
		
		if(3 <= month && month <= 5) season = "��";
		else if(6 <= month && month <= 8) season = "����";
		else if(9 <= month && month <= 11) season = "����";
		else if(month == 12 || month == 1 || month == 2) season = "�ܿ�";
		else season = "�������� �ʴ� ��";
		
		System.out.printf("%d���� %s�Դϴ�.", month, season);
		
		/*
		int month = 0;
		String season = "";
		String msg = "";
	
		System.out.print("��: ");
		month = sc.nextInt();
	
		if(3 <= month && month <= 5)  season = "��";
		else if(6 <= month && month <= 8) season = "����";
		else if(9 <= month && month <= 11) season = "����";
		else if(1 <= month && month <= 2 || month == 12) season = "�ܿ�";
		else msg = "1~12���� ���� �Է��ϼ���.";
		
		if(1 <= month && month <= 12)
			msg = month + "���� " + season + "�Դϴ�.";
		
		System.out.println(msg);
		*/
	}
}
/*
ch04.ex02.C04Season�� refactoring�Ѵ�.
switch�� if�� �ٲ۴�.
�������� �ʴ� ���� �Է��� ��츦, ����ó���Ѵ�.=>
*/