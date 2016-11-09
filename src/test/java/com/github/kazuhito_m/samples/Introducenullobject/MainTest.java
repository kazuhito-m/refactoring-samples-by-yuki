package com.github.kazuhito_m.samples.Introducenullobject;

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
    public void testLabel() {
        Label alice = new Label("Alice");
        String expected = "\"Alice\"";
        String actual = alice.toString();
        assertThat(actual, is(expected));
    }

    @Test
    public void testNullLabel() {
        Label alice = new Label(null);
        String expected = "\"null\"";
        String actual = alice.toString();
        assertThat(actual, is(expected));
    }

    @Test
    public void testNullMail() {
        Person alice = new Person(new Label("Alice"));
        String expected = "[ Person: name=\"Alice\" mail=\"(none)\" ]";
        String actual = alice.toString();
        assertThat(actual, is(expected));
    }

    @Test
    public void testToString() {
        Person alice = new Person(new Label("Alice"), new Label("alice@example.com"));
        String expected = "[ Person: name=\"Alice\" mail=\"alice@example.com\" ]";
        String actual = alice.toString();
        assertThat(actual, is(expected));
    }

    @Test
    public void testDisplay() {
        Person alice = new Person(new Label("Alice"), new Label("alice@example.com"));
        alice.display();
        String expected = getExpectedOutput(
                "display: Alice",
                "display: alice@example.com");
        String actual = getActualOutput();
        assertThat(actual, is(expected));
    }
}
