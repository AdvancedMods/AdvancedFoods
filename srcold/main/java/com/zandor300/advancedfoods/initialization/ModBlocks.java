package com.zandor300.advancedfoods.initialization;

import com.zandor300.advancedfoods.items.crop.BananaPlant;
import com.zandor300.advancedfoods.items.crop.CherryPlant;
import com.zandor300.advancedfoods.items.crop.ChilliPlant;
import com.zandor300.advancedfoods.items.crop.KiwiPlant;
import com.zandor300.advancedfoods.items.crop.LemonPlant;
import com.zandor300.advancedfoods.items.crop.StrawberryPlant;
import com.zandor300.advancedfoods.items.crop.TomatoPlant;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

/**
 * Created by Smith on 2-12-2014.
 */
public class ModBlocks {

	public static Block bananaPlant = new BananaPlant();
	public static Block cherryPlant = new CherryPlant();
	public static Block chilliPlant = new ChilliPlant();
	public static Block kiwiPlant = new KiwiPlant();
	public static Block lemonPlant = new LemonPlant();
	public static Block strawberryPlant = new StrawberryPlant();
	public static Block tomatoPlant = new TomatoPlant();

	public static void init() {
		GameRegistry.registerBlock(bananaPlant, bananaPlant.getUnlocalizedName());
		GameRegistry.registerBlock(cherryPlant, cherryPlant.getUnlocalizedName());
		GameRegistry.registerBlock(chilliPlant, chilliPlant.getUnlocalizedName());
		GameRegistry.registerBlock(kiwiPlant, kiwiPlant.getUnlocalizedName());
		GameRegistry.registerBlock(lemonPlant, lemonPlant.getUnlocalizedName());
		GameRegistry.registerBlock(strawberryPlant, strawberryPlant.getUnlocalizedName());
		GameRegistry.registerBlock(tomatoPlant, tomatoPlant.getUnlocalizedName());
	}

}
