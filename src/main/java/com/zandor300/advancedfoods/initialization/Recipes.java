package com.zandor300.advancedfoods.initialization;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

/**
 * Created by Smith on 2-12-2014.
 */
public class Recipes {

	public void init() {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.lemonade), "eee", "e e", "   ", 'e', "gemEmerald"));
	}

}
