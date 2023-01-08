package ch04.ex03;

public class C02DrawingLots {
	public static void main(String[] args) {
		int random = 1;
		int pickCnt = 0;
		
		while(random % 3 != 0) {
			random = (int)(Math.random() * 100) + 1;
			pickCnt++;
		}
		
		System.out.printf("%d회 뽑아서, %d를 찾았습니다.", pickCnt, random);
	}
}
/*
3의 배수를 뽑을때까지 계속 뽑기. => x % 3 == 0
3의 배수가 아니면 뽑아야지 => !(x % 3 == 0) 논리부정연산자
						x % 3 != 0 다르다연산자

*/