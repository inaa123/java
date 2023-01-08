package ch07.ex04.case04;

public class Slot {
	private Ball[] balls; //공들을 담을 수 있는 배열.공간!
	
	public Slot() {//slot초기화
		balls = new Ball[45]; //배열객체 만든것
			
		for(int i = 0; i < balls.length; i++) 
			balls[i] = new Ball(i + 1); //로또 볼은 1번부터 시작하니까
						//이 new Ball은 공을 하나 만든것
	}
	
	public Ball chuck() { //공을 토해내다.
		int i = 0;
		Ball ball = null;
		
		do {
			i = (int)(Math.random() * 45); //i를 랜덤생성, i변수 0~44까지 담김
			ball = balls[i]; //랜덤으로 생성한 인덱스로 공하나를 꺼내 담았다.
			balls[i] = null;
		} while(ball == null);
		
		return ball;
	}
}