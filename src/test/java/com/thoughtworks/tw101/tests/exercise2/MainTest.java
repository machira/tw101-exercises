package com.thoughtworks.tw101.tests.exercise2;

import com.thoughtworks.tw101.exercises.exercise2.Accumulator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;
/**
 * Created by machira on 6/6/15.
 */
public class MainTest {
    @Test
    public void testAccumulator(){
        Accumulator accumulator = new Accumulator();
        accumulator.increment();
        accumulator.increment();
        accumulator.increment();
        Assert.assertEquals(accumulator.total(),3);
    }
}
