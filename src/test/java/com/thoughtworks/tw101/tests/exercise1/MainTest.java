package com.thoughtworks.tw101.tests.exercise1;
import com.thoughtworks.tw101.exercises.exercise1.Main;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MainTest {
//    Main main = new Main();
    @Test
    public void testOddNumbersListSize(){
        Assert.assertEquals(Main.oddNumberList(0, 100).size(), 50);
    }

    @Test
    public void testOddNumbersListOddness(){
        List<Integer> list = Main.oddNumberList(0,10);
        for(Integer i:list){
            assertEquals(i%2,1);
        }
    }

    @Test
    public void testSumOfList(){
        List<Integer> list = Arrays.asList(new Integer[]{-1, 0, 1});
        assertEquals(Main.sumOfList(list),0);
    }


}
