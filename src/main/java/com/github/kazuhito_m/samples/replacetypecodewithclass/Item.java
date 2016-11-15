package com.github.kazuhito_m.samples.replacetypecodewithclass;

import lombok.Getter;

public class Item {

    @Getter
    private final ItemType type;

    private final String _title;
    private final int _price;

    public Item(ItemType type, String title, int price) {
        this.type = type;
        _title = title;
        _price = price;
    }

    public String getTitle() {
        return _title;
    }

    public int getPrice() {
        return _price;
    }

    public String toString() {
        return "[ "
                + getType().getTypeCode() + ", "
                + getTitle() + ", "
                + getPrice() + " ]";
    }

}
