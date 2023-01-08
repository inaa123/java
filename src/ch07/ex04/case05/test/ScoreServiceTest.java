package ch07.ex04.case05.test;

import ch07.ex04.case05.domain.Score;
import ch07.ex04.case05.service.ScoreService;
import ch07.ex04.case05.service.ScoreServiceImpl;

public class ScoreServiceTest {
	public static void main(String[] args) {
		//ScoreService scoreService = new ScoreServiceImpl(); //18번줄 에러를 해결하기 위해 아래로 고침
		ScoreServiceImpl scoreService = new ScoreServiceImpl();
		
		Score[] scores = new Score[5];
		for(int i = 0; i < scores.length; i++) 
			scores[i] = new Score((i+1) * 10, (i+1) * 10, (i+1) * 10);
		
		for(Score score: scores) System.out.println(score);
		//Scoreservice 접근자 고치기
		//scoreService.calcScore(scores); //scoreService에 calcScore라는 메소드 X
		System.out.println();
		for(Score score: scores) System.out.println(score);
	}
}
