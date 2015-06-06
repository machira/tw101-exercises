package com.thoughtworks.tw101.tests.exercise4;

import com.thoughtworks.tw101.exercises.exercise4.Library;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by machira on 6/6/15.
 */
public class TestLibrary {
    @Test
    public void testprintBooksContaining(){
        Library library = new Library(new String[]{"Below","Ice","Latice","Kremlow"},System.out);
        Assert.assertEquals(library.printBooksContaining("low"),"Below\nKremlow\n");
    }
}
