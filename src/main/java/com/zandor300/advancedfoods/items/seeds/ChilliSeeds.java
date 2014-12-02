package com.zandor300.advancedfoods.items.seeds;

import com.zandor300.advancedfoods.generic.AFCreativeTab;
import com.zandor300.advancedfoods.generic.AFItemSeeds;
import com.zandor300.advancedfoods.initialization.ModBlocks;
import net.minecraft.init.Blocks;

/**
 * Created by Zandor on 3-12-2014.
 */
public class ChilliSeeds extends AFItemSeeds {

    public ChilliSeeds() {
        super(1, 0.3F, ModBlocks.chilliCrop, Blocks.farmland);
        setUnlocalizedName("blueberry");
        setTextureName("recipeplus:blueberry");
        setCreativeTab(AFCreativeTab.food);
    }
}
