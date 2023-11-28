package com.beginner.datatypes;

import intermediate.classesandobjects.DodgeChallenger;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        byte numberOfSeats = 5;
        byte numberOfDoors = 5;
        byte numberOfVehicleOwner = 1;
        byte emmissionSticker = 4;

        short power = 362;
        short horsePower = 492;
        short co2Emission  = 333;
        short cubicCapacity  = 6417;

        int price = 29999;
        int mileage = 14999;

        long registrationNumber = 234567812312312313L;

        float fuelConsumptionCombined = 15.5F;
        float fuelConsumptionUrban = 21.4F;
        float fuelConsumptionExtraUrban = 13.6F;

        double fuelConsumptionPreciseAverage = 1.567263263823;

        boolean isDamaged = false;

        char energyEfficiencyCategory = 'G';

        System.out.println("2018 Dodge Challenger SRT 392");
        System.out.println("Price: " + price);
        System.out.println("Mileage: " + mileage);
        System.out.println("The car is damaged: " + isDamaged);
        System.out.println("Registration number: " + registrationNumber);
        System.out.printf("Cubic capacity: %s ccm \n", cubicCapacity);
        System.out.printf("Power: %s km (%s) hp\n", power, horsePower);
        System.out.printf("CO2 emission: %s g/km\n", co2Emission);
        System.out.printf("Emission sticker: %s (Energy efficiency category: %s)\n", emmissionSticker, energyEfficiencyCategory);
        System.out.println("Combined fuel consumption: " + fuelConsumptionCombined + "l/100km");
        System.out.println("Urban fuel consumption: " + fuelConsumptionUrban + "l/100km");
        System.out.println("Extra urban fuel consumption: " + fuelConsumptionExtraUrban + "l/100km");
        System.out.println("Precise combined fuel consumption: " + fuelConsumptionPreciseAverage + "l/100km");
        System.out.println("Number of previous owners: " + numberOfVehicleOwner);
        System.out.println("Number of doors: " + numberOfDoors);
        System.out.println("Number of seats: " + numberOfSeats);

        System.out.println("Conversion");
        short newNumberOfSeats = numberOfSeats;
        System.out.println("New value of number of seats: " + newNumberOfSeats);

        int newMileage = mileage;
        System.out.println("New value of mileage: " + newMileage);

        byte newPower = (byte) power;
        System.out.println("New value of power: " + newPower);

        DodgeChallenger redDodgeChallenger = new DodgeChallenger("red", (byte)3, (short)450, (short)717, (short)7700, 40000, 15000, true);

    }
}