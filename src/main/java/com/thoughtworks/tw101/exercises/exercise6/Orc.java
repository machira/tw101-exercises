package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by machira on 6/6/15.
 */
public class Orc implements Monster {
    private String name = "Orc";
    private int hitpoints = 20;
    @Override
    public void takeDamage(int amount) {
        hitpoints -= amount;
    }

    @Override
    public String reportStatus() {
        return String.format("%s - %d",name,hitpoints);
    }
}
