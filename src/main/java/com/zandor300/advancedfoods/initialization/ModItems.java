package com.zandor300.advancedfoods.initialization;

import com.zandor300.advancedfoods.items.drinks.lemonade.CherryLemonade;
import com.zandor300.advancedfoods.items.drinks.lemonade.Lemonade;
import com.zandor300.advancedfoods.items.drinks.lemonade.StrawberryLemonade;
import com.zandor300.advancedfoods.items.drinks.smoothies.BananaSmoothy;
import com.zandor300.advancedfoods.items.drinks.smoothies.CherrySmoothy;
import com.zandor300.advancedfoods.items.drinks.smoothies.StrawberrySmoothy;
import com.zandor300.advancedfoods.items.food.*;
import com.zandor300.advancedfoods.items.misc.SmoothyGlass;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

/**
 * Created by Smith on 2-12-2014.
 */
public class ModItems {

	// Foods
	public static Item banana = new Banana(4000, 5, false);
	public static Item butter = new Butter(4000, 1, false);
	public static Item cheese = new Cheese(4001, 5, false);
	public static Item cherry = new Cherry(4002, 4, false);
	public static Item chilli = new Chilli();
	public static Item lemon = new Lemon();
	public static Item strawberry = new Strawberry();
	public static Item tomato = new Tomato();
	public static Item tomatoSoup = new TomatoSoup(4000, 6, false);

	// Drinks
	// Lemonade
	public static Item lemonade = new Lemonade(5000, 4, false);
	public static Item cherryLemonade = new CherryLemonade(5001, 5, false);
	public static Item strawberryLemonade = new StrawberryLemonade(5002, 5, false);

	// Smoothy
	public static Item bananaSmoothy = new BananaSmoothy(5000, 6, false);
	public static Item cherrySmoothy = new CherrySmoothy(5000, 6, false);
	public static Item strawberrySmoothy = new StrawberrySmoothy(5000, 6, false);

	// Misc
	public static Item smoothyGlass = new SmoothyGlass();

	public static void init() {
		// Foods
		GameRegistry.registerItem(banana, banana.getUnlocalizedName());
		GameRegistry.registerItem(butter, butter.getUnlocalizedName());
		GameRegistry.registerItem(cheese, cheese.getUnlocalizedName());
		GameRegistry.registerItem(cherry, cherry.getUnlocalizedName());
		GameRegistry.registerItem(chilli, chilli.getUnlocalizedName());
		GameRegistry.registerItem(lemon, lemon.getUnlocalizedName());
		GameRegistry.registerItem(strawberry, strawberry.getUnlocalizedName());
		GameRegistry.registerItem(tomato, tomato.getUnlocalizedName());
		GameRegistry.registerItem(tomatoSoup, tomatoSoup.getUnlocalizedName());

		// Drinks
		// Lemonade
		GameRegistry.registerItem(lemonade, lemonade.getUnlocalizedName());
		GameRegistry.registerItem(cherryLemonade, cherryLemonade.getUnlocalizedName());
		GameRegistry.registerItem(strawberryLemonade, strawberryLemonade.getUnlocalizedName());

		// Smoothy
		GameRegistry.registerItem(bananaSmoothy, bananaSmoothy.getUnlocalizedName());
		GameRegistry.registerItem(cherrySmoothy, cherrySmoothy.getUnlocalizedName());
		GameRegistry.registerItem(strawberrySmoothy, strawberrySmoothy.getUnlocalizedName());

		// Misc
		GameRegistry.registerItem(smoothyGlass, smoothyGlass.getUnlocalizedName());
	}

}
