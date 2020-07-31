package com.bnpp.kata.tennis;

import com.bnpp.kata.tennis.model.Player;

public class TennisGame {

	private static final String FIFTEEN_LOVE_GAME_SCORE = "Fifteen-Love";
	private static final String LOVE_ALL_GAME_SCORE = "Love-All";
	private static final String SECOND_PLAYER_NAME = "SecondPlayer";
	private static final String FIRST_PLAYER_NAME = "FirstPlayer";
	private Player firstPlayer;
	private Player secondPlayer;

	public TennisGame() {
		firstPlayer = new Player(FIRST_PLAYER_NAME);
		secondPlayer = new Player(SECOND_PLAYER_NAME);
	}

	protected Player getFirstPlayer() {
		return firstPlayer;
	}

	protected Player getSecondPlayer() {
		return secondPlayer;
	}

	public String computeGameScore() {
		String gameScore;
		if (firstPlayer.getScoredPoint() == 1 && secondPlayer.getScoredPoint() == 0) {
			gameScore = FIFTEEN_LOVE_GAME_SCORE;
		} else if (firstPlayer.getScoredPoint() == 0 && secondPlayer.getScoredPoint() == 2) {
			gameScore = "Love-Thirty";
		} else {
			gameScore = LOVE_ALL_GAME_SCORE;
		}
		return gameScore;
	}

}
