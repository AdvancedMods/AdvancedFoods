package com.advancedmods.advancedfoods.common.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * Created by Dennisbonke on 11-2-2015.
 */
public class Recipes {

	public static void init() {
		// Shapeless Ore Crafting
		// Drinks
		// Lemonade
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.lemonade), new ItemStack(ModItems.smoothieGlass), new ItemStack(ModItems.lemon)));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.cherryLemonade), new ItemStack(ModItems.lemonade), new ItemStack(ModItems.cherry)));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.strawberryLemonade), new ItemStack(ModItems.lemonade), new ItemStack(ModItems.strawberry)));

		// Other
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.chocolateMilk), new ItemStack(Items.milk_bucket), new ItemStack(Blocks.cocoa)));

		// Smoothy
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.bananaSmoothie), new ItemStack(ModItems.smoothieGlass), new ItemStack(ModItems.iceCubes), new ItemStack(ModItems.banana)));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.cherrySmoothie), new ItemStack(ModItems.smoothieGlass), new ItemStack(ModItems.iceCubes), new ItemStack(ModItems.cherry)));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.chocolateSmoothie), new ItemStack(ModItems.smoothieGlass), new ItemStack(ModItems.iceCubes), new ItemStack(ModItems.chocolate)));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.lemonSmoothie), new ItemStack(ModItems.smoothieGlass), new ItemStack(ModItems.iceCubes), new ItemStack(ModItems.lemon)));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.strawberrySmoothie), new ItemStack(ModItems.smoothieGlass), new ItemStack(ModItems.iceCubes), new ItemStack(ModItems.strawberry)));

		// Misc
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.iceCubes, 9), new ItemStack(Blocks.ice)));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.iceCubes), new ItemStack(Items.snowball)));

		// Shaped Ore Crafting
		// Foods
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.chocolateCake), "ccc", "ses", "www", 'c', ModItems.chocolate, 's', Items.sugar, 'e', Items.egg, 'w', Items.wheat));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.chocolateCupcake, 5), "pcp", " p ", 'p', Items.paper, 'c', ModItems.chocolateCake));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.cupcake, 5), "pcp", " p ", 'p', Items.paper, 'c', Items.cake));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.hamburger), " b ", " B ", " b ", 'b', Items.bread, 'B', Items.beef));

		// Misc
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.ice), "iii", "iii", "iii", 'i', new ItemStack(ModItems.iceCubes)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.jar), " g ", "g g", "ggg", 'g', Blocks.glass_pane));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.smoothieGlass), "g g", " g ", 'g', Blocks.glass_pane));

		// Smelting
		// Foods
		GameRegistry.addSmelting(new ItemStack(Items.sugar), new ItemStack(ModItems.caramel, 3), 5);
		GameRegistry.addSmelting(new ItemStack(Items.bread), new ItemStack(ModItems.toast), 5);

		// Ingredients
		GameRegistry.addSmelting(new ItemStack(ModItems.dough), new ItemStack(Items.bread), 5);
	}

}
