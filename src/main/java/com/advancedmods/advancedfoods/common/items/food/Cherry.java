package com.advancedmods.advancedfoods.common.items.food;

import com.advancedmods.advancedfoods.common.generic.AFCreativeTab;
import com.advancedmods.advancedfoods.common.generic.AFItemSeeds;
import com.advancedmods.advancedfoods.common.init.ModBlocks;
import net.minecraft.init.Blocks;

/**
 * Created by Dennisbonke on 11-2-2015.
 */
public class Cherry extends AFItemSeeds {

	public Cherry() {
		super(1, 0.3F, ModBlocks.cherryPlant, Blocks.farmland);
		setUnlocalizedName("cherry");
		setCreativeTab(AFCreativeTab.food);
	}

}
