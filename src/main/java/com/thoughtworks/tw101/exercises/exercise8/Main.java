package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.

import com.thoughtworks.tw101.exercises.exercise7.Game;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        List<Integer> wrongGuesses = new ArrayList<Integer>(10);
        Game game = new Game(1,100);
        while(true){
            int guess = 0;
            System.out.println("Enter your guess");
            try{
                guess = Integer.valueOf(reader.next());
                if(game.isWin(guess)){
                    System.out.println("!!!!! Congratulations !!!! You Won !!!!");
                    if(wrongGuesses.size() > 0){
                        System.out.println("You made " + wrongGuesses.size() + " guesses: ");
                        System.out.println(wrongGuesses);
                    }
                    break;
                }
                wrongGuesses.add(guess);
                System.out.println("Sorry your guess was too "+game.highOrLow(guess));
            }catch (NumberFormatException ex){
                System.out.println("That was not a number");
            }

        }
    }
}
