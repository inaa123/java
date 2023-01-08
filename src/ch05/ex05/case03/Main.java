package ch05.ex05.case03;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		int result = calculator.add(1, 2);
		System.out.println(result);
		
		Paper paper = new Paper();
		paper.setA(1);
		paper.setB(2);
		paper = calculator.add(paper);
		//Paper paper2 = calculator.add(paper); 성립ㅇbut 물리적으론 상관없지만 논리적으론 헷갈릴 수있기때문에 paper2로 사용하지 않는다.
		System.out.println(paper.getResult());
	}
}
