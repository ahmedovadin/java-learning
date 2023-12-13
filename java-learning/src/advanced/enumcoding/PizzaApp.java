package advanced.enumcoding;

public class PizzaApp {
    public static void main(String[] args) {
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
    }
}
