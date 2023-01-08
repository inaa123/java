package ch06.home.ex04.case03;

public class Circle { //A has a B로 풀기
	private Point point; //변수초기화는 선언문이 아닌 생성자에서
	private int r;
	
	public Circle(Point point, int r) {
		//this.point = new Point(x, y); Circle(int x, int y, int r)시 가능!
		this.point = point; //Point point도 가능!
		this.r = r;
	}
	
	@Override
	public String toString() {
		return String.format("%s, %d", this.point, this.r);
	}
}