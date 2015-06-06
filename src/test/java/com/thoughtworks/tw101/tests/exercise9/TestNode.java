package com.thoughtworks.tw101.tests.exercise9;

import com.thoughtworks.tw101.exercises.exercise9.Node;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by machira on 6/6/15.
 */
public class TestNode {
    @Test
    public void testNames(){
        Node node = new Node("d");
        node.add("c");
        node.add("b");
        node.add("a");
        node.add("C");
        Assert.assertArrayEquals(new String[]{"a","b","c","C","d"},node.names().toArray());
    }
}
