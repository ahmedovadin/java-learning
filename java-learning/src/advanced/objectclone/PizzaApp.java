package advanced.objectclone;

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
    }
}
