package me.vertex101.yummybeans.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTab {
    public static final CreativeModeTab YUMMY_TAB = new CreativeModeTab("yummytab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BEAN_BLACK.get());
        }
    };
}
