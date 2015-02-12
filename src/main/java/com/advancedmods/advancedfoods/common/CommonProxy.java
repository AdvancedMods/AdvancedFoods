package com.advancedmods.advancedfoods.common;

import com.advancedmods.advancedfoods.AdvancedFoods;
import com.advancedmods.advancedfoods.common.init.ModBlocks;
import com.advancedmods.advancedfoods.common.init.ModItems;
import com.advancedmods.advancedfoods.common.init.Recipes;
import com.advancedmods.advancedfoods.core.enviroment.CheckEnv;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;

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

        // Recipes
        AdvancedFoods.log.info("Loading Recipes...");
        Recipes.init();
        AdvancedFoods.log.info("Recipes Loaded");

    }

    public static void postInit() {

    }

    public World getClientWorld() {

        return null;

    }

    public EntityPlayer getPlayer() {

        return null;

    }

    public static void addGrassSeedsHooks() {

        MinecraftForge.addGrassSeed(new ItemStack(ModItems.banana), 5);
        MinecraftForge.addGrassSeed(new ItemStack(ModItems.cherry), 5);
        MinecraftForge.addGrassSeed(new ItemStack(ModItems.chilli), 5);
        MinecraftForge.addGrassSeed(new ItemStack(ModItems.kiwi), 5);
        MinecraftForge.addGrassSeed(new ItemStack(ModItems.lemon), 5);
        MinecraftForge.addGrassSeed(new ItemStack(ModItems.strawberry), 5);
        MinecraftForge.addGrassSeed(new ItemStack(ModItems.tomato), 5);

    }

}
