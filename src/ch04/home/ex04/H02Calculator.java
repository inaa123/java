package ch04.home.ex04;

import java.util.Scanner;

public class H02Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		char op = 0;
		int result = 0;
		char isRepeat = 0; //토글변수는 is를 앞에 붙이는 게 좋다.
		
		do {
			System.out.print("a: ");
			a = sc.nextInt(); sc.nextLine();
			System.out.print("op: ");
			op = sc.nextLine().charAt(0);
			System.out.print("b: ");
			b = sc.nextInt(); sc.nextLine();
			
			switch(op) {
			case '+': result = a + b; break;
			case '-': result = a - b; break;
			case '*': result = a * b; break;
			case '/': result = a / b;
			}
			
			System.out.printf("%d %c %d = %d\n", a, op, b, result);
			System.out.print("계속할까요(y/n)? ");
			isRepeat = sc.nextLine().charAt(0);
		} while(isRepeat == 'y');
		
		System.out.println("끝");
		/*
		int a = 0;
		int b = 0;
		String op = ""; 
		int result = 0;
		String yn = "y"; //yes no
		
		do {
			System.out.print("a: ");
			a = sc.nextInt(); sc.nextLine();
			System.out.print("op: ");
			op = sc.nextLine();  
			System.out.print("b: ");
			b = sc.nextInt(); sc.nextLine();
			
			switch(op) {
			case "+": result = a + b; break;
			case "-": result = a - b; break;
			case "*": result = a * b; break;
			case "/": result = a / b; 
			}
			System.out.printf("%d %s %d = %d\n",a, op, b, result);
			
			System.out.print("계속 하시겠습니까(y/n)? "); 
			yn = sc.nextLine();
		} while (yn.equals("y"));
		System.out.println("끝");
		*/
	}
	
}
/*
과제] 계산기를 만들어라.
연산자는 +, -, *, /이다.
/는 몫만을 얻는다.

---
a: 1
op: +
b: 2
1 + 2 = 3
계속 하시겠습니까(y/n)? y
a: 2
op: /
b: 2
계속하시겠습니까(y/n)? n
끝
*/