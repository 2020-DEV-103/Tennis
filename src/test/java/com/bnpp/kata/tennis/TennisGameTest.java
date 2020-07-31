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

		assertThat(0, CoreMatchers.is(tennisGame.getFirstPlayerScoredPoint()));
	}

	@Test
	public void secondPlayerScoredShouldBeZeroBeforeGameBegins() {

		assertThat(0, CoreMatchers.is(tennisGame.getSecondPlayerScoredPoint()));
	}

	@Test
	public void firstPlayerNameShouldBeInitializedAsFirstPlayerBeforeGameBegins() {

		assertThat("FirstPlayer", CoreMatchers.is(tennisGame.getFirstPlayerName()));
	}
}