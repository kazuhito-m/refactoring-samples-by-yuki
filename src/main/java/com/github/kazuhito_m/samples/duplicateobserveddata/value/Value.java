package com.github.kazuhito_m.samples.duplicateobserveddata.value;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class Value {

    private final List<ValueListener> listeners = new ArrayList<>();

    @Getter
    private int value = 0;

    public void addValueListener(ValueListener l) {
        listeners.add(l);
    }

    public void setValue(int value) {
        this.value = value;
        notifyToListeners();
    }

    /**
     * リスナーに値変更を通知するイベント。
     */
    private void notifyToListeners() {
        for (ValueListener l : this.listeners) {
            l.valueChanged(new ValueChangeEvent(this));
        }
    }

    /**
     * もとの値に加算する。
     *
     * @param count 加算値。
     */
    public void add(int count) {
        setValue(getValue() + count);
    }
}
