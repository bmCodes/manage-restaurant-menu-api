package com.managemenu.constants;

public enum ItemType {
    APPETIZER ("Appetizer"),
    CHICKEN("Chicken"),
    STEAK("Steak"),
    DRINK("Drink"),
    SIGNATURE("Signature"),
    ALCOHOL("Alcohol");

    private final String itemType;

    ItemType(String type) {
        itemType = type;
    }

    public String toString(){
        return this.itemType;
    }
}
