package ch03.ex01;

public class C02MinusMinus {
	public static void main(String[] args) {
		int i = 0;
		--i;
		System.out.println(i);
		i--;
		System.out.println(i);
		
		i = 0;
		int j = --i; //--가 먼저 할당이 나중
		System.out.printf("i: %d, j: %d\n", i, j);
		
		i = 0;
		j = i--; //할당이 먼저 --가 나중 
		System.out.printf("i: %d, j: %d\n", i, j);
	}
}
