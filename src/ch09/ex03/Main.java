package ch09.ex03;

public class Main {
	public static void main(String[] args) {
		Counter counter = new Counter();
		new Player(counter).start();
		new Player(counter).start(); //두번째 선수
		new Player(counter).start(); //스레드의 값이 늘어날 수록 카운터 값 심하게 늘어남. 공유의 위험성
		
		
	}
}
