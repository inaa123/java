package ch06.ex04.case03;

public class Circle extends Point { //나쁜코드. why? 원은 점이다.가 어색함.
	//private int x; point값과 중복
	//private int y; point와 중복.
	private int r;
	
	public Circle(int x, int y, int r) {
		super(x, y);
		this.r = r;
	}
	//Circle은 도메인이라서 오버라이드 한다..?
	@Override
	public String toString() {
		return String.format("(%d, %d), %d", this.getX(), this.getY(),r);
		//return String.format("(%d, %d), %d", x, y); x,y,안되는 이유 : private
	}
	
}
