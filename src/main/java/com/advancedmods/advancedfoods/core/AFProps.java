package com.advancedmods.advancedfoods.core;

import com.advancedmods.amcore.core.AMCoreProps;

/**
 * Created by Dennisbonke on 10-2-2015.
 */
public class AFProps {

	// Versioning
	public static final String MC_VERSION = "1.7.10";
	public static final String FORGE_BASE = "10.13.2.";
	public static final String FORGE_BUILD = "1240";
	public static final String FORGE_VERSION = "[" + FORGE_BASE + FORGE_BUILD + "]";
    public static final String AMCORE_VERSION = "[" + AMCoreProps.version + "]";
    public static final String VERSION_BASE = "R0.2.1";
    public static final String VERSION_IDENTIFIER = "B1";

    // General Mod stuff
	public static final String name = "Advanced Foods";
	public static final String modid = "AdvancedFoods";
	public static final String version = MC_VERSION + VERSION_BASE + VERSION_IDENTIFIER;
	public static final String dependencies = "required-after:Forge@" + FORGE_VERSION + ";" + "required-after:AMCore@" + AMCORE_VERSION;
	public static final String commonproxy = "com.advancedmods.advancedfoods.common.CommonProxy";
	public static final String clientproxy = "com.advancedmods.advancedfoods.client.ClientProxy";

}
