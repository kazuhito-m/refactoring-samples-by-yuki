package com.github.kazuhito_m.samples.Introducenullobject;

public class Label {

    /**
     * "null"をあらわす定数。
     */
    public static final Label NULL = new NullLabel();

    private final String _label;

    public Label(String label) {
        _label = label;
    }

    public void display() {
        System.out.println("display: " + _label);
    }

    public String toString() {
        return "\"" + _label + "\"";
    }

    // 教科書とはことなるが、コレももう使わないなら要らないと思う。
//    public boolean isNull() {
//        return false;
//    }

}

