package com.bnpp.kata.tennis;

public class TennisGame {

	private static final String SECOND_PLAYER_NAME = "SecondPlayer";
	private static final String FIRST_PLAYER_NAME = "FirstPlayer";
	private int firstPlayerScoredPoint;
	private int secondPlayerScoredPoint;

	public int getFirstPlayerScoredPoint() {
		return firstPlayerScoredPoint;
	}

	public int getSecondPlayerScoredPoint() {
		return secondPlayerScoredPoint;
	}

	public String getFirstPlayerName() {
		return FIRST_PLAYER_NAME;
	}

	public String getSecondPlayerName() {
		return SECOND_PLAYER_NAME;
	}

}
