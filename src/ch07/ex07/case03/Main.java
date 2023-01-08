package ch07.ex07.case03;

public class Main {
	public static void main(String[] args) {
		//과제] calculator에 lamda값을 할당하라.
		Calculator calculator = (int x, int y) -> {
			int result = x + y;
			return result;
		};
		//코드 더 간단하게 , 람다 사용시 이방법 쓰기!
		calculator = (a, b)-> a + b; //리턴생략, 파라미터 어쩌구도 생략
		
		System.out.println(calculator.calc(1, 2));
	}
}
