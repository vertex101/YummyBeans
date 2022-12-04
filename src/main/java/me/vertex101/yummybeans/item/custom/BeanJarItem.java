package me.vertex101.yummybeans.item.custom;

import me.vertex101.yummybeans.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class BeanJarItem extends Item {
    public BeanJarItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        if(!pLevel.isClientSide && pUsedHand == InteractionHand.MAIN_HAND) {
            if(pPlayer.isShiftKeyDown()) {
                pPlayer.addItem(new ItemStack(beans[getBean()]));
                pPlayer.addItem(new ItemStack(beans[getBean()]));
                pPlayer.addItem(new ItemStack(beans[getBean()]));
                pPlayer.addItem(new ItemStack(beans[getBean()]));
                pPlayer.addItem(new ItemStack(beans[getBean()]));
                pPlayer.sendSystemMessage(Component.literal("You have been given 5 BEANS !!!"));
            } else {
                pPlayer.addItem(new ItemStack(beans[getBean()]));
                pPlayer.sendSystemMessage(Component.literal("You have been given a BEAN !!!"));
            }
        }
        return super.use(pLevel, pPlayer, pUsedHand);
    }

    private int getBean() {
        return RandomSource.createNewThreadLocalInstance().nextInt(beans.length);
    }

    Item[] beans = {
            ModItems.BEAN_BLACK.get(),
            ModItems.BEAN_BLUE.get(),
            ModItems.BEAN_GREEN.get(),
            ModItems.BEAN_PURPLE.get(),
            ModItems.BEAN_RED.get(),
            ModItems.BEAN_YELLOW.get()
    };
}
