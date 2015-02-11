package com.advancedmods.advancedfoods;

import com.advancedmods.advancedfoods.common.CommonProxy;
import com.advancedmods.advancedfoods.core.AFProps;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Dennisbonke on 10-2-2015.
 */
@Mod(name = AFProps.name, modid = AFProps.modid, version = AFProps.version, dependencies = AFProps.dependencies, modLanguage = "java", canBeDeactivated = false)
public class AdvancedFoods {

    @SidedProxy(clientSide = AFProps.clientproxy, serverSide = AFProps.commonproxy)
    public static CommonProxy proxy;
    @Instance(AFProps.modid)
    public static AdvancedFoods instance;
    public static Logger log = LogManager.getLogger("AdvancedFoods");

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {

        // Starting mod
        log.info("Starting Advanced Foods version " + AFProps.version + "...");
        log.info("Entering Pre-Init phase...");
        // Do Pre-Init stuff
        proxy.preInit();
        log.info("Pre-Init complete");

    }

    @EventHandler
    public static void Init(FMLInitializationEvent event) {

        log.info("Entering Init phase...");
        // Do Init stuff
        proxy.Init();
        log.info("Init complete");

    }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) {

        log.info("Entering Post-Init phase...");
        // Do Post-Init stuff
        proxy.postInit();
        log.info("Post-Init complete");
        log.info("Mod loaded");

    }

}
