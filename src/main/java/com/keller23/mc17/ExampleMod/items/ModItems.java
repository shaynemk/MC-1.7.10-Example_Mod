package com.keller23.mc17.ExampleMod.items;

import net.minecraft.item.Item;

public final class ModItems {

    public static Item testItem;
    public static Item testFood;

    public static void init() {
        testItem = new TestItem();
        testFood = new TestFood(20, 0.9f, false);
    }
}
