package com.advancedmods.advancedfoods.common.generic;

import com.advancedmods.advancedfoods.AdvancedFoods;
import net.minecraft.item.ItemStack;

/**
 * Created by Dennisbonke on 12-2-2015.
 */
public class AFItemTool extends AFItem {

	public AFItemTool() {
		super(AdvancedFoods.misc);
	}

	public boolean doesContainerItemLeaveCraftingGrid(ItemStack par1ItemStack) {
		return false;
	}

}
