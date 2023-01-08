package ch08.ex02.case03;

public class Main { //name, ordinal, values, valueof 4개의 메소드 사용법
	public static void main(String[] args) {
		String name = Way.LEFT.name();
		int ordinal = Way.LEFT.ordinal();//LEFT의 코드값 0
		name = Way.RIGHT.name();
		ordinal = Way.RIGHT.ordinal(); //코드값 1
		
		System.out.printf("%s %d\n", name, ordinal);
		
		Way[] ways = Way.values(); //left와 right두개의 값이 들어있는 배열이 리턴됨
		for(Way way: ways) System.out.print(way.toString() + " ");
		System.out.println();	//ㄴprint메소드는 way객체의 어떤 메소드를 콜했을까?->toString()호출함
		
		Way way = Way.valueOf("LEFT");
		System.out.println(way); //println은 way객체의 어떤 메소드를 콜했을까? -> toString()호출
	}	
}
