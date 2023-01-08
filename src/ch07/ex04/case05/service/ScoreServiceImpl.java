package ch07.ex04.case05.service;

import ch07.ex04.case05.dao.ScoreDao;
import ch07.ex04.case05.domain.Score;

public class ScoreServiceImpl implements ScoreService {
	private ScoreDao scoreDao;
	
	public ScoreServiceImpl(ScoreDao scoreDao) {
		this.scoreDao = scoreDao; //이 알고리즘 지칭하는 용어 :DI
	}
	
	//테스트를 위해 기본생성자 추가하는 거임
	public ScoreServiceImpl() {}
	
	@Override
	public void addScore(Score score) {
		scoreDao.insertScore(score);
	}
	
	@Override
	public Score[] getScores() {
		Score[] scores = scoreDao.selectScores();
		this.calcScore(scores);
		return scores; //프레젠테이션한테 보낼것. 프레젠테이션은 계산하면 안됨 그냥 받는거
	}
	
	//과제] 각 학생의 합ㄱㅖ, 평균을 산정하라.
	private void calcScore(Score[] scores) { //test를 위해 private -> public으로 고침
		for(int i = 0; i < scores.length; i++) {
			scores[i].setSum(
					scores[i].getKorScore() + 
					scores[i].getEngScore() +
					scores[i].getMathScore());
			scores[i].setAvg(scores[i].getSum() / 3);
		}
	}
}
