package com.bnpp.kata.tennis.model;

public enum PlayerIndicator {

	FIRSTPLAYER("A"), SECONDPLAYER("B");

	private String value;

	PlayerIndicator(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}