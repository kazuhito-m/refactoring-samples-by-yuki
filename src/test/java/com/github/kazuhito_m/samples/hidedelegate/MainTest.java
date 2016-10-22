package com.github.kazuhito_m.samples.hidedelegate;

import com.hyuki.refbook.StandardOutputTest;
import junit.framework.JUnit4TestAdapter;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

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
