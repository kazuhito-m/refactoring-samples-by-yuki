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
        // act
        SuggestDictionary actual = SuggestDictionary.loadFor(null);
        //assert
        assertThat(actual.size(), is(8));
        // あとはてきとうに抜き打ち
        assertThat(actual.get(0).toString(), is("AbC"));
        assertThat(actual.get(3).toString(), is("abc (def)"));
        assertThat(actual.get(7).toString(), is("日本語とかね"));
    }

}
