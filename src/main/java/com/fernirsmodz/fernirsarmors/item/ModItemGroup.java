package com.fernirsmodz.fernirsarmors.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup FERNIRS_GROUP = new ItemGroup("FernirsarmorsTAB") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.MITHRIL.get());
        }
    };
}
