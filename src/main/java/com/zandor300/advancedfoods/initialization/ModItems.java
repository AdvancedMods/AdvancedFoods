package com.zandor300.advancedfoods.initialization;

import com.zandor300.advancedfoods.items.drinks.lemonade.CherryLemonade;
import com.zandor300.advancedfoods.items.drinks.lemonade.Lemonade;
import com.zandor300.advancedfoods.items.drinks.lemonade.StrawberryLemonade;
import com.zandor300.advancedfoods.items.food.Butter;
import com.zandor300.advancedfoods.items.food.Cheese;
import com.zandor300.advancedfoods.items.food.Cherry;
import com.zandor300.advancedfoods.items.food.Chilli;
import com.zandor300.advancedfoods.items.food.Strawberry;
import com.zandor300.advancedfoods.items.food.Tomato;
import com.zandor300.advancedfoods.items.misc.SmoothyGlass;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

/**
 * Created by Smith on 2-12-2014.
 */
public class ModItems {

	// Foods
	public static Item butter = new Butter(4000, 1, false);
	public static Item cheese = new Cheese(4001, 5, false);
	public static Item cherry = new Cherry(4002, 4, false);
	public static Item chilli = new Chilli();
	public static Item strawberry = new Strawberry();
	public static Item tomato = new Tomato();

	// Drinks
	public static Item lemonade = new Lemonade(5000, 4, false);
	public static Item cherryLemonade = new CherryLemonade(5001, 5, false);
	public static Item strawberryLemonade = new StrawberryLemonade(5002, 5, false);

	// Misc
	public static Item smoothyGlass = new SmoothyGlass();

	public static void init() {
		// Foods
		GameRegistry.registerItem(butter, butter.getUnlocalizedName());
		GameRegistry.registerItem(cheese, cheese.getUnlocalizedName());
		GameRegistry.registerItem(cherry, cherry.getUnlocalizedName());
		GameRegistry.registerItem(chilli, chilli.getUnlocalizedName());
		GameRegistry.registerItem(strawberry, strawberry.getUnlocalizedName());
		GameRegistry.registerItem(tomato, tomato.getUnlocalizedName());

		// Drinks
		GameRegistry.registerItem(lemonade, lemonade.getUnlocalizedName());
		GameRegistry.registerItem(cherryLemonade, cherryLemonade.getUnlocalizedName());
		GameRegistry.registerItem(strawberryLemonade, strawberryLemonade.getUnlocalizedName());

		// Misc
		GameRegistry.registerItem(smoothyGlass, smoothyGlass.getUnlocalizedName());
	}

}
