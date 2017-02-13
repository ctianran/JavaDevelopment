package com.company;

/**
 * Created by Tianran on 9/7/2016.
 */
public class Methods {

    public static void main(String[] args){
		boolean gameOver = true;
	    int score = 800;
	    int levelCompleted = 5;
	    int bonus = 100;

	    int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
	    System.out.println("Your final score was" + highScore);

	    score = 10000;
	    levelCompleted = 8;
	    bonus = 200;

	    calculateScore(gameOver, score, levelCompleted, bonus);


	    int highScorePosition = calculateHighScorePosition(1500);
	    displayhighScorePosition("Tim", highScorePosition);

	     highScorePosition = calculateHighScorePosition(900);
	    displayhighScorePosition("Bob", highScorePosition);

	    highScorePosition = calculateHighScorePosition(400);
	    displayhighScorePosition("Percy", highScorePosition);

	    highScorePosition = calculateHighScorePosition(50);
	    displayhighScorePosition("Gilbert", highScorePosition);

	    highScorePosition = calculateHighScorePosition(1000);
	    displayhighScorePosition("Louise", highScorePosition);

	    highScorePosition = calculateHighScorePosition(500);
	    displayhighScorePosition("Carol", highScorePosition);

	    highScorePosition = calculateHighScorePosition(100);
	    displayhighScorePosition("Frank", highScorePosition);
    }


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
	    if(gameOver) {
	    	int finalScore = score + (levelCompleted * bonus);
		    finalScore += 1000;
		    System.out.println("Your final score was " + finalScore);
		    return finalScore;
	    } else {
		    return -1;
	    }
    }


	public static void displayhighScorePosition(String playerName, int highScorePosition) {
		System.out.println(playerName + " managed to get into position "
							+ highScorePosition + " on the high score table");
	}

	public static int calculateHighScorePosition(int playerScore){
		if(playerScore >= 1000) {
			return 1;
		} else if (playerScore >= 500 && playerScore < 1000){
			return 2;
		} else if (playerScore >= 100 && playerScore < 500) {
			return 3;
		} else {
			return 4;
		}

	}

}
