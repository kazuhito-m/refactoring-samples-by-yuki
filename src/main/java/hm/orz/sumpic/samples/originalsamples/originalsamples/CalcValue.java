package hm.orz.sumpic.samples.originalsamples.originalsamples;



/**
 * Created by kazuhito_m on 15/10/05.
 */
public class CalcValue {


    public int calcValue(String type , int value) {
        if ("a".equals(type)) {
            return value + 1;
        } else if ("b".equals(type)) {
            return value - 1;
        } else {
            return 0;
        }
    }

}
