package com.bnpp.kata.tennis;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class TennisGameTest {

	TennisGame tennisGame;

	@Before
	public void initialize() {
		tennisGame = new TennisGame();
	}

	@Test
	public void firstPlayerScoredShouldBeZeroBeforeGameBegins() {

		assertThat(0, CoreMatchers.is(tennisGame.getFirstPlayer().getScoredPoint()));
	}

	@Test
	public void secondPlayerScoredShouldBeZeroBeforeGameBegins() {

		assertThat(0, CoreMatchers.is(tennisGame.getSecondPlayer().getScoredPoint()));
	}

	@Test
	public void firstPlayerNameShouldBeInitializedAsFirstPlayerBeforeGameBegins() {

		assertThat("FirstPlayer", CoreMatchers.is(tennisGame.getFirstPlayer().getName()));
	}

	@Test
	public void secondPlayerNameShouldBeInitializedAsSecondPlayerBeforeGameBegins() {

		assertThat("SecondPlayer", CoreMatchers.is(tennisGame.getSecondPlayer().getName()));
	}

	@Test
	public void gameScoreShouldBeLoveAllBeforeGameBegins() {

		assertThat("Love-All", CoreMatchers.is(tennisGame.computeGameScore()));
	}

	@Test
	public void firstPlayerScoreShouldBeFifteenLoveWhenFirstPlayerWontheFirstService() {
		updatePlayersScore(1, 0);

		assertThat("Fifteen-Love", CoreMatchers.is(tennisGame.computeGameScore()));
	}

	@Test
	public void gameScoreShouldBeLoveThirtyWhenSecondPlayerWonFirstAndScondService() {
		updatePlayersScore(0, 2);

		assertThat("Love-Thirty", CoreMatchers.is(tennisGame.computeGameScore()));
	}

	@Test
	public void gameScoreShouldBeFifteenAllWhenBothPlayersWontheOneServiceRespectively() {
		updatePlayersScore(1, 1);

		assertThat("Fifteen-All", CoreMatchers.is(tennisGame.computeGameScore()));
	}

	@Test
	public void gameScoreShouldBeFifteenFortyWhenFirstPlayerWonOneServiceAndSecondPlayerWonTheeServices() {
		updatePlayersScore(1, 3);

		assertThat("Fifteen-Forty", CoreMatchers.is(tennisGame.computeGameScore()));
	}

	@Test
	@Parameters({ "0, 1, Love-Fifteen", "0, 3, Love-Forty", "1, 2, Fifteen-Thirty", "2, 0, Thirty-Love",
			"2, 1, Thirty-Fifteen", "2, 2, Thirty-All", "2, 3, Thirty-Forty", "3, 0, Forty-Love", "3, 1, Forty-Fifteen",
			"3,2 , Forty-Thirty" })
	public void gameScoreShouldBeExpectedResultWhichIsMentionedInPreDefinedParametersWithPlayersPointsOfTheGame(
			int firstPlayerPoints, int secondPlayerPoints, String expectedGameResult) {
		updatePlayersScore(firstPlayerPoints, secondPlayerPoints);

		assertThat(expectedGameResult, CoreMatchers.is(tennisGame.computeGameScore()));
	}

	@Test
	public void gameShouldBeWonByFirstPlayerWhenFirstPlayerScoreMinimumFourPointsAndSecondPlayerScoreShouldBeTwoPointsDifferenceWithFirstPlayer() {
		updatePlayersScore(4, 1);

		assertThat("FirstPlayer won the game", CoreMatchers.is(tennisGame.computeGameScore()));
	}

	@Test
	public void gameShouldBeWonBySecondPlayerWhenSecondPlayerScoreMinimumFourPointsAndFirstPlayerScoreShouldBeTwoPointsDifferenceWithSecondPlayer() {
		updatePlayersScore(2, 4);

		assertThat("SecondPlayer won the game", CoreMatchers.is(tennisGame.computeGameScore()));
	}

	@Test
	@Parameters({ "4, 2, FirstPlayer won the game", "3, 5, SecondPlayer won the game", "6, 4, FirstPlayer won the game",
			"10, 8, FirstPlayer won the game", "9,11, SecondPlayer won the game", "13,11, FirstPlayer won the game" })
	public void gameWinningResultShouldBeExpectedWhichIsMentionedInPreDefinedParametersWithPlayersPointsOfTheGame(
			int firstPlayerScorePoints, int secondPlayerScorePoints, String expectedWinningResult) {
		updatePlayersScore(firstPlayerScorePoints, secondPlayerScorePoints);

		assertThat(expectedWinningResult, CoreMatchers.is(tennisGame.computeGameScore()));
	}

	@Test
	public void gameScoreShouldBeDeuceWhenBothPlayersHavingSameScoreAsMinimumTheePoints() {
		updatePlayersScore(3, 3);

		assertThat("Deuce", CoreMatchers.is(tennisGame.computeGameScore()));
	}

	@Test
	@Parameters({ "4,4", "5,5", "7,7", "10,10", "12,12", "13,13" })
	public void gameScoreShouldBeDeuceWhenBothPlayersHavingSameScoreForMoreScenarios(int firstPlayerPoints,
			int secondPlayerPoints) {
		updatePlayersScore(firstPlayerPoints, secondPlayerPoints);

		assertThat("Deuce", CoreMatchers.is(tennisGame.computeGameScore()));
	}

	private void updatePlayersScore(int firsPlayerWinningCounts, int secondPlayerWinningCounts) {
		for (int winningCount = 0; winningCount < firsPlayerWinningCounts; winningCount++) {
			tennisGame.getFirstPlayer().incrementPlayerScore();
		}
		for (int winningCount = 0; winningCount < secondPlayerWinningCounts; winningCount++) {
			tennisGame.getSecondPlayer().incrementPlayerScore();
		}
	}
}