package com.advancedmods.advancedfoods.common.items.ingredients;

import com.advancedmods.advancedfoods.AdvancedFoods;
import com.advancedmods.advancedfoods.common.generic.AFItemFood;

/**
 * Created by Dennisbonke on 11-2-2015.
 */
public class Butter extends AFItemFood {

	public Butter(int id, int heal, boolean b) {
		super(id, b);
		this.setUnlocalizedName("butter");
		this.setCreativeTab(AdvancedFoods.ingredients);
	}

}
