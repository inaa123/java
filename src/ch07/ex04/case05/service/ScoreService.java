package ch07.ex04.case05.service;

import ch07.ex04.case05.domain.Score;

public interface ScoreService {
	void addScore(Score score); //추가는 add, 읽기는 get
	Score[] getScores();
}
