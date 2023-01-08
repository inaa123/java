package ch07.ex04.case05.dao;

import ch07.ex04.case05.domain.Score;

public class ScoreDaoImpl implements ScoreDao {
	private Score[] scores;
	private int cursor;
	
	public ScoreDaoImpl (Score[] scores) {//DAO가 쓸모있을려면 데이터베이스가 있어야함. DB준비되어야지 DAO
		this.scores = scores;
	}
	
	@Override
	public 	void insertScore(Score score) { //자식 오버라이딩에서 접근자는 부모접근자보다 이상이어야함.=>so public!
		this.scores[cursor++] = score;
	}
	@Override
	public Score[] selectScores() { //얘도 public
		return this.scores;
	}
}
