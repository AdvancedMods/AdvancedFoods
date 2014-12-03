package com.zandor300.advancedfoods.initialization;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * Created by Smith on 2-12-2014.
 */
public class Recipes {

	public static void init() {
		// Drinks
		// Lemonade
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.lemonade), new ItemStack(ModItems.smoothyGlass), new ItemStack(ModItems.lemon)));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.cherryLemonade), new ItemStack(ModItems.lemonade), new ItemStack(ModItems.cherry)));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.strawberryLemonade), new ItemStack(ModItems.lemonade), new ItemStack(ModItems.strawberry)));

		// Smoothy
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.cherrySmoothy), new ItemStack(ModItems.smoothyGlass), new ItemStack(Blocks.ice), new ItemStack(ModItems.cherry)));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.strawberrySmoothy), new ItemStack(ModItems.smoothyGlass), new ItemStack(Blocks.ice), new ItemStack(ModItems.strawberry)));

		// Misc

	}

}
