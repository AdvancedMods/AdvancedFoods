package com.advancedmods.advancedfoods.common.items.food;

import com.advancedmods.advancedfoods.common.generic.AFCreativeTab;
import com.advancedmods.advancedfoods.common.generic.AFItemSeeds;
import com.advancedmods.advancedfoods.common.init.ModBlocks;
import net.minecraft.init.Blocks;

/**
 * Created by Zandor on 11-2-2015.
 */
public class Lemon extends AFItemSeeds {

	public Lemon() {
		super(1, 0.3F, ModBlocks.lemonPlant, Blocks.farmland);
		setUnlocalizedName("lemon");
		setCreativeTab(AFCreativeTab.food);
	}

}
