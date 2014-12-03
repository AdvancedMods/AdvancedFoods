package com.zandor300.advancedfoods.generic;

import com.zandor300.advancedfoods.initialization.ModItems;
import com.zandor300.advancedfoods.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Smith on 2-12-2014.
 */
public class AFCreativeTab {

    public static final CreativeTabs food = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return ModItems.strawberry;
        }

        @Override
        public String getTranslatedTabLabel() {
            return "Foods";
        }
    };

    public static final CreativeTabs objects = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return ModItems.smoothyGlass;
        }

        @Override
        public String getTranslatedTabLabel() {
            return "Objects";
        }
    };
}
