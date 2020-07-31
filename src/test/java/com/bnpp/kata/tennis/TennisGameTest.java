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
}