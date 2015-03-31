package com.advancedmods.advancedfoods;

import com.advancedmods.advancedfoods.common.CommonProxy;
import com.advancedmods.advancedfoods.core.AFProps;
import com.advancedmods.advancedfoods.core.AFRegistry;
import com.advancedmods.advancedfoods.core.handler.ConfigurationHandler;
import com.advancedmods.amcore.core.mod.BaseMod;
import com.advancedmods.amcore.core.mod.updater.UpdateManager;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Dennisbonke on 10-2-2015.
 */
@Mod(name = AFProps.name, modid = AFProps.modid, version = AFProps.version, dependencies = AFProps.dependencies, modLanguage = "java", canBeDeactivated = false, acceptedMinecraftVersions = AFProps.REQUIRED_MC_VERSION)
public class AdvancedFoods extends BaseMod {

	@SidedProxy(clientSide = AFProps.clientproxy, serverSide = AFProps.commonproxy)
	public static CommonProxy proxy;
	@Instance(AFProps.modid)
	public static AdvancedFoods instance;
	public static Logger log = LogManager.getLogger("AdvancedFoods");
	public static final String releaseURL = "https://raw.github.com/AdvancedMods/AdvancedFoods/master/VERSION";

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		// Starting mod
		log.info("Starting Advanced Foods version " + AFProps.version + "...");
		log.info("Entering Pre-Init ...");
		// Update manager
		log.info("Starting Update manager for Advanced Foods...");
		UpdateManager.registerUpdater(new UpdateManager(this, releaseURL, null));
		log.info("Update Manager for Advanced Foods started");
		// Do Pre-Init stuff
        log.info("Setting up configs...");
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        log.info("Configs setup");
        log.info("Registering Items and Blocks...");
        AFRegistry.registerItemsAndBlocks();
        log.info("Items and Blocks registered");
		log.info("Pre-Init complete");

	}

	@EventHandler
	public void init(FMLInitializationEvent event) {

		log.info("Entering Init ...");
		// Init handlers
		log.info("Registering Handlers...");
        AFRegistry.initHandlers();
		log.info("Handlers registered");
		log.info("Adding Grass Seed Hooks...");
        AFRegistry.addGrassSeedsHooks();
		log.info("Grass Seed Hooks added");
        log.info("Registering Recipes...");
        AFRegistry.registerRecipes();
        log.info("Recipes Registered");
        log.info("Init complete");
        log.info("Mod loaded");

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

		log.info("Entering Post-Init ...");
		log.info("Post-Init complete");

	}

	@Override
	public String getModId() {
		return AFProps.modid;
	}

	@Override
	public String getModName() {
		return AFProps.name;
	}

	@Override
	public String getModVersion() {
		return AFProps.version;
	}

}
