package ch07.ex06.case04;

public class Bowl<T> { //generic class
	private T val;
	
	public void setVal(T val) {//메서드파라미터타입으로도 쓸수있음
		this.val = val;
	}
	
	public T getVal() { 
		return this.val; 
	}
}
