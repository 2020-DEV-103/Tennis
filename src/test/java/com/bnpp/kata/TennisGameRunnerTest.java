package com.bnpp.kata;

import static org.junit.Assert.assertThat;

import java.io.ByteArrayInputStream;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

import com.bnpp.kata.tennis.exception.InvalidUserInputException;

public class TennisGameRunnerTest {

	@Test
	public void shouldReturnTheGameResultBasedOnUserInputsWhenPlayGameMethodIsCalled()
			throws InvalidUserInputException {
		StringBuilder inputStreamBuilder = new StringBuilder("FirstPlayer").append("\n").append("SecondPlayer")
				.append("\n").append("A").append("\n").append("A").append("\n").append("B").append("\n").append("A")
				.append("\n").append("A");

		System.setIn(new ByteArrayInputStream(inputStreamBuilder.toString().getBytes()));
		TennisGameRunner gameRunner = new TennisGameRunner();
		String gameResult = gameRunner.playGame();

		assertThat(gameResult, is("FirstPlayer won the game"));
	}
}