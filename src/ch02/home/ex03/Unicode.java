package ch02.home.ex03;

import java.util.Scanner;

public class Unicode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����: ");
		char ch = sc.nextLine().charAt(0); // *.charAt(n)�� StringŸ�� n��°���ڸ� CharŸ������ ��ȯ.*
		
		int unicode = ch;
		System.out.printf("%c�� unicode�� %d", ch, unicode);
		/*�� ��
		char c = 0;
		int unicode = 0;
		
		System.out.print("����: ");
		c = sc.nextLine().charAt(0);
		unicode = c;
		System.out.printf("%c�� uniCode�� %d�Դϴ�.", c, unicode);
		*/
	}
}
/*
����1] �Է��� ������ unicode�� ����϶�. => charŸ��
-----

����: A(�Է�)
A�� unicode�� 65�Դϴ�.
*/