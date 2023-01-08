package ch07.ex05.case04;

import java.util.ArrayList;
import java.util.List;

public class ScoreList {
	public static void main(String[] args) {
		List<Integer> score1 = new ArrayList<>(); //첫번째 학생 점수담을 List
		List<Integer> score2 = new ArrayList<>();
		List<List<Integer>> scores = new ArrayList<>(); //scores가 테이블이 됨
		
		for(int i = 0; i < 3; i++) {
			score1.add(80 + i);
			score2.add(90 + i);
		}
		System.out.printf("%s\n%s\n", score1, score2);
		
		scores.add(score1); //scores의 첫번째 데이터 집어넣기
		scores.add(score2);
		System.out.println(scores); //하나의 리스트에... 원소List<integer>타입..
		
	}
}
