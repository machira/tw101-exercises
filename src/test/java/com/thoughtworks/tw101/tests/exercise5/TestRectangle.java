package com.thoughtworks.tw101.tests.exercise5;

import com.thoughtworks.tw101.exercises.exercise5.Rectangle;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by machira on 6/6/15.
 */
public class TestRectangle {

    @Test
    public void testArea(){
        Rectangle rectangle = new Rectangle(2,7);
        Assert.assertEquals(14,rectangle.area());
    }
}
