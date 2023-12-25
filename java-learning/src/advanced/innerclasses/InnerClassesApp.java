package advanced.innerclasses;

import advanced.enumcoding.PizzaSize;

public class InnerClassesApp {

    private static boolean isPizzaReady(int waitedInMinutes){
        class Oven {
            public boolean isPizzaBakedProperly(){
                if(waitedInMinutes > 30) return true;
                else return false;
            }
        }

        Oven oven = new Oven();
        return oven.isPizzaBakedProperly();
    }

    public static void main(String[] args) {
        Pizza firstPizza = new Pizza("Margarita", PizzaSize.MEDIUM);
        System.out.printf("Name: %s\n", firstPizza.getName());
        Pizza secondPizza = new Pizza("Margarita", PizzaSize.MEDIUM){
            @Override
            public String getName(){
                return "Anonymous";
            }
        };

        if(isPizzaReady(40)){
            System.out.println("The pizza is ready");
        } else {
            System.out.println("The pizza is not ready");
        }

        System.out.printf("Name: %s\n", secondPizza.getName());

        Pizza thirdPizza = new Pizza("Margarita", PizzaSize.LARGE);
        Pizza.PizzaSlice pizzaSlice = thirdPizza.new PizzaSlice();
        System.out.printf("Calculated area: %s\n", pizzaSlice.calculatePizzaSliceArea());
    }
}
