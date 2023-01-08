package ch07.ex08.service;

import java.util.List;

import ch07.ex08.domain.Score;

public interface ScoreService {
	void addScore(Score score); //서비스에선 업무관점으로 점수라고 읽음
	List<Score> getScores(); //점수들 => 표 => 리스트
}
