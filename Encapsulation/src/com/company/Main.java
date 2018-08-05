package com.company;

public class Main {
    public static void main(String[] args) {

        Player player = new Player();
        player.name = "Jorge";
        player.health = 20;
        player.weapon = "Machete";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 11;
        player.health = 100;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());
    }
}
