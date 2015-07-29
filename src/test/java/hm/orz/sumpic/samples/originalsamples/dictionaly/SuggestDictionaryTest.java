package hm.orz.sumpic.samples.originalsamples.dictionaly;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by kazuhito_m on 15/07/30.
 */
public class SuggestDictionaryTest {

    @Test
    public void 読めたかどうか() {
        SuggestDictionary actual = SuggestDictionary.loadFor(null);
        assertThat(actual.size(), is(8));

        actual.stream().forEach(i -> System.out.println(i.toString()));

    }


}
