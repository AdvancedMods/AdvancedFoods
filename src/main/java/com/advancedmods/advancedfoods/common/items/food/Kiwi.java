package com.advancedmods.advancedfoods.common.items.food;

import com.advancedmods.advancedfoods.common.generic.AFCreativeTab;
import com.advancedmods.advancedfoods.common.generic.AFItemFood;

/**
 * Created by Zandor on 11-2-2015.
 */
public class Kiwi extends AFItemFood {

	public Kiwi(int id, int heal, boolean b) {
        super(id, b);
        setUnlocalizedName("kiwi");
		setCreativeTab(AFCreativeTab.food);
	}

}
