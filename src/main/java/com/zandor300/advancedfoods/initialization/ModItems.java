package com.zandor300.advancedfoods.initialization;

import com.zandor300.advancedfoods.items.food.Cherry;
import com.zandor300.advancedfoods.items.food.Strawberry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

/**
 * Created by Smith on 2-12-2014.
 */
public class ModItems {

	public static Item cherry = new Cherry(4000, 4, false);
	public static Item strawberry = new Strawberry(4001, 6, false);

	public static void init() {
		GameRegistry.registerItem(cherry, "Cherry");
		GameRegistry.registerItem(strawberry, "Strawberry");
	}

}
