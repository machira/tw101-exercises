package com.thoughtworks.tw101.tests.exercise7;

import com.thoughtworks.tw101.exercises.exercise7.Game;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by machira on 6/6/15.
 */
public class TestGame {
    @Test
    public void testIsWin(){
        Game game = new Game(3,4);
        Assert.assertTrue(game.isWin(3));
    }

    @Test
    public void testHighOrLow(){
        Game game = new Game(0,6);
        Assert.assertEquals("high",game.highOrLow(7));
        Assert.assertEquals("low",game.highOrLow(-1));
    }
}
