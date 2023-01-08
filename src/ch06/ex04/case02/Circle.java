package ch06.ex04.case02;

//실체가 없는 원을 클래스 만들기
public class Circle {
	//원을 좌표로 인코딩함.
	private int x; //중심점 좌표
	private int y; //중심점 좌표
	private int r; //반지름
	
	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	@Override
	public String toString() {
		return String.format("(%d, %d), %d", x, y, r);
	}
	
}