package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Random;

/**
 * Created by machira on 6/6/15.
 */
public class Game {
    int number;
    public Game(int min, int max){
        Random random = new Random();
        number = min + random.nextInt(max-min);
    }

    public boolean isWin(int guess){
        return guess == number;
    }

    public String highOrLow(int guess){
        if (guess < number){
            return "low";
        }
        return "high";
    }
}
