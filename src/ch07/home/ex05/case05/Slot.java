package ch07.home.ex05.case05;

import java.util.ArrayList;
import java.util.List;

public class Slot {
	private List<Ball> balls; //공들을 담을 수 있는 배열.공간!
	
	public Slot() {//slot초기화
		balls = new ArrayList<>();
	
		for(int i = 1; i <= 45; i++)
			balls.add(new Ball(i));
	}
	
	public Ball chuck() { //공을 토해내다.
		int i = (int)(Math.random() * balls.size()); //최초에는 size값이 45
		return balls.remove(i); //리무브하면 size44됨 (한번할때마다 size 줄어듬.)
	}
}