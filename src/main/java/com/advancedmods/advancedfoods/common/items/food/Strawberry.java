package com.advancedmods.advancedfoods.common.items.food;

import com.advancedmods.advancedfoods.common.generic.AFCreativeTab;
import com.advancedmods.advancedfoods.common.generic.AFItemFood;

/**
 * Created by Zandor on 11-2-2015.
 */
public class Strawberry extends AFItemFood {

	public Strawberry(int id, int heal, boolean b) {
        super(id, b);
        setUnlocalizedName("strawberry");
		setCreativeTab(AFCreativeTab.food);
	}
}
