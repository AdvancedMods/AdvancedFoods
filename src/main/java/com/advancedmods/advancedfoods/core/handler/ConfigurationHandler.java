package com.advancedmods.advancedfoods.core.handler;

import com.advancedmods.advancedfoods.core.AFProps;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Configuration Handler for Advanced Foods
 * Created by Dennisbonke on 31-3-2015.
 *
 * @author Dennis Bonke
 * @since 0.2.0B2
 */
public class ConfigurationHandler {

    public static Configuration config;

    // Config declarations
    public static boolean bananaEnabled = true;
    public static boolean bananaSeedEnabled = true;
    public static boolean bananaSeedDropEnabled = true;
    public static boolean bananaSmoothieEnabled = true;
    public static boolean butterEnabled = true;
    public static boolean caramelEnabled = true;
    public static boolean checkUpdates = true;
    public static boolean cheeseEnabled = true;
    public static boolean cherryEnabled = true;
    public static boolean cherryLemonadeEnabled = true;
    public static boolean cherrySeedEnabled = true;
    public static boolean cherrySeedDropEnabled = true;
    public static boolean cherrySmoothieEnabled = true;
    public static boolean chickenSandwichEnabled = true;
    public static boolean chilliEnabled = true;
    public static boolean chilliSeedEnabled = true;
    public static boolean chilliSeedDropEnabled = true;
    public static boolean chocolateEnabled = true;
    public static boolean chocolateCakeEnabled = true;
    public static boolean chocolateCupCakeEnabled = true;
    public static boolean chocolateMilkEnabled = true;
    public static boolean chocolateSmoothieEnabled = true;
    public static boolean cornEnabled = true;
    public static boolean cornSeedEnabled = true;
    public static boolean cornSeedDropEnabled = true;
    public static boolean cupcakeEnabled = true;
    public static boolean doughEnabled = true;
    public static boolean fishSandwichEnabled = true;
    public static boolean flourEnabled = true;
    public static boolean friesEnabled = true;
    public static boolean hamburgerEnabled = true;
    public static boolean hotdogEnabled = true;
    public static boolean iceCubesEnabled = true;
    public static boolean isDeveloper = false;
    public static boolean jarEnabled = true;
    public static boolean jellybeansEnabled = true;
    public static boolean ketchupEnabled = true;
    public static boolean kiwiEnabled = true;
    public static boolean kiwiLemonadeEnabled = true;
    public static boolean kiwiSeedEnabled = true;
    public static boolean kiwiSeedDropEnabled = true;
    public static boolean kiwiSmoothieEnabled = true;
    public static boolean knifeEnabled = true;
    public static boolean lemonEnabled = true;
    public static boolean lemonSeedEnabled = true;
    public static boolean lemonSeedDropEnabled = true;
    public static boolean lemonSmoothieEnabled = true;
    public static boolean lemonadeEnabled = true;
    public static boolean mayoEnabled = true;
    public static boolean mustardEnabled = true;
    public static boolean saltEnabled = true;
    public static boolean smoothieGlassEnabled = true;
    public static boolean strawberryEnabled = true;
    public static boolean strawberryLemonadeEnabled = true;
    public static boolean strawberrySeedEnabled = true;
    public static boolean strawberrySeedDropEnabled = true;
    public static boolean strawberrySmoothieEnabled = true;
    public static boolean tacoEnabled = true;
    public static boolean toastEnabled = true;
    public static boolean toastSandwichEnabled = true;
    public static boolean tomatoEnabled = true;
    public static boolean tomatoSeedEnabled = true;
    public static boolean tomatoSeedDropEnabled = true;
    public static boolean tomatoSoupEnabled = true;
    public static boolean wasabiEnabled = true;
    public static boolean uncookedFriesEnabled = true;

    public static void init(File configFile) {
        // Create the configuration object from the given configuration file
        if (config == null) {
            config = new Configuration(configFile);
            loadConfig();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.modID.equalsIgnoreCase(AFProps.modid)) {
            loadConfig();
        }
    }

    private static void loadConfig() {
        // Name, Category, Default value Description
        bananaEnabled = config.getBoolean("bananaEnabled", Configuration.CATEGORY_GENERAL, true, "If false, disable banana's");
        bananaSeedDropEnabled = config.getBoolean("bananaSeedDropEnabled", Configuration.CATEGORY_GENERAL, true, "If false, disable banana seed drop");
        bananaSeedEnabled = config.getBoolean("bananaSeedEnabled", Configuration.CATEGORY_GENERAL, true, "If false, disable banana seed");
        bananaSmoothieEnabled = config.getBoolean("bananaSmoothieEnabled", Configuration.CATEGORY_GENERAL, true, "If false, disable banana smoothie");
        butterEnabled = config.getBoolean("butterEnabled", Configuration.CATEGORY_GENERAL, true, "If false, disable butter");
        caramelEnabled = config.getBoolean("caramelEnabled", Configuration.CATEGORY_GENERAL, true, "If false, disable caramel");
        checkUpdates = config.getBoolean("checkUpdates", Configuration.CATEGORY_GENERAL, true, "Set this to false to disable the update checker");
        cheeseEnabled = config.getBoolean("cheeseEnabled", Configuration.CATEGORY_GENERAL, true, "");
        cherryEnabled = config.getBoolean("cherryEnabled", Configuration.CATEGORY_GENERAL, true, "");
        cherryLemonadeEnabled = config.getBoolean("cherryLemonadeEnabled", Configuration.CATEGORY_GENERAL, true, "");
        cherrySeedDropEnabled = config.getBoolean("cherrySeedDropEnabled", Configuration.CATEGORY_GENERAL, true, "");
        cherrySeedEnabled = config.getBoolean("cherrySeedEnabled", Configuration.CATEGORY_GENERAL, true, "");
        cherrySmoothieEnabled = config.getBoolean("cherrySmoothieEnabled", Configuration.CATEGORY_GENERAL, true, "");
        chickenSandwichEnabled = config.getBoolean("chickenSandwichEnabled", Configuration.CATEGORY_GENERAL, true, "");
        chilliEnabled = config.getBoolean("chilliEnabled", Configuration.CATEGORY_GENERAL, true, "");
        chilliSeedDropEnabled = config.getBoolean("chilliSeedDropEnabled", Configuration.CATEGORY_GENERAL, true, "");
        chilliSeedEnabled = config.getBoolean("chilliSeedEnabled", Configuration.CATEGORY_GENERAL, true, "");
        chocolateEnabled = config.getBoolean("chocolateEnabled", Configuration.CATEGORY_GENERAL, true, "");
        chocolateCakeEnabled = config.getBoolean("chocolateCakeEnabled", Configuration.CATEGORY_GENERAL, true, "");
        chocolateCupCakeEnabled = config.getBoolean("chocolateCupCakeEnabled", Configuration.CATEGORY_GENERAL, true, "");
        chocolateMilkEnabled = config.getBoolean("chocolateMilkEnabled", Configuration.CATEGORY_GENERAL, true, "");
        chocolateSmoothieEnabled = config.getBoolean("chocolateSmoothieEnabled", Configuration.CATEGORY_GENERAL, true, "");
        cornEnabled = config.getBoolean("cornEnabled", Configuration.CATEGORY_GENERAL, true, "");
        cornSeedEnabled = config.getBoolean("cornSeedEnabled", Configuration.CATEGORY_GENERAL, true, "");
        cornSeedDropEnabled = config.getBoolean("cornSeedDropEnabled", Configuration.CATEGORY_GENERAL, true, "");
        cupcakeEnabled = config.getBoolean("cupcakeEnabled", Configuration.CATEGORY_GENERAL, true, "");
        doughEnabled = config.getBoolean("doughEnabled", Configuration.CATEGORY_GENERAL, true, "");
        fishSandwichEnabled = config.getBoolean("fishSandwichEnabled", Configuration.CATEGORY_GENERAL, true, "");
        flourEnabled = config.getBoolean("flourEnabled", Configuration.CATEGORY_GENERAL, true, "");
        friesEnabled = config.getBoolean("friesEnabled", Configuration.CATEGORY_GENERAL, true, "");
        hamburgerEnabled = config.getBoolean("hamburgerEnabled", Configuration.CATEGORY_GENERAL, true, "");
        hotdogEnabled = config.getBoolean("hotdogEnabled", Configuration.CATEGORY_GENERAL, true, "");
        iceCubesEnabled = config.getBoolean("iceCubesEnabled", Configuration.CATEGORY_GENERAL, true, "");
        isDeveloper = config.getBoolean("isDeveloper", Configuration.CATEGORY_GENERAL, false, "If true, Simulate a Dev Env, should be let to false unless you know what you are doing!!");
        jarEnabled = config.getBoolean("jarEnabled", Configuration.CATEGORY_GENERAL, true, "");
        jellybeansEnabled = config.getBoolean("jellybeansEnabled", Configuration.CATEGORY_GENERAL, true, "");
        ketchupEnabled = config.getBoolean("ketchupEnabled", Configuration.CATEGORY_GENERAL, true, "");
        kiwiEnabled = config.getBoolean("kiwiEnabled", Configuration.CATEGORY_GENERAL, true, "");
        kiwiLemonadeEnabled = config.getBoolean("kiwiLemonadeEnabled", Configuration.CATEGORY_GENERAL, true, "");
        kiwiSeedEnabled = config.getBoolean("kiwiSeedEnabled", Configuration.CATEGORY_GENERAL, true, "");
        kiwiSeedDropEnabled = config.getBoolean("kiwiSeedDropEnabled", Configuration.CATEGORY_GENERAL, true, "");
        kiwiSmoothieEnabled = config.getBoolean("kiwiSmoothieEnabled", Configuration.CATEGORY_GENERAL, true, "");
        knifeEnabled = config.getBoolean("knifeEnabled", Configuration.CATEGORY_GENERAL, true, "");
        lemonEnabled = config.getBoolean("lemonEnabled", Configuration.CATEGORY_GENERAL, true, "");
        lemonSeedEnabled = config.getBoolean("lemonSeedEnabled", Configuration.CATEGORY_GENERAL, true, "");
        lemonSeedDropEnabled = config.getBoolean("lemonSeedDropEnabled", Configuration.CATEGORY_GENERAL, true, "");
        lemonSmoothieEnabled = config.getBoolean("lemonSmoothieEnabled", Configuration.CATEGORY_GENERAL, true, "");
        lemonadeEnabled = config.getBoolean("lemonadeEnabled", Configuration.CATEGORY_GENERAL, true, "");
        mayoEnabled = config.getBoolean("mayoEnabled", Configuration.CATEGORY_GENERAL, true, "");
        mustardEnabled = config.getBoolean("mustardEnabled", Configuration.CATEGORY_GENERAL, true, "");
        saltEnabled = config.getBoolean("saltEnabled", Configuration.CATEGORY_GENERAL, true, "");
        smoothieGlassEnabled = config.getBoolean("smoothieGlassEnabled", Configuration.CATEGORY_GENERAL, true, "");
        strawberryEnabled = config.getBoolean("strawberryEnabled", Configuration.CATEGORY_GENERAL, true, "");
        strawberryLemonadeEnabled = config.getBoolean("strawberryLemonadeEnabled", Configuration.CATEGORY_GENERAL, true, "");
        strawberrySeedEnabled = config.getBoolean("strawberrySeedEnabled", Configuration.CATEGORY_GENERAL, true, "");
        strawberrySeedDropEnabled = config.getBoolean("strawberrySeedDropEnabled", Configuration.CATEGORY_GENERAL, true, "Enable strawberry seed drop");
        strawberrySmoothieEnabled = config.getBoolean("strawberrySmoothieEnabled", Configuration.CATEGORY_GENERAL, true, "");
        tacoEnabled = config.getBoolean("tacoEnabled", Configuration.CATEGORY_GENERAL, true, "");
        toastEnabled = config.getBoolean("toastEnabled", Configuration.CATEGORY_GENERAL, true, "");
        toastSandwichEnabled = config.getBoolean("toastSandwichEnabled", Configuration.CATEGORY_GENERAL, true, "");
        tomatoEnabled = config.getBoolean("tomatoEnabled", Configuration.CATEGORY_GENERAL, true, "");
        tomatoSeedEnabled = config.getBoolean("tomatoSeedEnabled", Configuration.CATEGORY_GENERAL, true, "");
        tomatoSeedDropEnabled = config.getBoolean("tomatoSeedDropEnabled", Configuration.CATEGORY_GENERAL, true, "Enable tomato seed drops");
        tomatoSoupEnabled = config.getBoolean("tomatoSoupEnabled", Configuration.CATEGORY_GENERAL, true, "Enable tomato soup");
        wasabiEnabled = config.getBoolean("wasabiEnabled", Configuration.CATEGORY_GENERAL, true, "Enable wasabi");
        uncookedFriesEnabled = config.getBoolean("uncookedFriesEnabled", Configuration.CATEGORY_GENERAL, true, "Enable Uncoocked Fries");

        if (config.hasChanged()) {
            config.save();
        }
    }

}
