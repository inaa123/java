package ch09.ex02;

public class Main { //여러개 만든 스레드 테스트해보기
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + ": start.");
		
		Thread counter = new Thread(new Counter()); //스래드생성자 파라미터로 runnalbe타입 값을 받음
		counter.start();
		
		int tries = 1;
		while(counter.isAlive()) {
			if(tries <= 2) {
				counter.join(1000); //조인 , 1초동안 바라본다. main은 가만히
				System.out.print(Thread.currentThread().getName() + ": wait " + tries++);
			} else {
				System.out.println(Thread.currentThread().getName() + ": irritated.");
				counter.interrupt(); //카운터가 자고있다면 깨우기
				counter.join(); //카운터가 죽을때까지 기다리기
				
			}
		}
		System.out.println(Thread.currentThread().getName() + ": end.");
	}
}