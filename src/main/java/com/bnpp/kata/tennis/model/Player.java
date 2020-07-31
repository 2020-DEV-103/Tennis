package com.bnpp.kata.tennis.model;

public class Player {

	private int scoredPoint;
	private String name;

	public Player(String name) {
		this.name = name;
	}

	public int getScoredPoint() {
		return scoredPoint;
	}

	public String getName() {
		return name;
	}

	public void incrementPlayerScore() {
		scoredPoint++;
	}
}