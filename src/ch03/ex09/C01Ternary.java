package ch03.ex09;

public class C01Ternary { //삼항연산자
	public static void main(String[] args) {
		int x = 1;
		int y = -1;
		
		int absX = (x >= 0) ? x : -x; //삼항연산자 사용시 내가 리턴 값을 고를 수 있다. 조건문이 true면 첫번째값리턴, false면 두번째값 리턴.
		int absY = (y >= 0) ? y : -y;
		
		System.out.printf("absX: %d\nabsY: %d", absX, absY);
	}
}
