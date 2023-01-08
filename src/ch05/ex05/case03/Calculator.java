package ch05.ex05.case03;

public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	
	//객체는 데이터이다 paper도 데이터이다. 더하기 끝나면 종이를 뱉어낸다.
	public Paper add(Paper paper) { //파라미터는입력받는 값
		paper.setResult(paper.getA() + paper.getB());
		return paper;
	}
}//리턴한 데이터
