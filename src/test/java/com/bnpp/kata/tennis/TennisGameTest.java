package com.bnpp.kata.tennis;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class TennisGameTest {

	@Test
	public void firstPlayerScoredShouldBeZeroBeforeGameBegins() {
		TennisGame tennisGame = new TennisGame();

		assertThat(0, CoreMatchers.is(tennisGame.getFirstPlayerScoredPoint()));
	}
	
	@Test
	public void secondPlayerScoredShouldBeZeroBeforeGameBegins() {
		TennisGame tennisGame = new TennisGame();

		assertThat(0, CoreMatchers.is(tennisGame.getSecondPlayerScoredPoint()));
	}
}