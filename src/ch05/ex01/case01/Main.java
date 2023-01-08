package ch05.ex01.case01;

public class Main { //데이터타입으로 쓸지말지는 프로그래머 마음.
	public static void main(String[] args) {
		//절차지향
		int hour = 12;
		int minute = 35;
		int second = 30;
		System.out.printf("%d시 %d분 %d초\n", hour, minute, second);
		
		//절차지향과 객체지향의 결과?가 똑같아보일지라도 개발자 입장에선 다름.
		//객체지향 
		Time time = new Time(); //클래스로 데이터타입 만들땐 new사용 (Time time 객체를 new하는 것)
		time.hour = 12;
		time.minute = 35;
		time.second = 30;
		System.out.printf("%d시 %d분 %d초\n", time.hour, time.minute, time.second);
		
		Time time2 = new Time(); //Time한클래스안에 n개 객체 생성 가능하단걸 보여주기
		time2.hour = 10;
		time2.minute = 30;
		time2.second = 27;
		System.out.printf("%d시 %d분 %d초\n", time2.hour, time2.minute, time2.second);
		
		//타임의 주소 보기
		System.out.println(time);
		System.out.println(time2.toString()); //.toString() -> 이 생략되어있는 것!! println이 자동으로 콜해주기 때문!
		
	}
}
