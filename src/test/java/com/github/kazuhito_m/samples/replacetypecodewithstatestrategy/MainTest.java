package com.github.kazuhito_m.samples.replacetypecodewithstatestrategy;

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
    public void testIgnore() {
        Logger logger = new Logger();
        logger.log("information #1");

        String expected = getExpectedOutput(
                "Ignoring: information #1");
        String actual = getActualOutput();
        assertThat(expected, is(actual));
    }

    @Test
    public void testStart() {
        Logger logger = new Logger();
        logger.log("information #1");
        logger.start();
        logger.log("information #2");
        logger.start();
        logger.log("information #3");

        String expected = getExpectedOutput(
                "Ignoring: information #1",
                "** START LOGGING **",
                "Logging: information #2",
                "Logging: information #3");
        String actual = getActualOutput();
        assertThat(expected, is(actual));
    }

    @Test
    public void testStop() {
        Logger logger = new Logger();
        logger.log("information #1");
        logger.start();
        logger.log("information #2");
        logger.start();
        logger.log("information #3");
        logger.stop();
        logger.log("information #4");
        logger.stop();
        logger.log("information #5");

        String expected = getExpectedOutput(
                "Ignoring: information #1",
                "** START LOGGING **",
                "Logging: information #2",
                "Logging: information #3",
                "** STOP LOGGING **",
                "Ignoring: information #4",
                "Ignoring: information #5");
        String actual = getActualOutput();
        assertThat(expected, is(actual));
    }
}
