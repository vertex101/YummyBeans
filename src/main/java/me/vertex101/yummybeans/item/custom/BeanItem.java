package me.vertex101.yummybeans.item.custom;

import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class BeanItem extends Item {
    public BeanItem(Properties pProperties) {
        super(pProperties);
    }

   @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {

        if(!pLevel.isClientSide && pUsedHand == InteractionHand.MAIN_HAND) {
            int check = getChance();
            if(check <= 20) {
                pPlayer.addEffect(new MobEffectInstance(affects[getAffect()], 250, 5, false, true));
            } else if (check >= 21 && check <= 40) {
                pPlayer.addEffect(new MobEffectInstance(affects[getAffect()], 250, 5, false, true));
                pPlayer.addEffect(new MobEffectInstance(affects[getAffect()], 250, 5, false, true));
            } else if (check >=41 && check <= 60) {
                pPlayer.addEffect(new MobEffectInstance(affects[getAffect()], 250, 5, false, true));
                pPlayer.addEffect(new MobEffectInstance(affects[getAffect()], 250, 5, false, true));
                pPlayer.addEffect(new MobEffectInstance(affects[getAffect()], 250, 5, false, true));
            } else if (check >= 61 && check <= 80) {
                pPlayer.addEffect(new MobEffectInstance(affects[getAffect()], 250, 5, false, true));
                pPlayer.addEffect(new MobEffectInstance(affects[getAffect()], 250, 5, false, true));
                pPlayer.addEffect(new MobEffectInstance(affects[getAffect()], 250, 5, false, true));
                pPlayer.addEffect(new MobEffectInstance(affects[getAffect()], 250, 5, false, true));
            } else if (check >= 81 && check <= 100) {
                pPlayer.addEffect(new MobEffectInstance(affects[getAffect()], 250, 5, false, true));
                pPlayer.addEffect(new MobEffectInstance(affects[getAffect()], 250, 5, false, true));
                pPlayer.addEffect(new MobEffectInstance(affects[getAffect()], 250, 5, false, true));
                pPlayer.addEffect(new MobEffectInstance(affects[getAffect()], 250, 5, false, true));
                pPlayer.addEffect(new MobEffectInstance(affects[getAffect()], 250, 5, false, true));
            }
        }
        return super.use(pLevel, pPlayer, pUsedHand);
    }

    private int getChance() {
        return RandomSource.createNewThreadLocalInstance().nextInt(100);
    }

    private int getAffect() {
        return RandomSource.createNewThreadLocalInstance().nextInt(affects.length);
    }

    MobEffect[] affects = {
            MobEffects.ABSORPTION, MobEffects.BLINDNESS, MobEffects.CONFUSION, MobEffects.DARKNESS,
            MobEffects.DIG_SLOWDOWN, MobEffects.HUNGER, MobEffects.MOVEMENT_SLOWDOWN, MobEffects.BAD_OMEN,
            MobEffects.WEAKNESS, MobEffects.WITHER, MobEffects.WATER_BREATHING, MobEffects.CONDUIT_POWER,
            MobEffects.GLOWING, MobEffects.HARM, MobEffects.POISON, MobEffects.UNLUCK,
            MobEffects.LUCK, MobEffects.HEAL, MobEffects.DAMAGE_BOOST, MobEffects.FIRE_RESISTANCE,
            MobEffects.SATURATION, MobEffects.DAMAGE_RESISTANCE, MobEffects.DIG_SPEED, MobEffects.MOVEMENT_SPEED,
            MobEffects.NIGHT_VISION, MobEffects.SLOW_FALLING, MobEffects.JUMP, MobEffects.INVISIBILITY
    };
}
