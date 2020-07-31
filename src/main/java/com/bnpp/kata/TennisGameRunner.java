package com.bnpp.kata;

import java.util.Scanner;

import com.bnpp.kata.tennis.TennisGame;
import com.bnpp.kata.tennis.exception.InvalidUserInputException;

public class TennisGameRunner {

	public String playGame() throws InvalidUserInputException {
		String gameScore;
		Scanner inputScanner = new Scanner(System.in);
		String playerOneName = inputScanner.nextLine();
		String playerTwoName = inputScanner.nextLine();
		TennisGame tennisGame = new TennisGame(playerOneName, playerTwoName);
		do {
			char winningIndicator = inputScanner.next().charAt(0);
			tennisGame.addServicePointToWinner(String.valueOf(winningIndicator));
			gameScore = tennisGame.computeGameScore();
		} while (isGameInProgress(gameScore));
		inputScanner.close();
		return gameScore;
	}

	private boolean isGameInProgress(String gameScore) {
		return gameScore.indexOf("won the game") == -1;
	}
}