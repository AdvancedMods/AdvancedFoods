package com.zandor300.advancedfoods.initialization;

import com.zandor300.advancedfoods.items.food.Cheese;
import com.zandor300.advancedfoods.items.food.Cherry;
import com.zandor300.advancedfoods.items.food.Chilli;
import com.zandor300.advancedfoods.items.food.Strawberry;
import com.zandor300.advancedfoods.items.minerals.Butter;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

/**
 * Created by Smith on 2-12-2014.
 */
public class ModItems {

	// Foods
	public static Item cheese = new Cheese(4000, 5, false);
	public static Item cherry = new Cherry(4001, 4, false);
	public static Item chilli = new Chilli(4002, 3, false);
	public static Item strawberry = new Strawberry(4003, 6, false);

	// Minerals
	public static Item butter = new Butter(5000);

	public static void init() {
		// Foods
		GameRegistry.registerItem(cheese, "Cheese");
		GameRegistry.registerItem(cherry, "Cherry");
		GameRegistry.registerItem(chilli, "Chilli");
		GameRegistry.registerItem(strawberry, "Strawberry");

		// Minerals
		GameRegistry.registerItem(butter,"Butter");
	}

}
