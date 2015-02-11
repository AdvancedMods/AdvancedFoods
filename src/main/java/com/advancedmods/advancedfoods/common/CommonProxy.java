package com.advancedmods.advancedfoods.common;

import com.advancedmods.advancedfoods.AdvancedFoods;
import com.advancedmods.advancedfoods.common.init.ModBlocks;
import com.advancedmods.advancedfoods.common.init.ModItems;
import com.advancedmods.advancedfoods.core.enviroment.CheckEnv;

/**
 * Created by Dennisbonke on 11-2-2015.
 */
public class CommonProxy {

    public static void preInit() {

        // ModItems
        AdvancedFoods.log.debug("Loading Items...");
        ModItems.init();
        AdvancedFoods.log.debug("Items loaded");
        // ModBlocks
        AdvancedFoods.log.debug("Loading Blocks...");
        ModBlocks.init();
        AdvancedFoods.log.debug("Blocks loaded");
        // Check Mods
        CheckEnv.CheckMods();

    }

    public static void Init() {

    }

    public static void postInit() {

    }

}
