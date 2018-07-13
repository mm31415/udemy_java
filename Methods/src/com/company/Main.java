package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(true, 800, levelCompleted, bonus);
        System.out.println("Final score: " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Final score: " + highScore);

        String player1 = "Joey";
        String player2 = "Jane";
        String player3 = "Jannet";
        String player4 = "Jean";

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition(player1, position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition(player2, position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition(player3, position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition(player4, position);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get " + position + " position!");
    }

    public static int calculateHighScorePosition(int score) {
        if(score > 1000) {
            return 1;
        } else if (score > 500) {
            return 2;
        } else if (score > 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
