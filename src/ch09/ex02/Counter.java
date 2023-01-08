package ch09.ex02;

public class Counter implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + ": start."); //현재스레드를 콜한 스레드를 ..
		
		for(char c = 'a'; c <= 'f'; c++) {
			System.out.println(Thread.currentThread().getName() + ": " + c);
			try { //문자하나하나 찍고 스레드 잠 재우기
				System.out.println(Thread.currentThread().getName() + ": sleep.");
				Thread.sleep(1000); //1초재우기
			} catch(InterruptedException e) {//방해받는 이셉션
				System.out.println(Thread.currentThread().getName() + ": interrupted.");
			}
		}
		
		System.out.println(Thread.currentThread().getName() + ": end.");
	}
}
//스레드가 하는 일 : 문자찍기