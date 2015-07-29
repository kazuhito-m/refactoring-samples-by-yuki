package hm.orz.sumpic.samples.originalsamples.dictionaly;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by kazuhito_m on 15/07/30.
 */
public class SuggestDictionary extends ArrayList<Suggest>{


    /**
     * 何かの条件で読み込む。
     * (今回はサンプル用に適当)
     *
     * @param anycondition 何かの条件。
     * @return 読み込まれた辞書オブジェクト。
     */
    public static SuggestDictionary loadFor(Object anycondition) {
        List<Suggest> l = new ArrayList<>();
        l.add(new Suggest("何かの値","その解説"));
        l.add(new Suggest("abc","def"));
        l.add(new Suggest("abc",null));
        l.add(new Suggest("AbC",""));
        l.add(new Suggest("日本語とかね",""));
        l.add(new Suggest("SuggestDictonaly","suggest"));
        l.add(new Suggest("sakurada","Familia"));
        l.add(new Suggest("これで","あってんのかな？"));
        SuggestDictionary sd = new SuggestDictionary();
        Collections.sort(l, new Comparator<Suggest>() {
            @Override
            public int compare(Suggest left, Suggest right) {
                return left.toString().compareTo(right.toString());
            }
        });
        sd.addAll(Collections.unmodifiableList(l));
        return sd;
    }


}
