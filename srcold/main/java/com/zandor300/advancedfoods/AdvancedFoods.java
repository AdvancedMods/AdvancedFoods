package com.zandor300.advancedfoods;

import com.zandor300.advancedfoods.initialization.ModBlocks;
import com.zandor300.advancedfoods.initialization.ModItems;
import com.zandor300.advancedfoods.initialization.Recipes;
import com.zandor300.advancedfoods.proxy.ServerProxy;
import com.zandor300.advancedfoods.reference.Reference;
import com.zandor300.advancedfoods.utilities.LogHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

/**
 * Created by Zandor300 on 2-12-2014.
 */

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class AdvancedFoods {

	@SidedProxy(clientSide = Reference.CLIENTSIDE, serverSide = Reference.SERVERSIDE)
	public static ServerProxy Proxy;

	@Mod.EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
		ModItems.init();
		ModBlocks.init();

		LogHelper.info("Pre Initialization Complete!");
	}

	@Mod.EventHandler
	public static void Init(FMLInitializationEvent event) {
		Recipes.init();
		LogHelper.info("Initialization Complete!");
	}

	@Mod.EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {
		LogHelper.info("Post Initialization Complete!");
	}
}
