package com.advancedmods.advancedfoods.common.items.food;

import com.advancedmods.advancedfoods.common.generic.AFCreativeTab;
import com.advancedmods.advancedfoods.common.generic.AFItemFood;

/**
 * Created by Dennisbonke on 11-2-2015.
 */
public class Banana extends AFItemFood {

	public Banana(int id, int heal, boolean b) {
        super(id, b);
        setUnlocalizedName("banana");
		setCreativeTab(AFCreativeTab.food);
	}

}
