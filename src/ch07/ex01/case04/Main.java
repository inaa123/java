package ch07.ex01.case04;

public class Main {
	public static void main(String[] args) {
		Platanus platanus = new Platanus();
		
		Tree tree = new Platanus(); //나무가 한그루 있네.
		platanus = (Platanus)tree; //그 나무가 플라타나스인지 알아봄.(캐스팅)
		
		tree = platanus;
		tree = (Tree)platanus;
		
	}
}