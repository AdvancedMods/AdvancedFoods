package com.zandor300.advancedfoods.initialization;

import com.zandor300.advancedfoods.items.food.Cherry;
import com.zandor300.advancedfoods.items.food.Strawberry;
import com.zandor300.advancedfoods.items.minerals.Butter;
import com.zandor300.advancedfoods.items.minerals.Sugar;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

/**
 * Created by Smith on 2-12-2014.
 */
public class ModItems {

	// Foods
	public static Item cherry = new Cherry(4000, 4, false);
	public static Item strawberry = new Strawberry(4001, 6, false);

	// Minerals
	public static Item butter = new Butter(5000);
	public static Item sugar = new Sugar(5001);

	public static void init() {
		// Foods
		GameRegistry.registerItem(cherry, "Cherry");
		GameRegistry.registerItem(strawberry, "Strawberry");

		// Minerals
		GameRegistry.registerItem(butter,"Butter");
		GameRegistry.registerItem(sugar, "Sugar");
	}

}
