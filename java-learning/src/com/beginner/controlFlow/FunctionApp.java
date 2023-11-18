package com.beginner.controlFlow;

public class FunctionApp {
    public static void main(String[] args) {
        sayhello();
        blackboard(5);
        System.out.printf("The price with 10 percent off: %s\n", getTenPercentOfDiscountPrice(20000));
        System.out.printf("The price with 50 percent off: %s\n", getDiscountPrice(20000, 50));
        System.out.printf("The price with 40 percent off: %s\n", getDiscountPrice(20000.75, 60));
    }

    static void sayhello(){
        System.out.println("Hello!");
    }
    static  void blackboard(int repeatNumber){
        for (int r = 0; r < repeatNumber; r++) {
            System.out.println("Printing line");
        }
    }

    static double getTenPercentOfDiscountPrice(int price){
        return price * 0.9;
    }

    static double getDiscountPrice(int price, int percent){
        return price * percent / 100.0;
    }

    static double getDiscountPrice(double price, int percent){
        return price * percent / 100;
    }
}
