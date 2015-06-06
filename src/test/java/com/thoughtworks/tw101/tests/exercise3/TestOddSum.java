package com.thoughtworks.tw101.tests.exercise3;

import com.thoughtworks.tw101.exercises.exercise3.OddSum;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by machira on 6/6/15.
 */
public class TestOddSum
{
    @Test
    public void testOf(){
        OddSum oddSum = new OddSum();
        Assert.assertEquals(4,oddSum.of(0,4));
    }
}
