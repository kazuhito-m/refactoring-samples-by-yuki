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
        item = Inherit.create("二軒目" ,2 ,"２見目のデータです。");
        list.add(item);
        item = Inherit.create("三軒目" ,3 ,"３見目のデータです。");
        list.add(item);

        Base item1 = list.get(0);
        Base item2 = list.get(1);
        Base item3 = list.get(2);

        // 取得した変数の型は親でも、メソッドは子…のはず！
        assertThat(item1.getType() , is(100));
        assertThat(item2.getType() , is(200));
        assertThat(item3.getType() , is(300));

        

    }

}
