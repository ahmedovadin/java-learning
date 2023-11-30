package intermediate.inheritance.athlete;

public class Athlete {
    private String name;
    private String nickname;
    private int yearfBorn;
    private String team;
    private int gamesPlayed;

    public Athlete(String name, String nickname, int yearfBorn, String team, int gamesPlayed) {
        this.name = name;
        this.nickname = nickname;
        this.yearfBorn = yearfBorn;
        this.team = team;
        this.gamesPlayed = gamesPlayed;
    }

    public String getName() {
        return name;
    }

    public void getBio(){
        System.out.printf("%s (%s)\n", name, nickname);
        System.out.printf("Born in %s\n", yearfBorn);
        System.out.printf("Last team is %s and played %s games\n", team, gamesPlayed);
    }

    public void playGame() {
        System.out.println(name + " started a game.");
        gamesPlayed++;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
