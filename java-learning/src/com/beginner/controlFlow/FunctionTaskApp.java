package com.beginner.controlFlow;

public class FunctionTaskApp {
    public static void main(String[] args) {
        String consumption = getEnergyConsumptionCategory('C');
        System.out.println(consumption);
        getCarDescription("CRT", 2000, "good");
    }

    static String getEnergyConsumptionCategory(char energyConsumptionCategory){
        String energyConsumptionCategoryConverted = String.valueOf(energyConsumptionCategory);
        char energyUpperCase = energyConsumptionCategoryConverted.toUpperCase().charAt(0);
        String line;
        switch (energyUpperCase){
            case 'A':
                line = "Very low";
                break;
            case 'B':
                line = "Low";
                break;
            case 'C':
                line = "Normal";
                break;
            case 'D':
                line = "Above normal";
                break;
            case 'F':
                line = "High";
                break;
            case 'G':
                line = "Extremely high";
                break;
            default:
                line = "Categpry is not defined";
        }
        return line;
    }

    static void getCarDescription(String model, int productionYear, String condition){
        System.out.printf("Model: %s Production year: %s Condition: %s \n", model, productionYear, condition);

    }
}
