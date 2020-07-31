package com.bnpp.kata.tennis.model;

import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;

public class PlayerTest {

	@Test
	public void whenPlayerScorePointThenPlayerScoredPointShouldBeIncrementedByOne() {

		Player player = new Player("FirstPlayer");

		int existingScoredPoint = player.getScoredPoint();
		player.incrementPlayerScore();

		assertThat(existingScoredPoint + 1, is(player.getScoredPoint()));
	}
}