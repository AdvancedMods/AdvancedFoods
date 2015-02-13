package com.advancedmods.advancedfoods.common.items.seeds;

import com.advancedmods.advancedfoods.common.generic.AFCreativeTab;
import com.advancedmods.advancedfoods.common.generic.AFItemSeeds;
import com.advancedmods.advancedfoods.common.init.ModBlocks;
import net.minecraft.init.Blocks;

/**
 * Created by Dennisbonke on 13-2-2015.
 */
public class LemonSeed extends AFItemSeeds {

    public LemonSeed() {
        super(1, 0.3F, ModBlocks.lemonPlant, Blocks.farmland);
        setUnlocalizedName("lemonseed");
        setCreativeTab(AFCreativeTab.food);
    }

}
