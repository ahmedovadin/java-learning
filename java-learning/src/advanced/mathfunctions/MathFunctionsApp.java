package advanced.mathfunctions;

public class MathFunctionsApp {

    public static void main(String[] args) {
        double temperatureYesterday = -5.6;
        double temperatureToday = -Math.random() * 10;
        System.out.printf("Absolute temperature today: %s\n", Math.abs(temperatureToday));
        System.out.printf("Min: %s\n", Math.min(temperatureToday, temperatureYesterday));
        System.out.printf("Max: %s\n", Math.max(temperatureToday, temperatureYesterday));
        System.out.printf("Round: %s\n", Math.round(temperatureToday));
        System.out.printf("Ceiling: %s\n", Math.ceil(temperatureToday));
        System.out.printf("Floor: %s\n", Math.floor(temperatureToday));
        System.out.printf("Power: %s\n", Math.pow(temperatureToday, 2));
        System.out.printf("Square root: %s\n", Math.sqrt(Math.abs(temperatureToday)));
    }
}
