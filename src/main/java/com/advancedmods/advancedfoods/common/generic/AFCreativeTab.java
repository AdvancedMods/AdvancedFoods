package com.advancedmods.advancedfoods.common.generic;

import com.advancedmods.advancedfoods.common.init.ModItems;
import com.advancedmods.advancedfoods.core.AFProps;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Dennisbonke on 11-2-2015.
 */
public class AFCreativeTab {

	public static final CreativeTabs food = new CreativeTabs(AFProps.modid) {
		@Override
		public Item getTabIconItem() {
			return ModItems.strawberry;
		}

		@Override
		public String getTranslatedTabLabel() {
			return "AdvancedFoods:Foods";
		}
	};

	public static final CreativeTabs misc = new CreativeTabs(AFProps.modid) {
		@Override
		public Item getTabIconItem() {
			return ModItems.smoothieGlass;
		}

		@Override
		public String getTranslatedTabLabel() {
			return "AdvancedFoods:Misc";
		}
	};

	public static final CreativeTabs ingredients = new CreativeTabs(AFProps.modid) {
		@Override
		public Item getTabIconItem() {
			return ModItems.dough;
		}

		@Override
		public String getTranslatedTabLabel() {
			return "AdvancedFoods:Ingredients";
		}
	};

	public static final CreativeTabs sauces = new CreativeTabs(AFProps.modid) {
		@Override
		public Item getTabIconItem() {
			return ModItems.ketchup;
		}

		@Override
		public String getTranslatedTabLabel() {
			return "AdvancedFoods:Sauces";
		}
	};

}
