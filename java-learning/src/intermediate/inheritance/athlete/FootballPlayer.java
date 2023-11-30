package intermediate.inheritance.athlete;

import javax.swing.*;

public class FootballPlayer extends Athlete {
    private int completions;
    private int passingYards;
    public FootballPlayer(String name, String nickname, int yearfBorn, String team, int gamesPlayed, int completions, int passingYards) {
        super(name, nickname, yearfBorn, team, gamesPlayed);
        this.completions = completions;
        this.passingYards = passingYards;
    }

    public void getBio(){
        super.getBio();
        System.out.printf("Completions: %s\n", completions);
        System.out.printf("Passing yards: %s\n", passingYards);
    }

    public void increaseCompletions(int completions) {
        this.completions += completions;
    }

    public void increasePassingYards(int passingYards) {
        this.passingYards += passingYards;
    }
}
