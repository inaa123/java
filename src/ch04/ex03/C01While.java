package ch04.ex03;

public class C01While {
	public static void main(String[] args) {
		int weight = 88;
		int jumpCnt = 0;
		
		while(weight > 60) {
			jumpCnt++;
			weight--;//줄넘기하다 : 줄넘기할때마다 살 빠짐
		}
		
		System.out.printf("%d번 줄넘기해서 몸무게 %dkg이 되었습니다.", jumpCnt, weight);
	}
}
