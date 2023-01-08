package ch08.ex02.case02;

public class Main {
	public static void main(String[] args) {
		Way way = Way.LEFT;
		String direction = "";
		
		switch(way) {
		case LEFT: direction = "왼쪽"; break;
		case RIGHT: direction = "오른쪽"; 
 		}
		
		System.out.println(direction);
	}
}
