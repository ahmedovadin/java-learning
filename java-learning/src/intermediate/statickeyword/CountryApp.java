package intermediate.statickeyword;

public class CountryApp {
    public static void main(String[] args) {
        Country brazil = new Country("Brazil", 210000000, "Brasilia");
        System.out.printf("Number of countries: %s\n", Country.getNumberOfCountries());
        Country germany = new Country("Germany", 8300000, "Berlin");
        Country japan = new Country("Japan", 125000000, "Tokyo");
        System.out.printf("Number of countries: %s\n", Country.getNumberOfCountries());
    }
}
