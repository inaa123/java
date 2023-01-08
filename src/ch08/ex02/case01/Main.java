package ch08.ex02.case01;

public class Main {
	public static void main(String[] args) {
		Way way = Way.LEFT; //왼쪽 방향, WAY타입의 객체.
		String direction = "";
		
		if(way == Way.LEFT) direction = "왼쪽";
		else direction = "오른쪽";
		
		System.out.println(direction);
	}
}
//코드를 객체지향으로?했음. 근데 불편함. 가독성이 떨어짐. =>enum쓴다. case02