package com.advancedmods.advancedfoods.core;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Dennisbonke on 12-2-2015.
 */
public class AFPotion extends Potion {

    public static void init()
    {
        spice.setPotionName("advancedfoods.potion.spice");
        spice.setIconIndex(6, 0);
        spice.setEffectiveness(0.25D);
    }

    public static final AFPotion spice = new AFPotion(24, true, 5149489, new ItemStack[0]);
    private final List<ItemStack> curativeItems;

    public AFPotion(int id1, boolean badEffect, int liquidColor, ItemStack... curativeItems1)
    {
        super(id1, badEffect, liquidColor);

        this.curativeItems = Arrays.asList(curativeItems1);
    }

    public void performEffect(EntityLivingBase entity, int amplifier)
    {
        if (this.id == spice.id) {
            entity.attackEntityFrom(AFDamageSource.spicy, amplifier / 100 + 0.5F);
        }
    }

    public boolean isReady(int duration, int amplifier)
    {
        if (this.id == spice.id)
        {
            int rate = 25 >> amplifier;
            return duration % rate == 0;
        }
        return false;
    }

    public void applyTo(EntityLivingBase entity, int duration, int amplifier)
    {
        PotionEffect effect = new PotionEffect(this.id, duration, amplifier);
        effect.setCurativeItems(this.curativeItems);

        entity.addPotionEffect(effect);
    }

}
