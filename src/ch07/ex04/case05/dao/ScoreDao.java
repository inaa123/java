package ch07.ex04.case05.dao;

import ch07.ex04.case05.domain.Score;

public interface ScoreDao {
	void insertScore(Score score); //추가
	Score[] selectScores(); //읽기메소드 이터레이팅
	//score배열객체
}
