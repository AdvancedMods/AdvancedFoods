package com.advancedmods.advancedfoods.common.items.food;

import com.advancedmods.advancedfoods.common.generic.AFCreativeTab;
import com.advancedmods.advancedfoods.common.generic.AFItemFood;
import com.advancedmods.advancedfoods.common.generic.AFItemSeeds;
import com.advancedmods.advancedfoods.common.init.ModBlocks;
import net.minecraft.init.Blocks;

/**
 * Created by Zandor on 11-2-2015.
 */
public class Tomato extends AFItemSeeds {

    public Tomato() {
        super(1, 0.3F, ModBlocks.tomatoPlant, Blocks.farmland);
        setUnlocalizedName("tomato");
        setCreativeTab(AFCreativeTab.food);
    }

}
