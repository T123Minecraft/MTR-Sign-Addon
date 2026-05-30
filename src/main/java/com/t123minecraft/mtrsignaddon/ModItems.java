package com.t123minecraft.mtrsignaddon;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item MY_NEW_ITEM = register(
            new Identifier(MTRSignAddonUnofficialFork.MOD_ID, "my_new_item"),
            new Item(new Item.Settings())
    );

    private static Item register(Identifier id, Item item) {
        return Registry.register(Registries.ITEM, id, item);
    }

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(MY_NEW_ITEM);
        });
    }
}