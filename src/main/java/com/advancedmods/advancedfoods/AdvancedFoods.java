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
            log.error("Could not load or create config, using default values");
            log.error("This is NOT something you should see, even on the first run. Either I messed it up, or Minecraft is acting strange");
            log.fatal("Please report this as a bug report with the minecraft log, the stacktrace, a possible crash report and a list of mods + versions to: " + issueURL);
            e.printStackTrace();
        }
        // Update manager
        if (config.checkUpdates) {
            try {
                log.info("Starting Update manager for Advanced Foods...");
                UpdateManager.registerUpdater(new UpdateManager(this, updateURL, releaseURL));
                log.info("Update Manager for Advanced Foods started");
            } catch (Exception e) {
                log.error("Error starting update checker, printing stacktrace...");
                log.fatal("Please report this as a bug report with the minecraft log, the stacktrace, a possible crash report and a list of mods + versions to: " + issueURL);
                e.printStackTrace();
            }
        } else if (!config.checkUpdates) {
            log.info("Update checker disabled :(");
        } else {
            log.warn("Error reading config, enabling Update checker and using default values");
            log.error("Please check if the configs even exist, and if not file a bugreport");
            UpdateManager.registerUpdater(new UpdateManager(this, updateURL, releaseURL));
        }
        // Registry Items and Blocks
        try {
            log.info("Registering Items and Blocks...");
            AFRegistry.registerItemsAndBlocks();
            log.info("Items and Blocks registered");
        } catch (Exception e) {
            log.fatal("Failed to register items and blocks, printing stacktrace...");
            log.fatal("This should never happen, and this is here for aiding me in fixing stuff");
            log.fatal("Please report this as a bug report with the minecraft log, the stacktrace, a possible crash report and a list of mods + versions to: " + issueURL);
            log.fatal("Halting the game, as this error means there is probably a severe error with either a mod or the Minecraft base game");
            FMLCommonHandler.instance().raiseException(error, "Error initializing items and blocks, See stacktrace and minecraft log for details.", true);
            e.printStackTrace();
        }
		log.info("Pre-Init complete");
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {

		log.info("Entering Init ...");
		// Init handlers
        try {
            log.info("Registering Handlers...");
            AFRegistry.initHandlers();
            log.info("Handlers registered");
            craftingHandlerInit = true;
        } catch (Exception e) {
            log.fatal("Failed to register Handlers, printing stacktrace...");
            log.fatal("Please report this as a bug report with the minecraft log, the stacktrace, a possible crash report and a list of mods + versions to: " + issueURL);
            log.fatal("Skipping recipes as the crafting handler has not been initialized.");
            e.printStackTrace();
            craftingHandlerInit = false;
        }
        // Grass seed hooks
        try {
            log.info("Adding Grass Seed Hooks...");
            AFRegistry.addGrassSeedsHooks();
            log.info("Grass Seed Hooks added");
        } catch (Exception e) {
            log.fatal("Failed to register Grass Seed Hooks, printing stacktrace...");
            log.fatal("Please report this as a bug report with the minecraft log, the stacktrace, a possible crash report and a list of mods + versions to: " + issueURL);
            e.printStackTrace();
        }
        // Recipes
        if (craftingHandlerInit) {
            try {
                log.info("Registering Recipes...");
                AFRegistry.registerRecipes();
                log.info("Recipes Registered");
            } catch (Exception e) {
                log.fatal("Failed to register Recipes, printing stacktrace...");
                log.fatal("Please report this as a bug report with the minecraft log, the stacktrace, a possible crash report and a list of mods + versions to: " + issueURL);
                e.printStackTrace();
            }
        } else {
            log.error("Crafting Handler wasn't initialized, skipping recipes...");
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

}
