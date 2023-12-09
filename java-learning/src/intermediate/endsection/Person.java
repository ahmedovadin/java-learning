package intermediate.endsection;

public abstract class Person {
    private String name;
    private String nickname;
    private int yearOfBorn;
    private String expertIn;
    private Item[] items;

    public Person(String name, String nickname, int yearOfBorn, String expertIn, Item[] items) {
        this.name = name;
        this.nickname = nickname;
        this.yearOfBorn = yearOfBorn;
        this.expertIn = expertIn;
        this.items = items;
    }

    public void printBioData(){
        System.out.printf("Name: %s, (%s)\n", name, nickname);
        System.out.printf("Year of born: %s\n", yearOfBorn);
        System.out.printf("Expert in: %s\n", expertIn);
        System.out.println("The person has the following items:");

        for (Item item: items) {
            System.out.printf("-%s\n", item);
        }
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }
}
