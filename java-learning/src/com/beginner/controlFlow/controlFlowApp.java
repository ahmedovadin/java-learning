package com.beginner.controlFlow;

public class controlFlowApp {
    public static void main(String[] args) {
        char energyEfficiencyCategory = 'Z';

        switch(energyEfficiencyCategory) {
            case 'A':
            case 'B':
                System.out.println("Low energy consumption");
                break;
            case 'G':
                System.out.println("Very high energy consumption");
                break;
            default:
                System.out.println("Not defined category");
        }

        {
            int numberOfOwners = 5;
            {
                numberOfOwners++;
            }

            System.out.printf("Number of owners: %s", numberOfOwners);
        }
    }
}
