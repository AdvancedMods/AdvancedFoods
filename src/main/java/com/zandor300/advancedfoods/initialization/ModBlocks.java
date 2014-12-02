package com.zandor300.advancedfoods.initialization;

import com.zandor300.advancedfoods.items.crop.CropChilli;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

/**
 * Created by Smith on 2-12-2014.
 */
public class ModBlocks {

    public static Block chilliCrop = new CropChilli();

    public static void init() {
        GameRegistry.registerBlock(chilliCrop, "Chilli Crop");
    }

}
