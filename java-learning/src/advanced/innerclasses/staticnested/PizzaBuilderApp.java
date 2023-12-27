package advanced.innerclasses.staticnested;

import advanced.enumcoding.PizzaSize;
import advanced.innerclasses.staticnested.Pizza;

public class PizzaBuilderApp {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder("Pizza cake", PizzaSize.LARGE).build();
        System.out.printf("Name: %s\n", pizza.getName());
        System.out.printf("Size: %s\n", pizza.getPizzaSize());
        System.out.printf("Extra tomato sauce: %s\n", pizza.isExtraTomatoSauce());
        System.out.printf("Salad: %s\n", pizza.isSalad());
    }
}
