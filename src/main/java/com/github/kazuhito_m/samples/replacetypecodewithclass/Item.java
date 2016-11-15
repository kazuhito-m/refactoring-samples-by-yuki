package com.github.kazuhito_m.samples.replacetypecodewithclass;

public class Item {

    public static final int TYPECODE_BOOK = ItemType.BOOK.getTypeCode();
    public static final int TYPECODE_DVD = ItemType.DVD.getTypeCode();
    public static final int TYPECODE_SOFTWARE = ItemType.SOFTWARE.getTypeCode();

    private final ItemType _typecode;
    private final String _title;
    private final int _price;

    public Item(int typecode, String title, int price) {
        _typecode = ItemType.getItemType(typecode);
        _title = title;
        _price = price;
    }

    public int getTypecode() {
        return _typecode.getTypeCode();
    }

    public String getTitle() {
        return _title;
    }

    public int getPrice() {
        return _price;
    }

    public String toString() {
        return "[ "
                + getTypecode() + ", "
                + getTitle() + ", "
                + getPrice() + " ]";
    }

}
