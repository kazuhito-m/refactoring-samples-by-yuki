package com.github.kazuhito_m.samples.originalsamples.originalsamples;


import java.util.HashMap;
import java.util.Map;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

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

    public int calcValue7(String type , int value) {
        if (type == null) {
            return 0;
        }
        switch (type) {
            case "a" :
                return value + 1;
            case "b" :
                return value - 1;
            default:
                return 0;

        }
    }


    public int calcValue8(String type , int value) {
        final Map<String , IntUnaryOperator> fs = new HashMap<>();
        fs.put("a", v -> v + 1);
        fs.put("b", v -> v - 1);
        IntUnaryOperator f = fs.get(type);
        if (f == null) {
            return 0;
        } else {
            return f.applyAsInt(value);
        }
    }

}
