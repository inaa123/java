package ch07.ex01.case07;

public class Human {
	//과제] 메소드를 만든다. 인간이 라면외에 , 김치와 사과를 먹도록 만든다.
	/* 확장성이 떨어짐. 이외의 것을 먹을 경우 유지보수 ..귀찮
	public void eat(Ramen ramen) {}
	public void eat(Kimchi kimchi) {}
	public void eat(Apple apple) {}
	*/
	public void eat(Food food) {
		System.out.println(food + "를 먹다.");
	}
} 
