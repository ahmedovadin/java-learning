package advanced.objecttostring;

import java.util.Arrays;

public class PizzaApp {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Available sizes:");
        for (PizzaSize pizzaSize : PizzaSize.values()) {
            System.out.println("- " + pizzaSize.getPizzaSizeText());
        }
        System.out.println();
        Pizza pizzaOrder = new Pizza("Margareta", PizzaSize.MEDIUM);
        System.out.println("I order the following pizza:");
        System.out.printf("Name: %s\n", pizzaOrder.getName());
        System.out.printf("Size: %s\n", pizzaOrder.getPizzaSize());
        System.out.printf("Price: %s\n", pizzaOrder.getPrice());

        Pizza samePizza = (Pizza) pizzaOrder.clone();
        System.out.println("I order another pizza:");
        System.out.printf("Name: %s\n", samePizza.getName());
        System.out.printf("Size: %s\n", samePizza.getPizzaSize().getPizzaSizeText());
        System.out.printf("Price: %s\n", samePizza.getPrice());

        Pizza anotherPizza = new Pizza("Margareta", PizzaSize.LARGE);
        System.out.println(pizzaOrder.equals(anotherPizza));

        System.out.println("---------------------------------");
        System.out.println(anotherPizza.getClass().getSimpleName());
        System.out.println(anotherPizza.getClass().getName());
        System.out.println(Arrays.toString(anotherPizza.getClass().getFields()));
        System.out.println(Arrays.toString(anotherPizza.getClass().getDeclaredFields()));
        System.out.println(Arrays.toString(anotherPizza.getClass().getMethods()));
        System.out.println(Arrays.toString(anotherPizza.getClass().getDeclaredMethods()));
        System.out.println(anotherPizza.getClass().getSuperclass());

        System.out.println("---------------------------------");
        System.out.println("pizzaOrder's hashcode: " + pizzaOrder.hashCode());
        System.out.println("samePizza's hashcode: " + samePizza.hashCode());
        System.out.println("anotherPizza's hashcode: " + anotherPizza.hashCode());

        System.out.println(pizzaOrder);
    }
}
