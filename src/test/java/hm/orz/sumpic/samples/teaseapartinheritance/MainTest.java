package hm.orz.sumpic.samples.teaseapartinheritance;

import static org.junit.Assert.assertEquals;
import junit.framework.JUnit4TestAdapter;

import org.junit.*;

import com.hyuki.refbook.StandardOutputTest;

import java.io.*;

public class MainTest extends StandardOutputTest {
	@Test
	public void testMain() throws IOException {
		
		String outFilePath = this.getClass().getResource("file.csv").getPath();
		
		Main.main(new String[] {outFilePath});

		String expected = getExpectedOutput("<table>",
				"<tr><td>おはよう</td><td>Good morning.</td></tr>",
				"<tr><td>こんにちは</td><td>Hello.</td></tr>",
				"<tr><td>こんばんは</td><td>Good evening.</td></tr>",
				"<tr><td>おやすみ</td><td>Good night.</td></tr>", "</table>",
				"java", "    applet", "        Applet",
				"        AppletContext", "    awt", "        ActiveEvent",
				"        Button", "        Canvas", "        color",
				"            ColorSpace", "        datatransfer",
				"            Clipboard", "        event",
				"            ActionEvent", "            ActionListener",
				"    io", "        BufferedInputStream",
				"        BufferedOutputStream", "    lang", "        Object",
				"        String", "        StringBuffer", "    util",
				"        ArrayList", "        EventListener", "        Map",
				"        jar", "            JarInputStream",
				"            JarOutputStream", "        logging",
				"            Formatter", "            Logger", "        regex",
				"            Pattern", "        zip",
				"            CheckedInputStream",
				"            CheckedOutputStream");
		String actual = getActualOutput();
		assertEquals(expected, actual);
	}

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(MainTest.class);
	}
}
