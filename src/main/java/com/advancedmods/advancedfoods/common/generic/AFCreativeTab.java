package com.advancedmods.advancedfoods.common.generic;

import com.advancedmods.advancedfoods.common.init.ModItems;
import com.advancedmods.advancedfoods.core.AFProps;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by Dennisbonke on 11-2-2015.
 */
public class AFCreativeTab {

    public static final CreativeTabs food = new CreativeTabs(AFProps.modid) {
        @Override
        public Item getTabIconItem() {
            //return ModItems.strawberry;
            return Items.cake;
        }

        @Override
        public String getTranslatedTabLabel() {
            return "Foods";
        }
    };

    public static final CreativeTabs objects = new CreativeTabs(AFProps.modid) {
        @Override
        public Item getTabIconItem() {
            //return ModItems.smoothyGlass;
            return Item.getItemFromBlock(Blocks.glass);
        }

        @Override
        public String getTranslatedTabLabel() {
            return "Objects";
        }
    };

    public static final CreativeTabs ingredients = new CreativeTabs(AFProps.modid) {
        @Override
        public Item getTabIconItem() {
            //return ModItems.dough;
            return Items.carrot;
        }

        @Override
        public String getTranslatedTabLabel() {
            return "Ingredients";
        }
    };

    public static final CreativeTabs sauces = new CreativeTabs(AFProps.modid) {
        @Override
        public Item getTabIconItem() {
            return ModItems.ketchup;
        }

        @Override
        public String getTranslatedTabLabel() {
            return "Sauces";
        }
    };

}
