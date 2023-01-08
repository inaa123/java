package ch09.ex04;

public class Buffer { //임시저장소 
	private Integer val;
	
	public synchronized int remove() { //remove를호출한 스레드를 웨잇.값없으면 기다림
		while(val == null) {
			try {
				wait(); //Object클래스에 thread를 잠재우는 wait이 있다.
			} catch(InterruptedException e) {}
		}
		
		int val = this.val;
		//과제] 꺼냈다.를 표현하세요.
		this.val = null;  
		
		notifyAll();
		
		return val;
	}
	
	public synchronized void add(Integer val) {//동기화, <->비동기화 
		while(this.val != null) { //널이아니라면 대기해야함
			try {
				wait();
			} catch(Exception e) {}
		}
		
		this.val = val;
		notifyAll(); //?? 뭘 다 알려준대. 다른 스레드 빼올수있다???
		
	}
}