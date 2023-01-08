package ch04.ex01;

public class C01If {
	public static void main(String[] args) {
		int visitCnt = 0; //Count의 줄임말 cnt
		
		if(visitCnt < 1) //블록안에 하나만 있을 경우 {} 생략 가능.
			System.out.println("첫방문입니다.");
	}
}
