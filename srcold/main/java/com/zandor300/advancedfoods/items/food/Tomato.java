package com.zandor300.advancedfoods.items.food;

import com.zandor300.advancedfoods.generic.AFCreativeTab;
import com.zandor300.advancedfoods.generic.AFItemSeeds;
import com.zandor300.advancedfoods.initialization.ModBlocks;
import net.minecraft.init.Blocks;

/**
 * Created by Smith on 3-12-2014.
 */
public class Tomato extends AFItemSeeds {

	public Tomato() {
		super(1, 0.3F, ModBlocks.tomatoPlant, Blocks.farmland);
		setUnlocalizedName("Tomato");
		setCreativeTab(AFCreativeTab.food);
	}
}
