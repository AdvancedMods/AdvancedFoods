package com.zandor300.advancedfoods.initialization;

import com.zandor300.advancedfoods.items.drinks.lemonade.CherryLemonade;
import com.zandor300.advancedfoods.items.drinks.lemonade.KiwiLemonade;
import com.zandor300.advancedfoods.items.drinks.lemonade.Lemonade;
import com.zandor300.advancedfoods.items.drinks.lemonade.StrawberryLemonade;
import com.zandor300.advancedfoods.items.drinks.smoothies.BananaSmoothy;
import com.zandor300.advancedfoods.items.drinks.smoothies.CherrySmoothy;
import com.zandor300.advancedfoods.items.drinks.smoothies.ChocolateSmoothy;
import com.zandor300.advancedfoods.items.drinks.smoothies.KiwiSmoothy;
import com.zandor300.advancedfoods.items.drinks.smoothies.LemonSmoothy;
import com.zandor300.advancedfoods.items.drinks.smoothies.StrawberrySmoothy;
import com.zandor300.advancedfoods.items.food.Banana;
import com.zandor300.advancedfoods.items.food.Butter;
import com.zandor300.advancedfoods.items.food.Caramel;
import com.zandor300.advancedfoods.items.food.Cheese;
import com.zandor300.advancedfoods.items.food.Cherry;
import com.zandor300.advancedfoods.items.food.ChickenSandwich;
import com.zandor300.advancedfoods.items.food.Chilli;
import com.zandor300.advancedfoods.items.food.Chocolate;
import com.zandor300.advancedfoods.items.food.ChocolateCake;
import com.zandor300.advancedfoods.items.food.ChocolateCupcake;
import com.zandor300.advancedfoods.items.food.Cupcake;
import com.zandor300.advancedfoods.items.food.FishSandwich;
import com.zandor300.advancedfoods.items.food.Hotdog;
import com.zandor300.advancedfoods.items.food.Jellybeans;
import com.zandor300.advancedfoods.items.food.Kiwi;
import com.zandor300.advancedfoods.items.food.Lemon;
import com.zandor300.advancedfoods.items.food.Strawberry;
import com.zandor300.advancedfoods.items.food.Taco;
import com.zandor300.advancedfoods.items.food.Toast;
import com.zandor300.advancedfoods.items.food.ToastSandwich;
import com.zandor300.advancedfoods.items.food.Tomato;
import com.zandor300.advancedfoods.items.food.TomatoSoup;
import com.zandor300.advancedfoods.items.ingredients.Dough;
import com.zandor300.advancedfoods.items.ingredients.Flour;
import com.zandor300.advancedfoods.items.misc.IceCubes;
import com.zandor300.advancedfoods.items.misc.Jar;
import com.zandor300.advancedfoods.items.misc.SmoothyGlass;
import com.zandor300.advancedfoods.items.sauce.Ketchup;
import com.zandor300.advancedfoods.items.sauce.Mustard;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

/**
 * Created by Smith on 2-12-2014.
 */
public class ModItems {

	// Foods
	public static Item banana = new Banana();
	public static Item butter = new Butter(4000, 1, false);
	public static Item caramel = new Caramel(4000, 1, false);
	public static Item cheese = new Cheese(4001, 5, false);
	public static Item cherry = new Cherry(4002, 4, false);
	public static Item chickenSandwich = new ChickenSandwich(4000, 6, false);
	public static Item chilli = new Chilli();
	public static Item chocolate = new Chocolate(4000, 4, false);
	public static Item chocolateCake = new ChocolateCake(4000, 10, false);
	public static Item chocolateCupcake = new ChocolateCupcake(4000, 6, false);
	public static Item cupcake = new Cupcake(4000, 6, false);
	public static Item fishSandwich = new FishSandwich(4000, 6, false);
	public static Item hotdog = new Hotdog(4000, 6, false);
	public static Item jellybeans = new Jellybeans(4000, 3, false);
	public static Item kiwi = new Kiwi(4000, 4, false);
	public static Item lemon = new Lemon();
	public static Item strawberry = new Strawberry();
	public static Item taco = new Taco(4000, 4, false);
	public static Item toast = new Toast(4000, 2, false);
	public static Item toastSandwich = new ToastSandwich(4000, 6, false);
	public static Item tomato = new Tomato();
	public static Item tomatoSoup = new TomatoSoup(4000, 6, false);

	// Drinks
	// Lemonade
	public static Item lemonade = new Lemonade(5000, 4, false);
	public static Item cherryLemonade = new CherryLemonade(5001, 5, false);
	public static Item kiwiLemonade = new KiwiLemonade(5002, 5, false);
	public static Item strawberryLemonade = new StrawberryLemonade(5002, 5, false);

	// Smoothy
	public static Item bananaSmoothy = new BananaSmoothy(5000, 6, false);
	public static Item cherrySmoothy = new CherrySmoothy(5000, 6, false);
	public static Item chocolateSmoothy = new ChocolateSmoothy(5000, 6, false);
	public static Item kiwiSmoothy = new KiwiSmoothy(5000, 6, false);
	public static Item lemonSmoothy = new LemonSmoothy(5000, 6, false);
	public static Item strawberrySmoothy = new StrawberrySmoothy(5000, 6, false);

	// Misc
	public static Item iceCubes = new IceCubes();
	public static Item jar = new Jar();
	public static Item smoothyGlass = new SmoothyGlass();

	// Sauce
	public static Item ketchup = new Ketchup();
	public static Item mustard = new Mustard();

	// Ingredients
	public static Item dough = new Dough();
	public static Item flour = new Flour();

	public static void init() {
		// Foods
		GameRegistry.registerItem(banana, banana.getUnlocalizedName());
		GameRegistry.registerItem(butter, butter.getUnlocalizedName());
		GameRegistry.registerItem(caramel, caramel.getUnlocalizedName());
		GameRegistry.registerItem(cheese, cheese.getUnlocalizedName());
		GameRegistry.registerItem(cherry, cherry.getUnlocalizedName());
		GameRegistry.registerItem(chickenSandwich, chickenSandwich.getUnlocalizedName());
		GameRegistry.registerItem(chilli, chilli.getUnlocalizedName());
		GameRegistry.registerItem(chocolate, chocolate.getUnlocalizedName());
		GameRegistry.registerItem(chocolateCake, chocolateCake.getUnlocalizedName());
		GameRegistry.registerItem(chocolateCupcake, chocolateCupcake.getUnlocalizedName());
		GameRegistry.registerItem(cupcake, cupcake.getUnlocalizedName());
		GameRegistry.registerItem(fishSandwich, fishSandwich.getUnlocalizedName());
		GameRegistry.registerItem(hotdog, hotdog.getUnlocalizedName());
		GameRegistry.registerItem(jellybeans, jellybeans.getUnlocalizedName());
		GameRegistry.registerItem(kiwi, kiwi.getUnlocalizedName());
		GameRegistry.registerItem(lemon, lemon.getUnlocalizedName());
		GameRegistry.registerItem(strawberry, strawberry.getUnlocalizedName());
		GameRegistry.registerItem(taco, taco.getUnlocalizedName());
		GameRegistry.registerItem(toast, toast.getUnlocalizedName());
		GameRegistry.registerItem(toastSandwich, toastSandwich.getUnlocalizedName());
		GameRegistry.registerItem(tomato, tomato.getUnlocalizedName());
		GameRegistry.registerItem(tomatoSoup, tomatoSoup.getUnlocalizedName());

		// Drinks
		// Lemonade
		GameRegistry.registerItem(lemonade, lemonade.getUnlocalizedName());
		GameRegistry.registerItem(cherryLemonade, cherryLemonade.getUnlocalizedName());
		GameRegistry.registerItem(kiwiLemonade, kiwiLemonade.getUnlocalizedName());
		GameRegistry.registerItem(strawberryLemonade, strawberryLemonade.getUnlocalizedName());

		// Smoothy
		GameRegistry.registerItem(bananaSmoothy, bananaSmoothy.getUnlocalizedName());
		GameRegistry.registerItem(cherrySmoothy, cherrySmoothy.getUnlocalizedName());
		GameRegistry.registerItem(chocolateSmoothy, chocolateSmoothy.getUnlocalizedName());
		GameRegistry.registerItem(kiwiSmoothy, kiwiSmoothy.getUnlocalizedName());
		GameRegistry.registerItem(lemonSmoothy, lemonSmoothy.getUnlocalizedName());
		GameRegistry.registerItem(strawberrySmoothy, strawberrySmoothy.getUnlocalizedName());

		// Misc
		GameRegistry.registerItem(iceCubes, iceCubes.getUnlocalizedName());
		GameRegistry.registerItem(jar, jar.getUnlocalizedName());
		GameRegistry.registerItem(smoothyGlass, smoothyGlass.getUnlocalizedName());

		// Sauce
		GameRegistry.registerItem(ketchup, ketchup.getUnlocalizedName());
		GameRegistry.registerItem(mustard, mustard.getUnlocalizedName());

		// Ingredients
		GameRegistry.registerItem(dough, dough.getUnlocalizedName());
		GameRegistry.registerItem(flour, flour.getUnlocalizedName());
	}

}
