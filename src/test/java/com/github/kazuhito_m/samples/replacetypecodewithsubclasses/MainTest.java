package com.github.kazuhito_m.samples.replacetypecodewithsubclasses;

import com.hyuki.refbook.StandardOutputTest;
import junit.framework.JUnit4TestAdapter;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MainTest extends StandardOutputTest {

    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(MainTest.class);
    }

    @Test
    public void testMain() {
        Main.main(new String[0]);

        String expected = getExpectedOutput(
                "drawLine: [ LINE, (0, 0)-(100, 200) ]",
                "drawRectangle: [ RECTANGLE, (10, 20)-(30, 40) ]",
                "drawOval: [ OVAL, (100, 200)-(300, 400) ]");
        String actual = getActualOutput();

        assertThat(actual, is(expected));
    }

}
