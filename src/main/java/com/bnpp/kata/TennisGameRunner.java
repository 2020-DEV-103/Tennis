package com.bnpp.kata;

import java.util.Scanner;
import java.util.logging.Logger;

import com.bnpp.kata.tennis.TennisGame;
import static com.bnpp.kata.tennis.constant.TennisGameConstants.*;
import com.bnpp.kata.tennis.exception.InvalidUserInputException;

public class TennisGameRunner {

	private static final Logger LOGGER = Logger.getLogger(TennisGameRunner.class.getName());

	public static void main(String[] args) throws InvalidUserInputException {
		new TennisGameRunner().playGame();
	}

	public String playGame() throws InvalidUserInputException {
		LOGGER.info("******** Welcome to play the Tennis Game! ********");
		String gameScore;
		Scanner inputScanner = new Scanner(System.in);
		LOGGER.info("Please enter the first palyer name");
		String playerOneName = inputScanner.nextLine();
		LOGGER.info("Please enter the second player name");
		String playerTwoName = inputScanner.nextLine();
		TennisGame tennisGame = new TennisGame(playerOneName, playerTwoName);
		String winningIndicatorMessage = String.format(
				"Press 'A' to indicate '%s' win the current service or Press 'B' to indicate ' %s' win the current service",
				playerOneName, playerTwoName);
		LOGGER.info("******** Lets start the game ! ********");
		do {
			LOGGER.info(winningIndicatorMessage);
			char winningIndicator = inputScanner.next().charAt(0);
			tennisGame.addServicePointToWinner(String.valueOf(winningIndicator));
			gameScore = tennisGame.computeGameScore();
			String scoreDetails = String.format("Current Game score: %s", gameScore);
			LOGGER.info(scoreDetails);
		} while (isGameInProgress(gameScore));
		inputScanner.close();
		LOGGER.info("******** Game Over ! ********");
		return gameScore;
	}

	private boolean isGameInProgress(String gameScore) {
		return gameScore.indexOf(WON_THE_GAME_SCORE_RESULT) == GAME_SCORE_COMP_NEGATIVE_INDEX;
	}
}