package ch05.ex06.case01;

public class Main {

	public static void main(String[] args) {
		Man.say("I love java.");
		// Man.tell() 인스턴스메서드 객체없이 콜할수X
		Man man = new Man(); //객체부터 만들어야지 인스턴스 메서드 콜할수 ㅇ
		man.tell("I Love Java");
		man.say("Hello"); //객체로 static메소드 콜할수있지만 경고!! 위험하다
 	}
}
