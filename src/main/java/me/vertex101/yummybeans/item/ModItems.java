package me.vertex101.yummybeans.item;

import me.vertex101.yummybeans.YummyBeans;
import me.vertex101.yummybeans.item.custom.BeanItem;
import me.vertex101.yummybeans.item.custom.BeanJarItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public  static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, YummyBeans.MOD_ID);

    public static final RegistryObject<Item> BEAN_BLACK = ITEMS.register("bean_black",
            () -> new BeanItem(new Item.Properties().tab(ModCreativeTab.YUMMY_TAB)
                    .food(new FoodProperties.Builder().alwaysEat().fast().saturationMod(2f).build())));
    public static final RegistryObject<Item> BEAN_BLUE = ITEMS.register("bean_blue",
            () -> new BeanItem(new Item.Properties().tab(ModCreativeTab.YUMMY_TAB)
                    .food(new FoodProperties.Builder().alwaysEat().fast().saturationMod(2f).build())));
    public static final RegistryObject<Item> BEAN_GREEN = ITEMS.register("bean_green",
            () -> new BeanItem(new Item.Properties().tab(ModCreativeTab.YUMMY_TAB)
                    .food(new FoodProperties.Builder().alwaysEat().fast().saturationMod(2f).build())));
    public static final RegistryObject<Item> BEAN_PURPLE = ITEMS.register("bean_purple",
            () -> new BeanItem(new Item.Properties().tab(ModCreativeTab.YUMMY_TAB)
                    .food(new FoodProperties.Builder().alwaysEat().fast().saturationMod(2f).build())));
    public static final RegistryObject<Item> BEAN_RED = ITEMS.register("bean_red",
            () -> new BeanItem(new Item.Properties().tab(ModCreativeTab.YUMMY_TAB)
                    .food(new FoodProperties.Builder().alwaysEat().fast().saturationMod(2f).build())));
    public static final RegistryObject<Item> BEAN_YELLOW = ITEMS.register("bean_yellow",
            () -> new BeanItem(new Item.Properties().tab(ModCreativeTab.YUMMY_TAB)
                    .food(new FoodProperties.Builder().alwaysEat().fast().saturationMod(2f).build())));
    public static final RegistryObject<Item> BEAN_JAR = ITEMS.register("bean_jar",
            () -> new BeanJarItem(new Item.Properties().tab(ModCreativeTab.YUMMY_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
