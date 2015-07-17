package hm.orz.sumpic.samples.replaceerrorcodewithexception;

import com.hyuki.refbook.StandardOutputTest;
import junit.framework.JUnit4TestAdapter;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class MainTest extends StandardOutputTest {
    @Test
    public void testNew() {
        Robot robot = new Robot("Andrew");
        String actual = robot.toString();
        String expected = "[ Robot: Andrew position(0, 0), direction(0, 1) ]";
        assertThat(expected, is(actual));
    }

    @Test
    public void testFRFLBLF() {
        Robot robot = new Robot("Andrew");
        robot.execute("forward right forward");
        robot.execute("left backward left forward");
        String actual = robot.toString();
        String expected = "[ Robot: Andrew position(0, 0), direction(-1, 0) ]";
        assertThat(expected, is(actual));
    }

    @Test
    public void testError() {
        Robot robot = new Robot("Andrew");
        robot.execute("farvard");
        String actual = getActualOutput();
        String expected = getExpectedOutput("Invalid command: farvard");
        assertThat(expected, is(actual));
    }

    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(MainTest.class);
    }
}
