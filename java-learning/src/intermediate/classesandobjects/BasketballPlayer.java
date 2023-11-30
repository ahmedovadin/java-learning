package intermediate.classesandobjects;

import intermediate.inheritance.athlete.Athlete;

import java.util.Random;

public class BasketballPlayer extends Athlete {
    private double freeThrowPercentage;
    private double pointsPerGame;

    public BasketballPlayer(String name, String nickname, int yearfBorn, String team, double freeThrowPercentage, double pointsPerGame, int gamesPlayed) {
        super(name, nickname, yearfBorn, team, gamesPlayed);
        this.freeThrowPercentage = freeThrowPercentage;
        this.pointsPerGame = pointsPerGame;
    }

    public void freeThrow(){
        Random randomNumber = new Random();
        if(randomNumber.nextDouble() * 100 > freeThrowPercentage) {
            System.out.printf("%s failed to score free throw\n", super.getName());
        } else {
            System.out.printf("%s scored free throw\n", super.getName());
        }
    }
}
