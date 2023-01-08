package ch09.ex03;

public class Player extends Thread {
	private Counter counter;
	
	public Player(Counter counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			counter.increase();
			counter.decrease(); //제자리. 플레이어1명일 경우 방해X때문?
			
			if(i % 10 == 0) counter.print();
			
			try {
				sleep((int)(Math.random() * 2)); 
			} catch(InterruptedException e) {} 
		}
	}
}
//플레이어 수와 상관없이. 기본카운터는 0값, 그러나 한명이 반복하면 결국 값은 0 -> 메인에서