package com.beginner.operators;

public class OperatorsApp {
    public static void main(String[] args) {
        String cardModel = "Dodge Challenger SRT 392";
        int price = 14999;
        int moneyInTheBank = 1000000;
        boolean isDamaged = true;
        System.out.printf("Price of a %s: euro %s\n", cardModel, price);

        int increasedPrice = price + 1000;
        System.out.printf("The increased price of a %s: euro %s\n", cardModel, increasedPrice);
        int decreasedPrice = price - 1000;
        System.out.printf("The decreased price of a %s: euro %s\n", cardModel, decreasedPrice);
        int twoCarsPrice = price * 2;
        System.out.printf("Two %s: euro %s\n", cardModel, twoCarsPrice);
        int dodgesYouCanBuy = moneyInTheBank / price;
        System.out.printf("Fom the money we have in the bank we can buy %s %s\n", dodgesYouCanBuy, cardModel);
        int moneyRemaining = moneyInTheBank % price;
        System.out.printf("Money we would remain after buying %s %s: euro%s", dodgesYouCanBuy, cardModel, moneyRemaining);
        System.out.println();

        int priceNegative = -14999;
        int priceNegativeWithPlusSign = +priceNegative;
        System.out.printf("Negative price with plus sign: euro %s\n", priceNegativeWithPlusSign);
        int priceNegativeWithMinusSign = -priceNegative;
        System.out.printf("Negative price with plus sign: euro %s\n", priceNegativeWithMinusSign);
        int priceOneEuroIncrease = ++price;
        System.out.printf("Price after 1 euro increase: euro %s\n", priceOneEuroIncrease);
        int priceOneEuroDecrease = --price;
        System.out.printf("Price after 1 euro decrease: euro %s\n", priceOneEuroDecrease);
        System.out.println();

        System.out.printf("Car's price equals the money in the bank: %s\n", (price == moneyInTheBank));
        System.out.printf("Car's price equals doesn't equals the money in the bank: %s\n", (price != moneyInTheBank));
        System.out.printf("Car's price equals is greater than the money in the bank: %s\n", (price > moneyInTheBank));
        System.out.printf("Car's price equals is lesser than  the money in the bank: %s\n", (price < moneyInTheBank));
        System.out.printf("Car's price equals is greater than or equals the money in the bank: %s\n", (price >= moneyInTheBank));
        System.out.printf("Car's price equals is lesser than or equals the money in the bank: %s\n", (price <= moneyInTheBank));
        System.out.printf("The cardModel variable's datatype is a String %s", (cardModel instanceof String));
    }
}
