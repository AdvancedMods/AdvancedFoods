package com.zandor300.advancedfoods.items.food;

import com.zandor300.advancedfoods.generic.AFCreativeTab;
import com.zandor300.advancedfoods.generic.AFItemFood;
import com.zandor300.advancedfoods.generic.AFItemSeeds;
import com.zandor300.advancedfoods.initialization.ModBlocks;
import net.minecraft.init.Blocks;

/**
 * Created by Zandor on 3-12-2014.
 */
public class Banana extends AFItemSeeds {

    public Banana() {
        super(1, 0.3F, ModBlocks.bananaPlant, Blocks.farmland);
        setUnlocalizedName("Banana");
        setCreativeTab(AFCreativeTab.food);
    }
}
