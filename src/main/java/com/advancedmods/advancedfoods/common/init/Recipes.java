package com.advancedmods.advancedfoods.common.init;

import com.advancedmods.advancedfoods.AdvancedFoods;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
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
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(AdvancedFoods.lemonade), new ItemStack(AdvancedFoods.smoothieGlass), new ItemStack(AdvancedFoods.lemon)));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(AdvancedFoods.cherryLemonade), new ItemStack(AdvancedFoods.lemonade), new ItemStack(AdvancedFoods.cherry)));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(AdvancedFoods.strawberryLemonade), new ItemStack(AdvancedFoods.lemonade), new ItemStack(AdvancedFoods.strawberry)));

		// Other
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(AdvancedFoods.chocolateMilk), new ItemStack(Items.milk_bucket), new ItemStack(Blocks.cocoa)));

		// Smoothie
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(AdvancedFoods.bananaSmoothie), new ItemStack(AdvancedFoods.smoothieGlass), new ItemStack(AdvancedFoods.iceCubes), new ItemStack(AdvancedFoods.banana)));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(AdvancedFoods.cherrySmoothie), new ItemStack(AdvancedFoods.smoothieGlass), new ItemStack(AdvancedFoods.iceCubes), new ItemStack(AdvancedFoods.cherry)));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(AdvancedFoods.chocolateSmoothie), new ItemStack(AdvancedFoods.smoothieGlass), new ItemStack(AdvancedFoods.iceCubes), new ItemStack(AdvancedFoods.chocolate)));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(AdvancedFoods.lemonSmoothie), new ItemStack(AdvancedFoods.smoothieGlass), new ItemStack(AdvancedFoods.iceCubes), new ItemStack(AdvancedFoods.lemon)));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(AdvancedFoods.strawberrySmoothie), new ItemStack(AdvancedFoods.smoothieGlass), new ItemStack(AdvancedFoods.iceCubes), new ItemStack(AdvancedFoods.strawberry)));

		// Misc
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(AdvancedFoods.iceCubes, 9), new ItemStack(Blocks.ice)));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(AdvancedFoods.iceCubes), new ItemStack(Items.snowball)));

		// Ingredients
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(AdvancedFoods.flour), new ItemStack(Items.wheat)));
        GameRegistry.addRecipe(new ItemStack(AdvancedFoods.uncoockedFries), new Object[]{"pk", 'p', Items.potato, 'k', new ItemStack(AdvancedFoods.knife, 1, OreDictionary.WILDCARD_VALUE)});

		// Shaped Ore Crafting
		// Foods
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AdvancedFoods.chocolateCake), "ccc", "ses", "www", 'c', AdvancedFoods.chocolate, 's', Items.sugar, 'e', Items.egg, 'w', Items.wheat));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AdvancedFoods.chocolateCupcake, 5), "pcp", " p ", 'p', Items.paper, 'c', AdvancedFoods.chocolateCake));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AdvancedFoods.cupcake, 5), "pcp", " p ", 'p', Items.paper, 'c', Items.cake));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AdvancedFoods.hamburger), " b ", " B ", " b ", 'b', Items.bread, 'B', Items.beef));

		// Misc
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.ice), "iii", "iii", "iii", 'i', new ItemStack(AdvancedFoods.iceCubes)));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AdvancedFoods.jar), " g ", "g g", "ggg", 'g', Blocks.glass_pane));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AdvancedFoods.smoothieGlass), "g g", " g ", 'g', Blocks.glass_pane));

		// Tools
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(AdvancedFoods.knife), "i  ", " s ", "   ", 'i', Items.iron_ingot, 's', Items.stick));

		// Smelting
		// Foods
		GameRegistry.addSmelting(new ItemStack(Items.sugar), new ItemStack(AdvancedFoods.caramel, 3), 5);
		GameRegistry.addSmelting(new ItemStack(Items.bread), new ItemStack(AdvancedFoods.toast), 5);

		// Ingredients
		GameRegistry.addSmelting(new ItemStack(AdvancedFoods.dough), new ItemStack(Items.bread), 5);
	}

}
