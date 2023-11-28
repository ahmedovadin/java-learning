package intermediate.inheritance.athlete;

import java.util.Random;

public class BasketballPlayer {
    private String name;
    private String nickname;
    private int yearfBorn;
    private String team;

    private double freeThrowPercentage;
    private double pointsPerGame;
    private int gamesPlayed;

    public BasketballPlayer(String name, String nickname, int yearfBorn, String team, double freeThrowPercentage, double pointsPerGame, int gamesPlayed) {
        this.name = name;
        this.nickname = nickname;
        this.yearfBorn = yearfBorn;
        this.team = team;
        this.freeThrowPercentage = freeThrowPercentage;
        this.pointsPerGame = pointsPerGame;
        this.gamesPlayed = gamesPlayed;
    }

    public void freeThrow(){
        Random randomNumber = new Random();
        if(randomNumber.nextDouble() * 100 > freeThrowPercentage) {
            System.out.printf("%s failed to score free throw\n", name);
        } else {
            System.out.printf("%s scored free throw\n", name);
        }
    }
}
