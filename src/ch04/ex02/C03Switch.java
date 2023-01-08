package ch04.ex02;

public class C03Switch {
	public static void main(String[] args) {
		int grade = 3;
		String coupon = "";
		
		switch(grade) {
		case 3: coupon = "10,000원 "; break;
		case 2: coupon = "5,000원 "; break;
		case 1: coupon = "1,000원 "; //break; -> 쓰레기 마지막break는 X.어차피 밑에 더 이상 실행할 코드X
		}
		
		System.out.println(coupon);
	}
}
