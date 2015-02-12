package com.advancedmods.advancedfoods.common.items.drinks;

import com.advancedmods.advancedfoods.common.generic.AFItemFood;

/**
 * Created by Zandor on 12-2-2015.
 */
public class ChocolateMilk  extends AFItemFood {

	public ChocolateMilk(int id, int heal, boolean b) {
		super(id, b);
		this.setUnlocalizedName("chocolatemilk");
		this.setMaxStackSize(1);
	}

}
