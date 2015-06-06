package com.thoughtworks.tw101.tests.exercise5;

import com.thoughtworks.tw101.exercises.exercise5.Rectangle;
import com.thoughtworks.tw101.exercises.exercise5.RectangleAverager;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by machira on 6/6/15.
 */
public class TestRectangleAverager {

    @Test
    public void testAverageArea(){
        Rectangle [] rectangles = {new Rectangle(2,7),new Rectangle(3,5),new Rectangle(4,4)};
        RectangleAverager rectangleAverager = new RectangleAverager();
        Assert.assertEquals(15.0,rectangleAverager.averageArea(rectangles),0.0);
    }
}
