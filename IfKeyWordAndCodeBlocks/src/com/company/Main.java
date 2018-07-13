package com.company;

public class Main {

    public static void main(String[] args) {
	  boolean gameOver = true;
	  int score = 5000;
	  int levelCompleted = 5;
	  int bonus = 100;

	  if(score == 5000) {
	      System.out.println("Score is 5000");
      }

      if(score < 5000) {
          System.out.println("Score is < 5000");
      } else if (score < 1000) {
	      System.out.println("Score < 1000");
      }else {
	      System.out.println("Got here");
      }

      if(gameOver) { //gameOver == true
	      int finalScore = score + (levelCompleted * bonus);
	      System.out.println("final score: " + finalScore);
      }

      if(gameOver) {
	      score = 10000;
	      levelCompleted = 8;
	      bonus = 200;
	      int finalScore = score + (levelCompleted * bonus);
	      System.outn.println("new final score: " + finalScore);
      }

    }
}
