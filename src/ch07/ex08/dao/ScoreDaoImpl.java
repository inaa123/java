package ch07.ex08.dao;

import java.util.List;

import ch07.ex08.domain.Score;

public class ScoreDaoImpl implements ScoreDao{
	private List<Score> scores; // ~~?? 데이터를 저장할 리스트.변수 
	
	public ScoreDaoImpl(List<Score> scores) {
		this.scores = scores;
	}
	
	@Override
	public void insertScore(Score score) {
		scores.add(score);
	}
	
	@Override
	public List<Score> selectScores(){
		return this.scores;
	}
}
