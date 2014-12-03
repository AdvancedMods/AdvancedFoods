package com.zandor300.advancedfoods.items.food;

import com.zandor300.advancedfoods.generic.AFCreativeTab;
import com.zandor300.advancedfoods.generic.AFItemFood;
import com.zandor300.advancedfoods.generic.AFItemSeeds;
import com.zandor300.advancedfoods.initialization.ModBlocks;
import net.minecraft.init.Blocks;

/**
 * Created by Smith on 2-12-2014.
 */
public class Strawberry extends AFItemSeeds {

	public Strawberry() {
		super(1, 0.3F, ModBlocks.strawberryPlant, Blocks.farmland);
		setUnlocalizedName("Strawberry");
		setCreativeTab(AFCreativeTab.food);
	}

}
