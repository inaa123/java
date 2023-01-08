package ch09.ex03;

public class Counter {
	private int val;
	
	public synchronized void increase() {
		val++;
	}
	
	public synchronized void decrease() {
		val--;
	}
	
	public synchronized void print() {
		System.out.print(val + " ");
	}
}
// synchronized : 메소드 호출시 Lock걸기. => val++ 동시에 이뤄지는거 ㄹ막아줌.