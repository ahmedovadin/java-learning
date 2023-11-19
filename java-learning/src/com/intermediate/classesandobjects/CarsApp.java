package com.intermediate.classesandobjects;

public class CarsApp {
    public static void main(String[] args) {
        DodgeChallenger dodgeChallenger = new DodgeChallenger();
        dodgeChallenger.startEngine();

        System.out.println("----------------------------------");
        DodgeChallenger orangeDodgeChallenger = new DodgeChallenger("orange");
    }


}
