package com.bnpp.kata;

import java.util.Scanner;
import java.util.logging.Logger;

import com.bnpp.kata.tennis.TennisGame;
import static com.bnpp.kata.tennis.constant.TennisGameConstants.*;
import com.bnpp.kata.tennis.exception.InvalidUserInputException;

public class TennisGameRunner {

	private static final Logger LOGGER = Logger.getLogger(TennisGameRunner.class.getName());

	public static void main(String[] args) {
		new TennisGameRunner().playGame();
	}

	public String playGame() {
		LOGGER.info(WELCOME_GAME_MESSAGE);
		String gameScore = INITIAL_GAME_MESSAGE;
		Scanner inputScanner = new Scanner(System.in);
		LOGGER.info(ENTER_FIRST_PALYER_NAME_MESSAGE);
		String playerOneName = inputScanner.nextLine();
		LOGGER.info(ENTER_SECOND_PALYER_NAME_MESSAGE);
		String playerTwoName = inputScanner.nextLine();
		TennisGame tennisGame = new TennisGame(playerOneName, playerTwoName);
		String winningIndicatorMessage = String.format(PLAYER_INDICATE_MESSAGE, playerOneName, playerTwoName);
		LOGGER.info(START_GAME_MESSAGE);
		do {
			try {
				LOGGER.info(winningIndicatorMessage);
				char winningIndicator = inputScanner.next().charAt(0);
				tennisGame.addServicePointToWinner(String.valueOf(winningIndicator));
				gameScore = tennisGame.computeGameScore();
				String scoreDetails = String.format(CURRENT_GAME_SCORE_MESSAGE, gameScore);
				LOGGER.info(scoreDetails);
			} catch (InvalidUserInputException e) {
				LOGGER.warning(e.getMessage());
			}
		} while (isGameInProgress(gameScore));
		inputScanner.close();
		LOGGER.info(GAME_OVER_MESSAGE);
		return gameScore;
	}

	private boolean isGameInProgress(String gameScore) {
		return gameScore.indexOf(WON_THE_GAME_SCORE_RESULT) == GAME_SCORE_COMP_NEGATIVE_INDEX;
	}
}