package com.github.kazuhito_m.samples.replacetypecodewithclass;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class Item {

    private final ItemType type;
    private final String title;
    private final int price;

    public String toString() {
        return "[ "
                + getType().getTypeCode() + ", "
                + getTitle() + ", "
                + getPrice() + " ]";
    }

}
