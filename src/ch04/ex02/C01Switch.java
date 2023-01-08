package ch04.ex02;

public class C01Switch {
	public static void main(String[] args) {
		int grade = 3;
		String coupon = "";
		
		switch(grade) { //case비교값이 인덱스역할
		case 3: coupon += "10,000원 "; //grade값이 3이면 case3으로 건너뛴다.
		case 2: coupon += "5,000원 ";
		case 1: coupon += "1,000원 ";
		}
		
		System.out.println(coupon);
	}
}
