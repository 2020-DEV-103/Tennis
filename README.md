# Tennis Game

This program stimulates a tennis game with below rules

* The running score of each game is described in a manner peculiar to tennis: scores from zero to three points are described as 	"love", "fifteen", "thirty", and "forty" respectively.
* If at least three points have been scored by each player, and the scores are equal, the score is "deuce".
* If at least three points have been scored by each side and a player has one more point than his opponent, the score of the game  	is "advantage" for the player in the lead.
* A game is won by the first player to have won at least four points in total and at least two points more than the opponent.

### Assumption

* Each game has only one set to decide the winner
* Minimum and maximum number of player is 2
* Player one will always do the service, hence the game score will be always represented with respect to first player 
  i.e. first player score - second player score
* Once game is over, User has to start next game from the beginning.

## Prerequisites

* Java - Version 1.6 or higher
* Maven - Dependency management
* JUnit - Version 4.12 
* IDE - Eclipse or any other IDE which supports Java 

## Code commit guidelines

  Inspired from Udacity

* feat: a new feature
* fix: a bug fix
* docs: changes to documentation
* style: formatting, missing semi colons, etc; no code change
* refactor: refactoring production code
* test: adding tests, refactoring test; no production code change
* chore: updating build tasks, package manager configs, etc; no production code change
