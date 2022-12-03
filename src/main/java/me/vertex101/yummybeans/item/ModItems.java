package me.vertex101.yummybeans.item;

import me.vertex101.yummybeans.YummyBeans;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public  static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, YummyBeans.MOD_ID);

    public static final RegistryObject<Item> BEAN_BLACK = ITEMS.register("bean_black",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.YUMMY_TAB)));
    public static final RegistryObject<Item> BEAN_BLUE = ITEMS.register("bean_blue",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.YUMMY_TAB)));
    public static final RegistryObject<Item> BEAN_GREEN = ITEMS.register("bean_green",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.YUMMY_TAB)));
    public static final RegistryObject<Item> BEAN_PURPLE = ITEMS.register("bean_purple",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.YUMMY_TAB)));
    public static final RegistryObject<Item> BEAN_RED = ITEMS.register("bean_red",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.YUMMY_TAB)));
    public static final RegistryObject<Item> BEAN_YELLOW = ITEMS.register("bean_yellow",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.YUMMY_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
