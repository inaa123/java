package ch07.ex08.service;

import java.util.List;

import ch07.ex08.dao.ScoreDao;
import ch07.ex08.domain.Score;

public class ScoreServiceImpl implements ScoreService {
	private ScoreDao scoreDao;
	
	public ScoreServiceImpl(ScoreDao scoreDao) {
		this.scoreDao = scoreDao;
	}
	
	@Override
	public void addScore(Score score) {
		scoreDao.insertScore(score);
	}
	
	@Override
	public List<Score> getScores() {
		List<Score> scores = scoreDao.selectScores();
		this.calcScore(scores); //비어있는 칼럼 (합계, 평균)채우기
		return scores; //꽉 찬 표를 리턴
	}
	
	private void calcScore(List<Score> scores) {
		scores.forEach((score) -> {
			score.setSum(
					score.getKorScore() + 
					score.getEngScore() +
					score.getMathScore());
			score.setAvg(score.getSum() / 3);
		});
	}
}
