package ch07.ex08.dao;

import java.util.List;

import ch07.ex08.domain.Score;

public interface ScoreDao {
	void insertScore(Score score); //dao에선 score인지 관심x 그냥 데이터 하나(레코드)를 읽고있다.
	List<Score> selectScores(); //
	
}
