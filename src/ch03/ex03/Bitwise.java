package ch03.ex03;

public class Bitwise {
	public static void main(String[] args) {
		int x = 10;
		System.out.printf("%s, %d\n", "0000000000000000000000000000" + Integer.toBinaryString(x), x);
		
		x = ~x;
		System.out.printf("%s, %d\n", Integer.toBinaryString(x), x);
		
		x = x + 1;
		System.out.printf("%s, %d\n", Integer.toBinaryString(x), x);
	}
}
