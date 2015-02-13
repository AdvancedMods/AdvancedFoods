package com.advancedmods.advancedfoods.common.items.food;

import com.advancedmods.advancedfoods.common.generic.AFCreativeTab;
import com.advancedmods.advancedfoods.common.generic.AFItemFood;

/**
 * Created by Zandor on 11-2-2015.
 */
public class Lemon extends AFItemFood {

	public Lemon(int id, int heal, boolean b) {
        super(id, b);
        setUnlocalizedName("lemon");
		setCreativeTab(AFCreativeTab.food);
	}

}
