package com.intermediate.classesandobjects;

public class DodgeChallenger {
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

    String color;

    DodgeChallenger(){
        System.out.println("DodgeChallenger is created.");
    }

    DodgeChallenger(String color){
        this.color = color;
        System.out.printf("A %s Dodge Challenger is created", color);
    }

    public void startEngine(){
        System.out.println("The engine is started.");
    }

    public void getDecription(){
        System.out.println("2018 Dodge Challenger SRT 392");
        System.out.println("Price: " + price);
        System.out.println("Mileage: " + mileage);
        System.out.println("Registration number: " + registrationNumber);
        System.out.printf("Cubic capacity: %s ccm \n", cubicCapacity);
        System.out.printf("Power: %s km (%s) hp\n", power, horsePower);
        System.out.printf("CO2 emission: %s g/km\n", co2Emission);
        System.out.println("Combined fuel consumption: " + fuelConsumptionCombined + "l/100km");
        System.out.println("Urban fuel consumption: " + fuelConsumptionUrban + "l/100km");
        System.out.println("Extra urban fuel consumption: " + fuelConsumptionExtraUrban + "l/100km");
        System.out.println("Number of previous owners: " + numberOfVehicleOwner);
        System.out.println("Number of doors: " + numberOfDoors);
        System.out.println("Number of seats: " + numberOfSeats);
    }
}
