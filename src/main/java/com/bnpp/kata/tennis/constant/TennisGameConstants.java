package com.bnpp.kata.tennis.constant;

public class TennisGameConstants {

	private TennisGameConstants() {
	}

	public static final String ADVANTAGE_GAME_SCORE = " has advantage";
	public static final int ADVANTAGE_DIFFERENCE_POINT = 1;
	public static final String DEUCE_GAME_SCORE = "Deuce";
	public static final int MINIMUM_DEUCE_SCORE = 3;
	public static final int MINIMUM_WINNING_SCORE = 4;
	public static final String WON_THE_GAME_SCORE_RESULT = " won the game";
	public static final String GAME_SCORE_ALL = "All";
	public static final String GAME_SCORE_SEPARATOR = "-";
	private static final String[] GAME_SCORE = { "Love", "Fifteen", "Thirty", "Forty" };
	public static final String SECOND_PLAYER_NAME = "SecondPlayer";
	public static final String FIRST_PLAYER_NAME = "FirstPlayer";

	public static String[] getScores() {
		return GAME_SCORE;
	}
}