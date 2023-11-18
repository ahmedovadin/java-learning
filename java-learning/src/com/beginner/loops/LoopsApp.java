package com.beginner.loops;

public class LoopsApp {
    public static void main(String[] args) {
        for(int k=1; k<=5;k++){
            if(k == 3) {
                break;
            }
            System.out.printf("Printing number: %s\n", k);
        }

        System.out.println();

        for (int k = 1; k <= 5; k++) {
            for (int l = 1; l <= 2; l++) {
                System.out.printf("k=%s l=%s\n", k, l);
            }
        }
    }
}
