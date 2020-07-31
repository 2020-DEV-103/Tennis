package com.bnpp.kata.tennis;

import com.bnpp.kata.tennis.model.Player;

public class TennisGame {

	private static final String WON_THE_GAME_SCORE_RESULT = " won the game";
	private static final int MINIMUM_WINNING_DIFFERENCE_POINT = 2;
	private static final int MINIMUM_WINNING_SCORE = 4;
	private static final String GAME_SCORE_ALL = "All";
	private static final String GAME_SCORE_SEPARATOR = "-";
	private static final String[] GAME_SCORE = { "Love", "Fifteen", "Thirty", "Forty" };
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
		if (firstPlayer.getScoredPoint() == secondPlayer.getScoredPoint()) {
			gameScore = getGameAllScore();
		} else if (isPlayerWonTheGame()) {
			gameScore = getTopScoredPlayerName() + WON_THE_GAME_SCORE_RESULT;
		} else {
			gameScore = getGameScore();
		}
		return gameScore;
	}

	private String getTopScoredPlayerName() {
		return firstPlayer.getScoredPoint() > secondPlayer.getScoredPoint() ? firstPlayer.getName()
				: secondPlayer.getName();
	}

	private boolean isPlayerWonTheGame() {
		return (firstPlayer.getScoredPoint() >= MINIMUM_WINNING_SCORE
				|| secondPlayer.getScoredPoint() >= MINIMUM_WINNING_SCORE) && isPlayerHasWinningMinimumDifference();
	}

	private boolean isPlayerHasWinningMinimumDifference() {
		return Math
				.abs(firstPlayer.getScoredPoint() - secondPlayer.getScoredPoint()) >= MINIMUM_WINNING_DIFFERENCE_POINT;
	}

	private String getGameScore() {
		return GAME_SCORE[firstPlayer.getScoredPoint()] + GAME_SCORE_SEPARATOR
				+ GAME_SCORE[secondPlayer.getScoredPoint()];
	}

	private String getGameAllScore() {
		return GAME_SCORE[firstPlayer.getScoredPoint()] + GAME_SCORE_SEPARATOR + GAME_SCORE_ALL;
	}

}
