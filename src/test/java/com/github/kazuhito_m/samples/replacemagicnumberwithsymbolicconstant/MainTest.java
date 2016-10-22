package com.github.kazuhito_m.samples.replacemagicnumberwithsymbolicconstant;

import static org.junit.Assert.*;
import junit.framework.JUnit4TestAdapter;

import org.junit.Test;

import com.hyuki.refbook.StandardOutputTest;

public class MainTest extends StandardOutputTest {
    @Test public void testMain() {
        // Expected
        String expected = getExpectedOutput(
            "Andrew walks.",
            "Andrew stops.",
            "Andrew jumps.");

        // Actual
        Main.main(new String[0]);
        String actual = getActualOutput();

        // Assert
        assertEquals(expected, actual);
    }

    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(MainTest.class);
    }
}
