package hm.orz.sumpic.samples.originalsamples.iresure;

import hm.orz.sumpic.samples.originalsamples.dictionaly.SuggestDictionary;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by kazuhito_m on 15/07/30.
 */
public class IresureTest {

    @Test
    public void 子クラスのリストを親クラスの変数でうけても上手く行く() {
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
