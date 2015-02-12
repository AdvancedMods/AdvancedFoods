package com.advancedmods.advancedfoods.common.items.food;

import com.advancedmods.advancedfoods.common.generic.AFCreativeTab;
import com.advancedmods.advancedfoods.common.generic.AFItemFood;
import com.advancedmods.advancedfoods.common.generic.AFItemSeeds;
import com.advancedmods.advancedfoods.common.init.ModBlocks;
import net.minecraft.init.Blocks;

/**
 * Created by Zandor on 11-2-2015.
 */
public class Kiwi extends AFItemSeeds {

    public Kiwi() {
        super(1, 0.3F, ModBlocks.kiwiPlant, Blocks.farmland);
        setUnlocalizedName("kiwi");
        setCreativeTab(AFCreativeTab.food);
    }

}
