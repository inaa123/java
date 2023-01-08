package ch07.ex06.case05;

public class Main {
	public static void main(String[] args) {
		Box box = new Box();
		Integer[] arr1 = {1, 2, 3}; //Integer배열
		String[] arr2 = {"a", "b", "c"};
		
		//메서드 콜할때 제너릭타입 결정
		int i =box.getLastVal(arr1); //arr1인티저타입 들어감 -> generic타입도 인티저됨
		String s = box.getLastVal(arr2);
		
		System.out.printf("%d %s", i, s);
	
	}
}
