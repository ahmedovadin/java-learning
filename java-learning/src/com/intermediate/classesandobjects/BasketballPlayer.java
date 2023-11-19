package com.intermediate.classesandobjects;

import java.util.Random;

public class BasketballPlayer {
    String name;
    String nickname;
    int yearOfBorn;
    String team;

    double freeThrowPercentage;
    double pointsPerGame;
    int gamesPlayed;

    public BasketballPlayer(String name, String nickname, int yearOfBorn, String team, double freeThrowPercentage, double pointsPerGame, int gamesPlayed){
        this.name = name;
        this.nickname = nickname;
        this.team = team;
        this.freeThrowPercentage = freeThrowPercentage;
        this.pointsPerGame = pointsPerGame;
        this.gamesPlayed = gamesPlayed;
    }

    public void freeThrow(){
        Random randomNumberGenerator = new Random();
        if(randomNumberGenerator.nextDouble() * 100 > freeThrowPercentage){
            System.out.printf("%s failed to score free throw\n", name);
        } else {
            System.out.printf("%s scored free throw.\n", name);
        }
    }

}
