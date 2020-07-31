package com.bnpp.kata.tennis.constant;

public class TennisGameConstants {

	private TennisGameConstants() {
	}

	public static final String WELCOME_GAME_MESSAGE = "******** Welcome to play the Tennis Game! ********";
	public static final String INITIAL_GAME_MESSAGE = "";
	public static final String ENTER_FIRST_PALYER_NAME_MESSAGE = "Please enter the first palyer name";
	public static final String ENTER_SECOND_PALYER_NAME_MESSAGE = "Please enter the second player name";
	public static final String PLAYER_INDICATE_MESSAGE = "Press 'A' to indicate '%s' win the current service or Press 'B' to indicate ' %s' win the current   	service";
	public static final String START_GAME_MESSAGE = "******** Lets start the game ! ********";
	public static final String CURRENT_GAME_SCORE_MESSAGE = "Current Game score: %s";
	public static final String GAME_OVER_MESSAGE = "******** Game Over ! ********";
	public static final int GAME_SCORE_COMP_NEGATIVE_INDEX = -1;
	public static final String INVALID_USER_INPUT_EXCEPTION = "Invalid user input for identifying a player indication";
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