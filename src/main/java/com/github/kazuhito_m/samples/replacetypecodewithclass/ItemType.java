package com.github.kazuhito_m.samples.replacetypecodewithclass;

import lombok.Getter;

/**
 * Itemの種類を表すクラス。
 */
public class ItemType {

    public static final ItemType BOOK = new ItemType(0);
    public static final ItemType DVD = new ItemType(1);
    public static final ItemType SOFTWARE = new ItemType(2);

    @Getter
    private final int typeCode;

    private ItemType(int code) {
        this.typeCode = code;
    }

    public static ItemType getItemType(int typeCode) {
        switch (typeCode) {
            case 0:
                return BOOK;
            case 1:
                return DVD;
            case 2:
                return SOFTWARE;
            default:
                return null;
        }
    }

}
