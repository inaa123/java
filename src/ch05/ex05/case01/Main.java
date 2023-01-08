package ch05.ex05.case01;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		int result = calculator.add(1, 2); //add메소드 콜하는 메소드 = main()
		result = calculator.add(1, 2, 3);									//바디부분은 안보임(return a + b;)
		System.out.println(result);
	}
}
