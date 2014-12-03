package com.zandor300.advancedfoods.initialization;

import com.zandor300.advancedfoods.items.food.Butter;
import com.zandor300.advancedfoods.items.food.Cheese;
import com.zandor300.advancedfoods.items.food.Cherry;
import com.zandor300.advancedfoods.items.food.Chilli;
import com.zandor300.advancedfoods.items.food.Strawberry;
import com.zandor300.advancedfoods.items.food.Tomato;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

/**
 * Created by Smith on 2-12-2014.
 */
public class ModItems {

	public static Item butter = new Butter(4000, 1, false);
	public static Item cheese = new Cheese(4001, 5, false);
	public static Item cherry = new Cherry(4002, 4, false);
	public static Item chilli = new Chilli();
	public static Item strawberry = new Strawberry();
	public static Item tomato = new Tomato();

	public static void init() {
		GameRegistry.registerItem(butter, butter.getUnlocalizedName());
		GameRegistry.registerItem(cheese, cheese.getUnlocalizedName());
		GameRegistry.registerItem(cherry, cherry.getUnlocalizedName());
		GameRegistry.registerItem(chilli, chilli.getUnlocalizedName());
		GameRegistry.registerItem(strawberry, strawberry.getUnlocalizedName());
		GameRegistry.registerItem(tomato, tomato.getUnlocalizedName());
	}

}
