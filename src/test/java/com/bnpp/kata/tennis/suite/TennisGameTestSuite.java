package com.bnpp.kata.tennis.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.bnpp.kata.tennis.TennisGameTest;
import com.bnpp.kata.tennis.model.PlayerTest;

@RunWith(Suite.class)
@SuiteClasses({ TennisGameTest.class, PlayerTest.class })
public class TennisGameTestSuite {

}