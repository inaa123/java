package ch02.home.ex02;

import java.time.LocalDate;
import java.util.Scanner;

public class Reservation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = 0;
		int month = 0;
		int day = 0;
		
		System.out.println("���� ���ڸ� �Է��ϼ���.");
		System.out.print("��: "); year = sc.nextInt();
		System.out.print("��: "); month = sc.nextInt();
		System.out.print("��: "); day = sc.nextInt();
		
		LocalDate showDate = LocalDate.of(year,month, day);
		
		System.out.println();
		System.out.println(showDate + "������ �����߽��ϴ�.");
		System.out.println(showDate.minusDays(3) + "���� ȯ���� �����մϴ�.");
		/*����
		System.out.println("���� ���ڸ� �Է��ϼ���.");
		System.out.print("��: "); int year = sc.nextInt();
		System.out.print("��: "); int month = sc.nextInt();
		System.out.print("��: "); int day = sc.nextInt();
		
		LocalDate date = LocalDate.of(year, month, day);
		LocalDate date2 = date.minusDays(3);
		
		System.out.println(date + " ������ �����߽��ϴ�.");
		System.out.println(date2 + " ���� ȯ���� �����մϴ�.");
		*/
	}
}
/*
�����϶�. ȯ���� �����Ϸκ��� 3�� ������ �����ϴ�.
----

���� ���ڸ� �Է��ϼ���.
��: (�Է�)
��: (�Է�)
��: (�Է�)

2025-07-17 ������ �����߽��ϴ�.
2025-07-14 ���� ȯ���� �����մϴ�.
*/