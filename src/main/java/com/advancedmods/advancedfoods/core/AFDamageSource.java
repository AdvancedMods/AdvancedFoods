package com.advancedmods.advancedfoods.core;

import net.minecraft.util.DamageSource;

/**
 * Created by Dennisbonke on 12-2-2015.
 */
public class AFDamageSource extends DamageSource {

    public static AFDamageSource spicy = new AFDamageSource("spicy");

    public AFDamageSource(String s)
    {
        super(s);
    }

}
