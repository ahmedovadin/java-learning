package intermediate.inheritance.car;

public class CarsApp {
    public static void main(String[] args) {
        DodgeChallenger redDodgeChallenger = new DodgeChallenger("red", (byte)3, (short)450, (short)717, (short)7700, 40000, 15000, true);
        System.out.printf("%s's price is %s\n", redDodgeChallenger.getCarName(), redDodgeChallenger.getPrice());
        redDodgeChallenger.setPrice(-35000);
        System.out.printf("%s's new price is %s\n", redDodgeChallenger.getCarName(), redDodgeChallenger.getPrice());
        redDodgeChallenger.startTheEngine();
        System.out.printf("The car has %s miles\n", redDodgeChallenger.getMileage());
        redDodgeChallenger.drive(200);
        System.out.printf("After driving the car, it has %s miles\n", redDodgeChallenger.getMileage());

        System.out.println("--------------------------------");
        ToyotaSupra blackToyotaSupra = new ToyotaSupra("white", (byte)1, (short)392, (short)492, (short)6700, 30000, 10000, false);
        System.out.printf("%s's price is %s\n", redDodgeChallenger.getCarName(), redDodgeChallenger.getPrice());
        redDodgeChallenger.setPrice(-35000);
        System.out.printf("%s's new price is %s\n", redDodgeChallenger.getCarName(), redDodgeChallenger.getPrice());
        blackToyotaSupra.startTheEngine();
        System.out.printf("The car has %s miles\n", blackToyotaSupra.getMileage());
        System.out.printf("After driving the car, it has %s miles\n", blackToyotaSupra.getMileage());
    }
}
