package ch07.ex06.case04;

public class Main {
	public static void main(String[] args) {
		Bowl<Integer> bowl1 = new Bowl<>(); //숫자담는그릇
		Bowl<String> bowl2 = new Bowl<>(); //문자담는그릇
		
		bowl1.setVal(1);
		bowl2.setVal("hello");
		
		int i = bowl1.getVal();
		String s = bowl2.getVal();
	}
}
