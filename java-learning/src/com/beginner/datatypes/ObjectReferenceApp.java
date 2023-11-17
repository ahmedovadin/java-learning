package com.beginner.datatypes;

public class ObjectReferenceApp {
    public static void main(String[] args) {
        Byte numberOfSeats = 5;
        Short horsePower = 392;
        Integer price = 14999;
        Long registrationNumber = 2323423423423423434L;

        Float fuelConsumptioncombined = 15.5F;
        Double fuelConsumptionPrecise = 15.23748274982734;

        Boolean isDamaged = false;
        Character energyEfficiencyCategory = '0';

        String cardModel = "fghhfgfg";
        String cardModelNew = "FGHHFGFG";

        System.out.printf("Number of seats: %s\n", numberOfSeats);
        System.out.printf("Horsepower: %s\n", horsePower);
        System.out.printf("Price: %s\n", price.floatValue());
        System.out.printf("Registration number: %s\n", registrationNumber);
        System.out.printf("Combined fuel consumption: %s\n", fuelConsumptioncombined);
        System.out.printf("Precise fuel consumption: %s\n", fuelConsumptionPrecise.intValue());
        System.out.printf("This car is damaged: %s\n", isDamaged);
        System.out.printf("Energy efficiency category: %s\n", energyEfficiencyCategory);

        System.out.printf("The car model: %s\n", cardModel);
        System.out.printf("The car model: %s\n", cardModel.toUpperCase());
        System.out.printf("The car model: %s\n", cardModel.toLowerCase());
        System.out.printf("The car model and with keyword are equal: %s\n",  cardModel.equals(cardModelNew));
        System.out.printf("The car model with new keyword : %s\n", cardModelNew);
    }
}
