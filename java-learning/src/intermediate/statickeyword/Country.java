package intermediate.statickeyword;

public final class Country {
    private static int numberOfCountries;
    private final String NAME;
    private int population;
    private String capital;

    static {
        numberOfCountries = 5;
    }

    static {
        numberOfCountries = 0;
    }
    public Country(String name, int population, String capital) {
        NAME = name;
        this.population = population;
        this.capital = capital;
        numberOfCountries++;
    }

    public final void populationChanged(int change){
        population += change;
    }

    public void getDetails(){
        System.out.printf("Country name: %s, population: %s, Capital: %s\n", NAME, population, capital);
    }

    public static int getNumberOfCountries() {
        return numberOfCountries;
    }
}
