package com.github.kazuhito_m.samples.duplicateobserveddata;

import junit.framework.JUnit4TestAdapter;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@Ignore("CIはヘッドレスなので基本的にはスキップしておく")
public class MainTest {

    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(MainTest.class);
    }

    @Test
    public void testMain() {
        IntegerDisplay display = new IntegerDisplay();
        display.setValue(1);
        int actual = display.getValue();
        int expected = 1;
        display.setVisible(false);
        assertThat(expected, is(actual));
    }

}
