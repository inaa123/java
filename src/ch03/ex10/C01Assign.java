package ch03.ex10;

public class C01Assign {
	public static void main(String[] args) {
		int i = 3;
		
		i = i + 2; //할당연산자는 +연산자의 리턴값을 저장?한다.
		i += 2; //복합 할당연산자 , i값을 읽고 2를 더한후 다시 리턴.
		i -= 2;
		i *= 2;
		i /= 2;
		i %= 2;
		
		System.out.println(i);
	}
}
