package com.github.kazuhito_m.samples.replacetypecodewithclass;

import com.hyuki.refbook.StandardOutputTest;
import junit.framework.JUnit4TestAdapter;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@Ignore
public class MainTest extends StandardOutputTest {

    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(MainTest.class);
    }

    @Test
    public void testMain() {
        Main.main(new String[0]);
        String expected = getExpectedOutput(
                "book = [ 0, ���E�̗��j, 4800 ]",
                "dvd  = [ 1, �j���[���[�N�̖��E���ʔ�, 3000 ]",
                "soft = [ 2, �`���[�����O�}�V���G�~�����[�^, 3200 ]");
        String actual = getActualOutput();
        assertThat(actual, is(expected));
    }
}
