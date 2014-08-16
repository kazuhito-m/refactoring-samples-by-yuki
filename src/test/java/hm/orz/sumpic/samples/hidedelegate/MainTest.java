package hm.orz.sumpic.samples.hidedelegate;

import static org.junit.Assert.*;
import junit.framework.JUnit4TestAdapter;
import static org.hamcrest.core.Is.*;
import org.junit.Test;

import com.hyuki.refbook.StandardOutputTest;

public class MainTest extends StandardOutputTest {
	@Test
	public void testMain() {
		
		String outFilePath = this.getClass().getResource("address.txt").getPath() + ".out";
		
		Main.main(new String[] {outFilePath});

		String expected = getExpectedOutput(
				"name=Hiroshi Yuki, mail=hyuki@example.com",
				"name=Tomura, mail=tomura@example.com",
				"name=Hanako Sato, mail=hanako@example.com");
		String actual = getActualOutput();

		assertThat(actual, is(expected));
	}

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(MainTest.class);
	}
}
