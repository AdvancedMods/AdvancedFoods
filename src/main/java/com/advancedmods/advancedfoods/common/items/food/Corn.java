package com.advancedmods.advancedfoods.common.items.food;

import com.advancedmods.advancedfoods.common.generic.AFCreativeTab;
import com.advancedmods.advancedfoods.common.generic.AFItemSeeds;
import com.advancedmods.advancedfoods.common.init.ModBlocks;
import net.minecraft.init.Blocks;

/**
 * Created by Zandor on 12-2-2015.
 */
public class Corn extends AFItemSeeds {

	public Corn() {
		//super(1, 0.3F, ModBlocks.cornPlant, Blocks.farmland);
		// TODO: Create corn plant.
		super(1, 0.3F, null, Blocks.farmland);
		setUnlocalizedName("corn");
		setCreativeTab(AFCreativeTab.food);
	}

}
