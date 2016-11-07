package com.github.kazuhito_m.samples.replaceInheritancewithdelegation;

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
                "1, 5, 3, 4, 6, 3, 3, 4, 5, 3, ",
                "3, 5, 6, 6, 5, 4, 2, 1, 2, 4, ",
                "3, 5, 6, 6, 5, 4, 2, 1, 2, 4, ");
        String actual = getActualOutput();
        assertThat(actual, is(expected));
    }

}
