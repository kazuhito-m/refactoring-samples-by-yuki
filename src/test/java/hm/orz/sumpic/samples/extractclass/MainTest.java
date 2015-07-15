package hm.orz.sumpic.samples.extractclass;

import junit.framework.JUnit4TestAdapter;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MainTest {
    @Test
    public void testMain() {
        Book book = new Book(
                "The title of the book",
                "ISBNxxxx",
                "$12.34",
                "A. U. Thor",
                "author@example.com");
        String actual = book.toXml();
        String expected
                = "<book>"
                + "<title>The title of the book</title>"
                + "<isbn>ISBNxxxx</isbn>"
                + "<price>$12.34</price>"
                + "<author>"
                + "<name>A. U. Thor</name>"
                + "<mail>author@example.com</mail>"
                + "</author>"
                + "</book>";
        assertThat(expected, is(actual));
    }

    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(MainTest.class);
    }
}
