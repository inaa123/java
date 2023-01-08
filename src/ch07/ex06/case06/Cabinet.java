package ch07.ex06.case06;

				//제너릭타입 유한 : A클래스상속, A이하타입
public class Cabinet<T extends A> { //캐비넷에 뭐담을지 제너릭타입으로
	public T getLastVal(T[] arr) {
		return arr[arr.length - 1];
	}
	
	public <S extends C> S getFinalVal(S[] arr) {
		return arr[arr.length - 1];
	}
	
	

}
