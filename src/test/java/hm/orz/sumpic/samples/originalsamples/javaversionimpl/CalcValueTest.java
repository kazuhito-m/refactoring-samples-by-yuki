package hm.orz.sumpic.samples.originalsamples.javaversionimpl;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import hm.orz.sumpic.samples.originalsamples.originalsamples.CalcValue;
import org.junit.Test;

/**
 * Created by kazuhito_m on 15/10/05.
 */
public class CalcValueTest {


    private static CalcValue sut = new CalcValue();

    @Test
    public void Java6以前の書き方() {
        assertThat(sut.calcValue("a", 2) , is(3));
        assertThat(sut.calcValue("b", 2) , is(1));
        assertThat(sut.calcValue("c", 2) , is(0));
        assertThat(sut.calcValue(null, 2) , is(0));
    }

}

