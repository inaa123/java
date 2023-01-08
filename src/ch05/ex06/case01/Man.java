package ch05.ex06.case01;

public class Man {
	//static메소드 man.say로 쓸 수 있다. 말하는건 관심 ㅇ 누가말하는진 X
	public static void say(String msg) {
		System.out.println(msg);
	}
	
	//인스턴스메서드 (static이 안붙어있음) 말하는거 관심ㅇ 누가TELL하는지 관심 ㅇ
	public void tell(String msg) {
		System.out.println(msg);
	}
}
