package ch07.ex04.case05.presentation;

import ch07.ex04.case05.domain.Score;
import ch07.ex04.case05.service.ScoreService;

public class ScoreIo {
	private ScoreService scoreService;
	
	public ScoreIo(ScoreService scoreService) {
		this.scoreService = scoreService;
	}
	
	public void play() { 
		int korScore = 0; //지역변수 사용
		int engScore = 0;
		int mathScore = 0;
		
		for(int i =0; i < 5; i++) { //학생을 다섯명 받을 수 있음
			korScore = Console.inNum("국어점수를 입력하세요");
			engScore = Console.inNum("영어점수를 입력하세요");
			mathScore = Console.inNum("수학점수를 입력하세요");
			
			scoreService.addScore(new Score(korScore, engScore, mathScore));
		}
		
		Score[] scores = scoreService.getScores();
		for(Score score: scores)
			System.out.println(score);
	}
}
