package com.advancedmods.advancedfoods.core.enviroment;

import com.advancedmods.advancedfoods.AdvancedFoods;
import cpw.mods.fml.common.Loader;

/**
 * Created by Dennisbonke on 11-2-2015.
 */
public class CheckEnv {

    public static void CheckMods() {

        AdvancedFoods.log.info("Checking Mods...");

        if (Loader.isModLoaded("dbcore")) {
            AdvancedFoods.log.info("Core Init successful");
        }

        if (Loader.isModLoaded("CofhCore")) {
            AdvancedFoods.log.info("CoFHCore found, good to go!");
        }

        if (Loader.isModLoaded("harvestcraft")) {
            AdvancedFoods.log.info("Pam's Harvestcraft found, hello buddy");
        }

        if (Loader.isModLoaded("Natura")) {
            AdvancedFoods.log.info("Natura found, hello buddy");
        }

    }

}
