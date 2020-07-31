package com.bnpp.kata.tennis;

import static com.bnpp.kata.tennis.constant.TennisGameConstants.*;
import com.bnpp.kata.tennis.model.Player;

public class TennisGame {

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
		if (isPlayersHasSameScore()) {
			gameScore = isPlayersHasDeuceScore() ? DEUCE_GAME_SCORE : getGameAllScore();
		} else if (isPlayerWonTheGame()) {
			gameScore = getTopScoredPlayerName() + WON_THE_GAME_SCORE_RESULT;
		} else if (firstPlayer.getScoredPoint() >= MINIMUM_WINNING_SCORE
				&& firstPlayer.getScoredPoint() - secondPlayer.getScoredPoint() == 1) {
			gameScore = getTopScoredPlayerName() + " has advantage";
		} else {
			gameScore = getGameScore();
		}
		return gameScore;
	}

	private boolean isPlayersHasDeuceScore() {
		return firstPlayer.getScoredPoint() >= MINIMUM_DEUCE_SCORE;
	}

	private boolean isPlayersHasSameScore() {
		return firstPlayer.getScoredPoint() == secondPlayer.getScoredPoint();
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
		return getScores()[firstPlayer.getScoredPoint()] + GAME_SCORE_SEPARATOR
				+ getScores()[secondPlayer.getScoredPoint()];
	}

	private String getGameAllScore() {
		return getScores()[firstPlayer.getScoredPoint()] + GAME_SCORE_SEPARATOR + GAME_SCORE_ALL;
	}

}
