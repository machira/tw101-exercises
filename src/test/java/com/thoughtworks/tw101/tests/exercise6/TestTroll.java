package com.thoughtworks.tw101.tests.exercise6;

import com.thoughtworks.tw101.exercises.exercise6.Troll;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by machira on 6/6/15.
 */
public class TestTroll {
    @Test
    public void testReportStatus(){
        Troll troll = new Troll();
        troll.takeDamage(6);
        Assert.assertEquals("Troll - 37",troll.reportStatus());
    }
}
