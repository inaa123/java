package ch03.ex01;

public class C01PlusPlus {
	public static void main(String[] args) {
		//지금은 ++연산자의 위치 상관 X
		int i = 0;
		++i;
		System.out.println(i);
		i++; //i변수에 저장된 값1 에다 ++ 1더해서 2를 i변수에 넣기.
		System.out.println(i);
		
		//이제 위치에 따라 다른거 확인 =>연산자 순위?이해 해야함. 우선순위 있다는 걸 기억하기!!!!!
		i = 0;
		int j = ++i; // ++먼저실행 후 =할당 나중에 실행
		System.out.printf("i: %d, j: %d\n", i, j);
		
		i = 0;
		j = i++; //++이 변수뒤에 가면 할당 먼저. =먼저실행 후 ++실행
		System.out.printf("i: %d, j: %d\n", i, j);
	}
}
