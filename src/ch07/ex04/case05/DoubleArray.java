package ch07.ex04.case05;

public class DoubleArray {
	public static void main(String[] args) {
		int[][] scores = {
				{90, 90, 90},//이 배열객체가 socres배열의 원소
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50}
		}; //표를 자바에서 이중배열로 표현함.
		
		System.out.println("번호 국어 영어 수학 합계 평균"); //합계평균은 로우데이터로 계산된 데이터
		System.out.println("-----------------------");
								//length의 값은 5!
		for(int i = 0; i < scores.length; i++) { //레코드를 하나씩 이동
			int sum = 0; 
			
			System.out.print(" " + (i + 1) + " ");
			for(int j = 0; j < scores[0].length; j++) { //필드를 하나씩 이동
				sum += scores[i][j];
				System.out.printf("%5d", scores[i][j]);
			}
			System.out.printf("%5d %4d\n", sum, sum / scores[0].length);
		}
	}
}