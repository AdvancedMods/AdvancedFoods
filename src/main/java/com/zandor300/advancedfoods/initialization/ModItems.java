package com.zandor300.advancedfoods.initialization;

import com.zandor300.advancedfoods.items.food.Strawberry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

/**
 * Created by Smith on 2-12-2014.
 */
public class ModItems {

	public static Item strawberry = new Strawberry(4000, 6, false);

	public static void init() {
		GameRegistry.registerItem(strawberry, "Strawberry");
	}

}
