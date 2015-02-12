package com.advancedmods.advancedfoods.common.init;

import com.advancedmods.advancedfoods.common.blocks.crops.BananaPlant;
import com.advancedmods.advancedfoods.common.blocks.crops.CherryPlant;
import com.advancedmods.advancedfoods.common.blocks.crops.ChilliPlant;
import com.advancedmods.advancedfoods.common.blocks.crops.KiwiPlant;
import com.advancedmods.advancedfoods.common.blocks.crops.LemonPlant;
import com.advancedmods.advancedfoods.common.blocks.crops.StrawberryPlant;
import com.advancedmods.advancedfoods.common.blocks.crops.TomatoPlant;
import com.advancedmods.advancedfoods.core.AFProps;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

/**
 * Created by Dennisbonke on 11-2-2015.
 */
@GameRegistry.ObjectHolder(AFProps.modid)
public class ModBlocks {

    public static Block bananaPlant = new BananaPlant();
    public static Block cherryPlant = new CherryPlant();
    public static Block chilliPlant = new ChilliPlant();
    public static Block kiwiPlant = new KiwiPlant();
    public static Block lemonPlant = new LemonPlant();
    public static Block strawberryPlant = new StrawberryPlant();
    public static Block tomatoPlant = new TomatoPlant();

    public static void init() {
        GameRegistry.registerBlock(bananaPlant, "bananaplant");
        GameRegistry.registerBlock(cherryPlant, "cherryplant");
        GameRegistry.registerBlock(chilliPlant, "chilliplant");
        GameRegistry.registerBlock(kiwiPlant, "kiwiplant");
        GameRegistry.registerBlock(lemonPlant, "lemonplant");
        GameRegistry.registerBlock(strawberryPlant, "strawberryplant");
        GameRegistry.registerBlock(tomatoPlant, "tomatoplant");
    }

}
