package com.beginner.controlFlow;

public class IMDBApp {
    public static void main(String[] args) {
        String actorName = "Tom Cruise";
        int yearOfBorn = 1962;
        int age = 2020 - yearOfBorn;

        String[] movieTitles = {
                 "The last samurai", "Minory Report", "Top Gun",
                "Rain main", "Cocktail", "The mummy"
        };

        float[] movieRatings = {
                7.7F, 7.6F, 6.9F,
                8.0F, 5.9F, 7.1F
        };

        System.out.printf("Actor's name: %s\n", actorName);
        System.out.printf("Born: %s (%s years old)\n", yearOfBorn, age);
        System.out.println("Movies: ");

        for (int i = 0; i < movieTitles.length; i++) {
            System.out.printf("%s - %s\n", movieTitles[i], getRating(movieRatings[i]));
        }
    }

    static String getRating(float rating){
        if(rating <= 5.0){
            return "bad";
        } else if (rating > 5.0 && rating <= 6.5) {
            return "average";
        } else if (rating > 6.5 && rating <= 7.0) {
            return "good";
        } else if (rating > 7.0 && rating <= 8.0) {
            return "very good";
        } else {
            return "amazing";
        }
    }
}
