package com.zandor300.advancedfoods.initialization;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * Created by Zandor300 on 2-12-2014.
 */
public class Recipes {

	public static void init() {
		// Foods
		GameRegistry.addSmelting(new ItemStack(Items.sugar), new ItemStack(ModItems.caramel, 3), 5);
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.chocolateCupcake, 5), "pcp", " p ", 'p', Items.paper, 'c', ModItems.chocolateCake));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.cupcake, 5), "pcp", " p ", 'p', Items.paper, 'c', Items.cake));

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
