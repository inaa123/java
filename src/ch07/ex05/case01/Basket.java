package ch07.ex05.case01;

//generic type
public class Basket <E> { //바구니는 아무거나 담아라 => "아무거나" 필요, 아무거나 타입은 클래스X기생해야함
	private E e;
	
	public E get() {
		return this.e;
	}
	
	public void set(E e) {
		this.e = e;
	}
}
