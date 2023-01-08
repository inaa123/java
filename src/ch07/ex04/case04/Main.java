package ch07.ex04.case04;

public class Main {
	public static void main(String[] args) {
		Slot slot = new Slot();
		Ball[] balls = new Ball[6]; 
		
		//slot에서 공을 6번 뽑을거 안다 -> for써야해
		for(int i = 0; i < 6; i++) 
			balls[i] = slot.chuck();
		
		for(Ball ball: balls) 
			System.out.print(ball.getNum() + " ");
	}
}//그러나 중복값이 나올 수 있다 =>버그 해결하기.
