package com.advancedmods.advancedfoods.common.generic;

import com.advancedmods.advancedfoods.core.AFRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Dennisbonke on 13-4-2015.
 */
public class AFCreativeTabSauces extends CreativeTabs {

    public AFCreativeTabSauces(String tabLabel) {
        super(tabLabel);
    }

    @Override
    public Item getTabIconItem() {
        return AFRegistry.ketchup;
    }

}
