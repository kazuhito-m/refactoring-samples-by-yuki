package com.github.kazuhito_m.samples.Introducenullobject;

/**
 * 「値がない」Labelを表すクラス。
 */
public class NullLabel extends Label {

    protected NullLabel() {
        super("(none)");
    }

    @Override
    public void display() {
        // なにもしない
    }

    // 教科書とはことなるが、コレももう使わないなら要らないと思う。
//    @Override
//    public boolean isNull() {
//        return true;
//    }

}

