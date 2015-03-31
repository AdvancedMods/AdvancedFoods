package com.advancedmods.advancedfoods.common.items.seeds;

import com.advancedmods.advancedfoods.common.generic.AFCreativeTab;
import com.advancedmods.advancedfoods.common.generic.AFItemSeeds;
import com.advancedmods.advancedfoods.core.AFRegistry;
import net.minecraft.init.Blocks;

/**
 * Created by Dennisbonke on 13-2-2015.
 */
public class TomatoSeed extends AFItemSeeds {

    public TomatoSeed() {
        super(1, 0.3F, AFRegistry.tomatoPlant, Blocks.farmland);
        setUnlocalizedName("tomatoseed");
        setCreativeTab(AFCreativeTab.food);
    }

}
