package com.advancedmods.advancedfoods.core;

/**
 * Created by Dennisbonke on 10-2-2015.
 */
public class AFProps {

    // Versioning
    public static final String REQUIRED_MC_VERSION = "1.7.10";
    public static final String ACCEPTED_MC_VERSIONS = REQUIRED_MC_VERSION + "," + "1.7.2";
    public static final String VERSION_BASE = "0.2.0";
    public static final String VERSION_IDENTIFIER = "A1";
    public static final String VERSION_COMPLETE = REQUIRED_MC_VERSION + "-" + VERSION_BASE + "-" + VERSION_IDENTIFIER;
    public static final String FORGE_BASE = "10.13.2.";
    public static final String FORGE_BUILD = "1240";
    public static final String FORGE_VERSION = "[" + FORGE_BASE + FORGE_BUILD + "]";

    // General Mod stuff
    public static final String name = "Advanced Foods";
    public static final String modid = "advancedfoods";
    public static final String version = VERSION_COMPLETE;
    public static final String dependencies = "required-after:Forge@" + FORGE_VERSION + ";" + "required-after:dbcore";
    public static final String commonproxy = "com.advancedmods.advancedfoods.common.CommonProxy";
    public static final String clientproxy = "com.advancedmods.advancedfoods.client.ClientProxy";

}
