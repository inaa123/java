package ch03.ex08;

public class Logical {
	public static void main(String[] args) {
		boolean b = false;
		
		b = true && true;
		b = (2 > 1) && (2 > 1); //비교와 논리가 나란히 있으면 논리가 먼저 실행 ()없어도 결고ㅏ값은 같음.
		b = 2 < 1 && 2 > 1;
		b = 2 < 1 || 2 > 1;
		b = 2 < 1 || 2 < 1;
		System.out.println(b);
		
		int x = 0;
		int y = 0;
		b = ++x < 0 && ++y <0; //&&에서 앞에가 false면 뒤에 계산x.(so, y는 초기값) 그러나 &만 쓰면 뒤에도 계산 ㅇ
		
		x = 0;
		y = 0;
		b = ++x < 0 || ++y <0;
		
		x = 0;
		y = 0;
		b = ++x > 0 || ++y <0; // ||는 처음에 true가 나오면 뒤에 계산 X.(so, y는 초기값) 그러나 |만 쓰면 뒤에도 계산 ㅇ
		
		System.out.printf("x: %d, y: %d, b: %b", x, y, b); 
	}
}