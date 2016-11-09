package com.github.kazuhito_m.samples.introduceassertion;

import junit.framework.JUnit4TestAdapter;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MainTest {

    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(MainTest.class);
    }

    @Test
    public void testMain() {
        SortSample sorter = new SortSample(new int[]{3, 1, 4, 1, 5, 9});
        sorter.sort();
        String actual = sorter.toString();
        String expected = "[ 1, 1, 3, 4, 5, 9, ]";
        assertThat(actual, is(expected));
    }

    @Test
    public void testZero() {
        SortSample sorter = new SortSample(new int[]{});
        sorter.sort();
        String actual = sorter.toString();
        String expected = "[ ]";
        assertThat(actual, is(expected));
    }

    @Test
    public void testRandom() {
        SortSample sorter = new SortSample(new int[]{8, 3, 3, 0, 0, 3, 9, 9, 7, 7,});
        sorter.sort();
        String actual = sorter.toString();
        String expected = "[ 0, 0, 3, 3, 3, 7, 7, 8, 9, 9, ]";
        assertThat(actual, is(expected));
    }
    
}
