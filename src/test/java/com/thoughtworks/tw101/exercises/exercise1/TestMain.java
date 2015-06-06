package com.thoughtworks.tw101.exercises.exercise1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class TestMain {
    @Test
    public void testOddNumbersList(){
        assertEquals(Main.oddNumberList(0,100).size(),50);
    }
}
