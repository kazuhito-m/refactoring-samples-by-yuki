package hm.orz.sumpic.samples.originalsamples.iresure;

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
        // 子クラスのリスト作成。
        List<Inherit> list = new ArrayList<>();

        Inherit item = Inherit.create("一軒目", 1, "一見目のデータです。");
        list.add(item);
        item = Inherit.create("二軒目", 2, "２見目のデータです。");
        list.add(item);
        item = Inherit.create("三軒目", 3, "３見目のデータです。");
        list.add(item);

        Base item1 = list.get(0);
        Base item2 = list.get(1);
        Base item3 = list.get(2);

        // 取得した変数の型は親でも、メソッドは子…のはず！
        assertThat(item1.getType(), is(100));
        assertThat(item2.getType(), is(200));
        assertThat(item3.getType(), is(300));

        // 無論、小クラスに移し替えても、小クラスのメソッドが使える…はず！
        Inherit childitem1 = (Inherit) item1;
        Inherit childitem2 = (Inherit) item2;
        Inherit childitem3 = (Inherit) item3;

        assertThat(childitem1.getDescription(), is("一見目のデータです。"));
        assertThat(childitem2.getDescription(), is("２見目のデータです。"));
        assertThat(childitem3.getDescription(), is("３見目のデータです。"));

    }


    @Test
    public void 親クラスのリストを子クラスの変数でうけるとうまくいかないのか() {
        // 子クラスのリスト作成。
        List<Base> list = new ArrayList<>();

        Inherit item = Inherit.create("一軒目", 1, "一見目のデータです。");
        list.add((Base) item);
        item = Inherit.create("二軒目", 2, "２見目のデータです。");
        list.add((Base) item);
        item = Inherit.create("三軒目", 3, "３見目のデータです。");
        list.add((Base) item);

        // 本来のクラス型に入れる(ダウンキャスト)は可能
        Inherit item1 = (Inherit) list.get(0);
        Inherit item2 = (Inherit) list.get(1);
        Inherit item3 = (Inherit) list.get(2);
        // 親クラス型にキャスト
        Base base1 = item1;
        Base base2 = item2;
        Base base3 = item3;
        // 無論、メソッドは子のもの・
        assertThat(base1.getType(), is(100));
        assertThat(base2.getType(), is(200));
        assertThat(base3.getType(), is(300));
        assertThat(item1.getDescription(), is("一見目のデータです。"));
        assertThat(item2.getDescription(), is("２見目のデータです。"));
        assertThat(item3.getDescription(), is("３見目のデータです。"));
        // あれ？ここらへんで「何か上手くイカないことがあるはず」と思って始めたのだが…。


    }

}
