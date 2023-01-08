package ch09.ex01;

public class C01Counter {
	public static void main(String[] args) {
		System.out.println("main start.");
		
		Thread thread1 = new Thread(() -> {
			for(int i = 0; i < 10; i++)
				System.out.print(i + " ");
		});
		
		Thread thread2 = new Thread(() -> {
			for(char c = 'a'; c <= 'z'; c++)
				System.out.print(c + " "); //여기까진 스레드3개존재(메인,1,2스레드)
		});
		
		thread1.start();
		thread2.start();
		//스레드두개가 번갈아가면서 일어남.
		
		System.out.println("main end.");
	}
}
//순서가 뒤죽박죽 