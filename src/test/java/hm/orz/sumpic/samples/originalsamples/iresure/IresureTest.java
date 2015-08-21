package hm.orz.sumpic.samples.originalsamples.iresure;

import hm.orz.sumpic.samples.originalsamples.dictionaly.SuggestDictionary;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by kazuhito_m on 15/07/30.
 */
public class IresureTest {

    @Test
    public void 子クラスのリストを親クラスの変数でうけても上手く行く() {
        List<Inherit> list = new ArrayList<>();

        Inherit item = Inherit.create("一軒目" ,1 ,"一見目のデータです。");
        list.add(item);
        item = Inherit.create("に軒目" ,2 ,"２見目のデータです。");
        list.add(item);
        item = Inherit.create("に軒目" ,3 ,"３見目のデータです。");
        list.add(item);


    }

}
