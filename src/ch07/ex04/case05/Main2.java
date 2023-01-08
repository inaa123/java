package ch07.ex04.case05;

import ch07.ex04.case05.dao.ScoreDao;
import ch07.ex04.case05.dao.ScoreDaoImpl;
import ch07.ex04.case05.domain.Score;
import ch07.ex04.case05.presentation.ScoreIo;
import ch07.ex04.case05.service.ScoreService;
import ch07.ex04.case05.service.ScoreServiceImpl;


public class Main2 {
	public static void main(String[] args) {
		Score[] scores = new Score[5]; //DB준비
		/*
		for(int i = 0; i < scores.length; i++)
			scores[i] = new Score((i+1) * 10, (i+1) * 10, (i+1) * 10);
		*/
		ScoreDao scoreDao = new ScoreDaoImpl(scores); //파라미터로 위에서 받은 DB넣어주기
		ScoreService scoreService = new ScoreServiceImpl(scoreDao);
		ScoreIo scoreIo = new ScoreIo(scoreService);
		
		scoreIo.play();
		
	}
}
/*
과제 ScoreIo를 건들여서 5명의 성적(국영수 다)입력 후 결과출력하기
ScoreDao를 신경쓸필요 X IO는 service와 대화하면 끝남.
*/