package ch08.ex03.case01;

public class C02Try {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		try { //try로 에러가 발생하는지 지켜봄. exception발생시 try빠져나와 catch
			int result = arr[10];
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외가 발생했습니다.");
		} 
		
		System.out.println("끝");
	}
}
