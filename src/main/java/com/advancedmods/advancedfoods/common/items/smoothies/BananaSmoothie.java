package com.advancedmods.advancedfoods.common.items.smoothies;

import com.advancedmods.advancedfoods.common.generic.AFItemFood;

/**
 * Created by Zandor on 11-2-2015.
 */
public class BananaSmoothie extends AFItemFood {

	public BananaSmoothie(int id, int heal, boolean b) {
		super(id, b);
		this.setUnlocalizedName("bananasmoothie");
		this.setMaxStackSize(1);
	}

}
