package intermediate.inheritance.athlete;

import java.util.Random;

public class BasketballPlayer extends Athlete{

    private double freeThrowPercentage;
    private double pointsPerGame;

    public BasketballPlayer(String name, String nickname, int yearfBorn, String team, double freeThrowPercentage, double pointsPerGame,  int gamesPlayed) {
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

    public void getBio(){
        super.getBio();
        System.out.printf("Free throw percentage: %s\n", freeThrowPercentage);
        System.out.printf("Points per game: %s\n", pointsPerGame);
    }

    @Override
    public void playGame() {
        super.playGame();
        freeThrow();
    }

    public void setFreeThrowPercentage(double freeThrowPercentage) {
        this.freeThrowPercentage = freeThrowPercentage;
    }

    public void setPointsPerGame(double pointsPerGame) {
        this.pointsPerGame = pointsPerGame;
    }
}
