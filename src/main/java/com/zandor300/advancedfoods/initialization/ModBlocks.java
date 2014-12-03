package com.zandor300.advancedfoods.initialization;

import com.zandor300.advancedfoods.items.crop.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

/**
 * Created by Smith on 2-12-2014.
 */
public class ModBlocks {

	public static Block bananaPlant = new BananaPlant();
	public static Block chilliPlant = new ChilliPlant();
	public static Block lemonPlant = new LemonPlant();
	public static Block strawberryPlant = new StrawberryPlant();
	public static Block tomatoPlant = new TomatoPlant();

	public static void init() {
		GameRegistry.registerBlock(bananaPlant, bananaPlant.getUnlocalizedName());
		GameRegistry.registerBlock(chilliPlant, chilliPlant.getUnlocalizedName());
		GameRegistry.registerBlock(lemonPlant, lemonPlant.getUnlocalizedName());
		GameRegistry.registerBlock(strawberryPlant, strawberryPlant.getUnlocalizedName());
		GameRegistry.registerBlock(tomatoPlant, tomatoPlant.getUnlocalizedName());
	}

}
