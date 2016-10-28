package com.github.kazuhito_m.samples.duplicateobserveddata.value;

import lombok.Getter;

/**
 * 「値の変更」という通知内容を表すクラス。
 */
public class ValueChangeEvent {

    @Getter
    private final Value soruce;

    public ValueChangeEvent(Value source) {
        this.soruce = source;
    }

}
