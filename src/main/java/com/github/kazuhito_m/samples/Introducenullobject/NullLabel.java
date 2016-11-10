package com.github.kazuhito_m.samples.Introducenullobject;

/**
 * 「値がない」Labelを表すクラス。
 */
public class NullLabel extends Label {

    public NullLabel() {
        super("(none)");
    }

    @Override
    public void display() {
        // なにもしない
    }

    @Override
    public boolean isNull() {
        return true;
    }

}

