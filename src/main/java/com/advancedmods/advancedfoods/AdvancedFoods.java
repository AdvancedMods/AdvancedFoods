package com.advancedmods.advancedfoods;

import com.advancedmods.advancedfoods.common.CommonProxy;
import com.advancedmods.advancedfoods.common.generic.AFCreativeTabFood;
import com.advancedmods.advancedfoods.common.generic.AFCreativeTabIngredients;
import com.advancedmods.advancedfoods.common.generic.AFCreativeTabMisc;
import com.advancedmods.advancedfoods.common.generic.AFCreativeTabSauces;
import com.advancedmods.advancedfoods.core.AFProps;
import com.advancedmods.advancedfoods.core.AFRegistry;
import com.advancedmods.advancedfoods.core.handler.ConfigurationHandler;
import com.advancedmods.amcore.core.mod.BaseMod;
import com.advancedmods.amcore.core.mod.updater.UpdateManager;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.MinecraftError;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Dennisbonke on 10-2-2015.
 */
@Mod(name = AFProps.name, modid = AFProps.modid, version = AFProps.version, dependencies = AFProps.dependencies, modLanguage = "java", canBeDeactivated = false, acceptedMinecraftVersions = AFProps.MC_VERSION)
public class AdvancedFoods extends BaseMod {

	@SidedProxy(clientSide = AFProps.clientproxy, serverSide = AFProps.commonproxy)
	public static CommonProxy proxy;
	@Instance(AFProps.modid)
	public static AdvancedFoods instance;
	public static Logger log = LogManager.getLogger("AdvancedFoods");
	public static final String updateURL = "https://raw.github.com/AdvancedMods/AdvancedFoods/master/VERSION";
    public static final String releaseURL = "http://ci.zsinfo.nl/job/AdvancedFoods/lastSuccessfulBuild";
    public static final String issueURL = "https://www.github.com/AdvancedMods/AdvancedFoods/issues";
    public static boolean isDev;
    private static ConfigurationHandler config;
    private static boolean craftingHandlerInit;
    // Creative Tabs
    public static CreativeTabs food = new AFCreativeTabFood("Food");
    public static CreativeTabs misc = new AFCreativeTabMisc("Misc");
    public static CreativeTabs ingredients = new AFCreativeTabIngredients("Ingredients");
    public static CreativeTabs sauces = new AFCreativeTabSauces("Sauces");
    private static MinecraftError error = new MinecraftError();

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		// Starting mod
		log.info("Starting Advanced Foods version " + AFProps.version + "...");
		log.info("Entering Pre-Init ...");
		// Do Pre-Init stuff
        // Configs
        log.info("Setting up configs...");
        try {
            ConfigurationHandler.init(event.getSuggestedConfigurationFile());
            log.info("Configs setup");
        } catch (Exception e) {
            log.error("====================ERROR!====================");
            log.error("Could not load or create config, using default values");
            log.error("This is NOT something you should see, even on the first run. Either I messed it up, or Minecraft is acting strange");
            log.error("Please report this as a bug report with the minecraft log, the stacktrace, a possible crash report and a list of mods + versions to: " + issueURL);
            log.error("====================ERROR!====================");
            e.printStackTrace();
        }
        if (config.isDeveloper) {
            log.warn("====================WARNING!====================");
            log.warn("Config value isDeveloper enabled, simulating a dev env, this may cause crashes!");
            log.warn("Please disable isDeveloper, unless you are debugging or you know what you are doing!!");
            log.warn("====================WARNING!====================");
            isDev = true;
        } else if (!config.isDeveloper) {
            isDev = false;
        } else {
            log.error("Could not read config file for isDev entry, using default value of false...");
            log.error("Config error, please file a bug report with the stacktrace of the config preInit, the minecraft log and a mod list + version to: " + issueURL);
            log.error("This is bad, but not fatal, proceeding with defaults...");
            isDev = false;
        }
        // Update manager
        if (config.checkUpdates) {
            try {
                log.info("Starting Update manager for Advanced Foods...");
                UpdateManager.registerUpdater(new UpdateManager(this, updateURL, releaseURL));
                log.info("Update Manager for Advanced Foods started");
            } catch (Exception e) {
                log.error("====================ERROR!====================");
                log.error("Error starting update checker, printing stacktrace...");
                log.error("Please report this as a bug report with the minecraft log, the stacktrace, a possible crash report and a list of mods + versions to: " + issueURL);
                log.error("====================ERROR!====================");
                e.printStackTrace();
            }
        } else if (!config.checkUpdates) {
            log.info("Update checker disabled :(");
        } else {
            log.error("====================WARNING!====================");
            log.error("Error reading config, enabling Update checker and using default values");
            log.error("Please check the configs and file a bugreport if there are any errors");
            log.error("====================WARNING!====================");
            UpdateManager.registerUpdater(new UpdateManager(this, updateURL, releaseURL));
        }
        // Items and Blocks Registry
        try {
            log.info("Registering Items and Blocks...");
            AFRegistry.registerItemsAndBlocks();
            log.info("Items and Blocks registered");
        } catch (Exception e) {
            log.fatal("====================FATAL ERROR!====================");
            log.fatal("Failed to register items and blocks, printing stacktrace...");
            log.fatal("This should never happen, and this is here for aiding me in fixing stuff");
            log.fatal("Please report this as a bug report with the minecraft log, the stacktrace, a possible crash report and a list of mods + versions to: " + issueURL);
            log.fatal("Halting the game, as this error means there is probably a severe error with either a mod or the Minecraft base game");
            log.fatal("====================FATAL ERROR!====================");
            e.printStackTrace();
            FMLCommonHandler.instance().raiseException(error, "Error initializing items and blocks, See stacktrace and minecraft log for details.", true);
        }
		log.info("Pre-Init complete");
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {

		log.info("Entering Init ...");
		// Handlers Registry
        try {
            log.info("Registering Handlers...");
            AFRegistry.initHandlers();
            log.info("Handlers registered");
            craftingHandlerInit = true;
        } catch (Exception e) {
            log.fatal("====================FATAL ERROR!====================");
            log.fatal("Failed to register Handlers, printing stacktrace...");
            log.fatal("Please report this as a bug report with the minecraft log, the stacktrace, a possible crash report and a list of mods + versions to: " + issueURL);
            log.fatal("Skipping recipes as the crafting handler has not been initialized.");
            log.fatal("====================FATAL ERROR!====================");
            e.printStackTrace();
            craftingHandlerInit = false;
        }
        // Grass seed hooks Registry
        try {
            log.info("Adding Grass Seed Hooks...");
            AFRegistry.addGrassSeedsHooks();
            log.info("Grass Seed Hooks added");
        } catch (Exception e) {
            log.error("====================ERROR!====================");
            log.error("Failed to register Grass Seed Hooks, printing stacktrace...");
            log.error("Please report this as a bug report with the minecraft log, the stacktrace, a possible crash report and a list of mods + versions to: " + issueURL);
            log.error("====================ERROR!====================");
            e.printStackTrace();
        }
        // Recipes Registry
        if (craftingHandlerInit) {
            try {
                log.info("Registering Recipes...");
                AFRegistry.registerRecipes();
                log.info("Recipes Registered");
            } catch (Exception e) {
                log.error("====================ERROR!====================");
                log.error("Failed to register Recipes, printing stacktrace...");
                log.error("Please report this as a bug report with the minecraft log, the stacktrace, a possible crash report and a list of mods + versions to: " + issueURL);
                log.error("====================ERROR!====================");
                e.printStackTrace();
            }
        } else {
            log.warn("Crafting Handler wasn't initialized, skipping recipes...");
        }
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

    private void callDevCrash() {
        if (isDev) {
            log.fatal("====================DEV/FATAL ERROR!====================");
            log.fatal("Called a Dev crash, halting game!");
            log.fatal("Do not report this as a bug, please check your config.");
            log.fatal("Set isDeveloper to false to stop this from happening!");
            log.fatal("This code _should_ be removed in Release Candidates and Releases, Betas should be safe, although they may have it. I can NOT promise an alpha doesn't have them!!!!");
            log.fatal("====================DEV/FATAL ERROR!====================");
            FMLCommonHandler.instance().raiseException(error, "Called a Dev Crash!", true);
        } else if (!isDev) {
            log.error("Config value 'isDeveloper' is not enabled, aborting...");
        } else {
            log.error("Attempting to call a dev crash before isDeveloper was checked, aborting...");
        }
    }

}
