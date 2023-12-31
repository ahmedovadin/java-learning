package advanced.innerclasses;

import advanced.enumcoding.PizzaSize;

public class Pizza {
    private String name;
    private PizzaSize pizzaSize;
    private double price;

    class PizzaSlice {
        public String calculatePizzaSliceArea(){
            switch(pizzaSize) {
                case SMALL:
                default:
                    return "Small slice";
                case MEDIUM:
                    return "Medium slice";
                case LARGE:
                    return "Large slice";
            }
        }
    }

    public PizzaSlice cutPizzaSlice(){
       return new PizzaSlice();
    }

    public Pizza(String name, PizzaSize pizzaSize) {
        this.name = name;
        this.pizzaSize = pizzaSize;
        this.price = calculatePrice();
    }

    private double calculatePrice() {
        switch(pizzaSize) {
            case SMALL:
            default:
                return 5.99;
            case MEDIUM:
                return 7.99;
            case LARGE:
                return 10.99;
        }
    }

    public String getName() {
        return name;
    }

    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    public double getPrice() {
        return price;
    }
}
