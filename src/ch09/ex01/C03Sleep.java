package ch09.ex01;

public class C03Sleep { //스레드를 잠깐잠깐 재우기
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.print(i + " ");
			
			try {
				Thread.sleep(1000); //thread 재우기 .vm?에게 보내는 것
			} catch(Exception e) {}
		}
	}
}
