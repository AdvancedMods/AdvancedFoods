package com.advancedmods.advancedfoods.common.items.food;

import com.advancedmods.advancedfoods.common.generic.AFCreativeTab;
import com.advancedmods.advancedfoods.common.generic.AFItemFood;

/**
 * Created by Zandor on 12-2-2015.
 */
public class Corn extends AFItemFood {

	public Corn(int id, int heal, boolean b) {
        super(id, b);
        setUnlocalizedName("corn");
		setCreativeTab(AFCreativeTab.food);
	}

}
