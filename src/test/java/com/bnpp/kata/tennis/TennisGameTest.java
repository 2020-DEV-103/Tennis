package com.bnpp.kata.tennis;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

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

	private void updatePlayersScore(int firsPlayerWinningCounts, int secondPlayerWinningCounts) {
		for (int winningCount = 0; winningCount < firsPlayerWinningCounts; winningCount++) {
			tennisGame.getFirstPlayer().incrementPlayerScore();
		}
		for (int winningCount = 0; winningCount < secondPlayerWinningCounts; winningCount++) {
			tennisGame.getSecondPlayer().incrementPlayerScore();
		}
	}
}