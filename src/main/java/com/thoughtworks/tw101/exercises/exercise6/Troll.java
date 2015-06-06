package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by machira on 6/6/15.
 */
public class Troll implements Monster {
    private String name = "Troll";
    private int hitpoints = 40;
    @Override
    public void takeDamage(int amount) {
        hitpoints -= amount * 0.5;
    }

    @Override
    public String reportStatus() {
        return String.format("%s - %d", name, hitpoints);
    }
}
