package com.thoughtworks.tw101.tests.exercise6;

import com.thoughtworks.tw101.exercises.exercise6.Orc;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by machira on 6/6/15.
 */
public class TestOrc {
    @Test
    public void testReportStatus(){
        Orc orc = new Orc();
        orc.takeDamage(0);
        Assert.assertEquals("Orc - 20",orc.reportStatus());
    }
}
