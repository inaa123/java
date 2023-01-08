package ch04.ex05;

public class C01For {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.print("*");
		}
		
		int i = 0;
		while(i < 10) {//i를 몇번시킬지 관심없으면 while. 
			System.out.print(i + " ");
			i++;
		}
		/*
		for(int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//고ㅏ제] i=1인 상황에서 0이상 9이하를 출력하라.
		for(int i = 1; i <= 10; i++ ) {
			System.out.print( i - 1 + " ");
		}
		System.out.println();
		*/
	}
}
