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
		tennisGame.getFirstPlayer().incrementPlayerScore();

		assertThat("Fifteen-Love", CoreMatchers.is(tennisGame.computeGameScore()));
	}

	@Test
	public void gameScoreShouldBeLoveThirtyWhenSecondPlayerWonFirstAndScondService() {
		tennisGame.getSecondPlayer().incrementPlayerScore();
		tennisGame.getSecondPlayer().incrementPlayerScore();

		assertThat("Love-Thirty", CoreMatchers.is(tennisGame.computeGameScore()));
	}

	@Test
	public void gameScoreShouldBeFifteenAllWhenBothPlayersWontheOneServiceRespectively() {
		tennisGame.getFirstPlayer().incrementPlayerScore();
		tennisGame.getSecondPlayer().incrementPlayerScore();

		assertThat("Fifteen-All", CoreMatchers.is(tennisGame.computeGameScore()));
	}

	@Test
	public void gameScoreShouldBeFifteenFortyWhenFirstPlayerWonOneServiceAndSecondPlayerWonTheeServices() {
		tennisGame.getFirstPlayer().incrementPlayerScore();
		tennisGame.getSecondPlayer().incrementPlayerScore();
		tennisGame.getSecondPlayer().incrementPlayerScore();
		tennisGame.getSecondPlayer().incrementPlayerScore();

		assertThat("Fifteen-Forty", CoreMatchers.is(tennisGame.computeGameScore()));
	}
}