package ch07.ex06.case05;

public class Box { //generic method
	//generic <T>, 리턴타입 T, 파라미터 배열타입?
	public <T> T getLastVal(T[] arr) {
		return arr[arr.length - 1]; //파라미터 배열의 마지막 값을 리턴;
	}
}
