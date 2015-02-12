package com.advancedmods.advancedfoods.common.init;

import com.advancedmods.advancedfoods.common.items.drinks.ChocolateMilk;
import com.advancedmods.advancedfoods.common.items.food.Banana;
import com.advancedmods.advancedfoods.common.items.food.Fries;
import com.advancedmods.advancedfoods.common.items.food.Hamburger;
import com.advancedmods.advancedfoods.common.items.ingredients.Butter;
import com.advancedmods.advancedfoods.common.items.food.Caramel;
import com.advancedmods.advancedfoods.common.items.food.Cheese;
import com.advancedmods.advancedfoods.common.items.food.Cherry;
import com.advancedmods.advancedfoods.common.items.food.ChickenSandwich;
import com.advancedmods.advancedfoods.common.items.food.Chilli;
import com.advancedmods.advancedfoods.common.items.food.Chocolate;
import com.advancedmods.advancedfoods.common.items.food.ChocolateCake;
import com.advancedmods.advancedfoods.common.items.food.ChocolateCupcake;
import com.advancedmods.advancedfoods.common.items.food.Corn;
import com.advancedmods.advancedfoods.common.items.food.Cupcake;
import com.advancedmods.advancedfoods.common.items.food.FishSandwich;
import com.advancedmods.advancedfoods.common.items.food.Hotdog;
import com.advancedmods.advancedfoods.common.items.food.Jellybeans;
import com.advancedmods.advancedfoods.common.items.food.Kiwi;
import com.advancedmods.advancedfoods.common.items.food.Lemon;
import com.advancedmods.advancedfoods.common.items.food.Strawberry;
import com.advancedmods.advancedfoods.common.items.food.Taco;
import com.advancedmods.advancedfoods.common.items.food.Toast;
import com.advancedmods.advancedfoods.common.items.food.ToastSandwich;
import com.advancedmods.advancedfoods.common.items.food.Tomato;
import com.advancedmods.advancedfoods.common.items.food.TomatoSoup;
import com.advancedmods.advancedfoods.common.items.ingredients.Dough;
import com.advancedmods.advancedfoods.common.items.ingredients.Flour;
import com.advancedmods.advancedfoods.common.items.ingredients.Salt;
import com.advancedmods.advancedfoods.common.items.lemonade.CherryLemonade;
import com.advancedmods.advancedfoods.common.items.lemonade.KiwiLemonade;
import com.advancedmods.advancedfoods.common.items.lemonade.Lemonade;
import com.advancedmods.advancedfoods.common.items.lemonade.StrawberryLemonade;
import com.advancedmods.advancedfoods.common.items.misc.IceCubes;
import com.advancedmods.advancedfoods.common.items.misc.Jar;
import com.advancedmods.advancedfoods.common.items.misc.SmoothieGlass;
import com.advancedmods.advancedfoods.common.items.sauces.Ketchup;
import com.advancedmods.advancedfoods.common.items.sauces.Mayo;
import com.advancedmods.advancedfoods.common.items.sauces.Mustard;
import com.advancedmods.advancedfoods.common.items.smoothies.BananaSmoothie;
import com.advancedmods.advancedfoods.common.items.smoothies.CherrySmoothie;
import com.advancedmods.advancedfoods.common.items.smoothies.ChocolateSmoothie;
import com.advancedmods.advancedfoods.common.items.smoothies.KiwiSmoothie;
import com.advancedmods.advancedfoods.common.items.smoothies.LemonSmoothie;
import com.advancedmods.advancedfoods.common.items.smoothies.StrawberrySmoothie;
import com.advancedmods.advancedfoods.core.AFProps;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

/**
 * Created by Dennisbonke on 11-2-2015.
 */
@GameRegistry.ObjectHolder(AFProps.modid)
public class ModItems {

    // Foods
    public static Item banana = new Banana();
    public static Item caramel = new Caramel(4000, 1, false);
    public static Item cheese = new Cheese(4001, 5, false);
    public static Item cherry = new Cherry();
    public static Item chickenSandwich = new ChickenSandwich(4000, 6, false);
    public static Item chilli = new Chilli();
    public static Item chocolate = new Chocolate(4000, 4, false);
    public static Item chocolateCake = new ChocolateCake(4000, 10, false);
    public static Item chocolateCupcake = new ChocolateCupcake(4000, 6, false);
    public static Item corn = new Corn();
    public static Item cupcake = new Cupcake(4000, 6, false);
    public static Item fishSandwich = new FishSandwich(4000, 6, false);
    public static Item fries = new Fries(4000, 6, false);
    public static Item hamburger = new Hamburger(4000, 8, false);
    public static Item hotdog = new Hotdog(4000, 6, false);
    public static Item jellybeans = new Jellybeans(4000, 3, false);
    public static Item kiwi = new Kiwi();
    public static Item lemon = new Lemon();
    public static Item strawberry = new Strawberry();
    public static Item taco = new Taco(4000, 4, false);
    public static Item toast = new Toast(4000, 2, false);
    public static Item toastSandwich = new ToastSandwich(4000, 6, false);
    public static Item tomato = new Tomato();
    public static Item tomatoSoup = new TomatoSoup(4000, 6, false);

    // Drinks
    public static Item chocolateMilk = new ChocolateMilk(5000, 6, false);

    // Lemonade
    public static Item lemonade = new Lemonade(5000, 4, false);
    public static Item cherryLemonade = new CherryLemonade(5001, 5, false);
    public static Item kiwiLemonade = new KiwiLemonade(5002, 5, false);
    public static Item strawberryLemonade = new StrawberryLemonade(5002, 5, false);

    // Smoothy
    public static Item bananaSmoothie = new BananaSmoothie(5000, 6, false);
    public static Item cherrySmoothie = new CherrySmoothie(5000, 6, false);
    public static Item chocolateSmoothie = new ChocolateSmoothie(5000, 6, false);
    public static Item kiwiSmoothie = new KiwiSmoothie(5000, 6, false);
    public static Item lemonSmoothie = new LemonSmoothie(5000, 6, false);
    public static Item strawberrySmoothie = new StrawberrySmoothie(5000, 6, false);

    // Misc
    public static Item iceCubes = new IceCubes();
    public static Item jar = new Jar();
    public static Item smoothieGlass = new SmoothieGlass();

    // Sauce
    public static Item ketchup = new Ketchup();
    public static Item mayo = new Mayo();
    public static Item mustard = new Mustard();

    // Ingredients
    public static Item butter = new Butter(4000, 1, false);
    public static Item dough = new Dough();
    public static Item flour = new Flour();
    public static Item salt = new Salt();

    public static void init() {
        // Foods
        GameRegistry.registerItem(banana, "banana");
        GameRegistry.registerItem(caramel, "caramel");
        GameRegistry.registerItem(cheese, "cheese");
        GameRegistry.registerItem(cherry, "cherry");
        GameRegistry.registerItem(chickenSandwich, "chickensandwich");
        GameRegistry.registerItem(chilli, "chilli");
        GameRegistry.registerItem(chocolate, "cocolate");
        GameRegistry.registerItem(chocolateCake, "chocolatecake");
        GameRegistry.registerItem(chocolateCupcake, "chocolatecupcake");
        GameRegistry.registerItem(corn, "corn");
        GameRegistry.registerItem(cupcake, "cupcake");
        GameRegistry.registerItem(fishSandwich, "fishsandwich");
        GameRegistry.registerItem(fries, "fries");
        GameRegistry.registerItem(hamburger, "hamburger");
        GameRegistry.registerItem(hotdog, "hotdog");
        GameRegistry.registerItem(jellybeans, "jellybeans");
        GameRegistry.registerItem(kiwi, "kiwi");
        GameRegistry.registerItem(lemon, "lemon");
        GameRegistry.registerItem(strawberry, "strawberry");
        GameRegistry.registerItem(taco, "taco");
        GameRegistry.registerItem(toast, "toast");
        GameRegistry.registerItem(toastSandwich, "toastsandwich");
        GameRegistry.registerItem(tomato, "tomato");
        GameRegistry.registerItem(tomatoSoup, "tomatosoup");

        // Drinks
        GameRegistry.registerItem(chocolateMilk, "chocolatemilk");

        // Lemonade
        GameRegistry.registerItem(lemonade, "lemonade");
        GameRegistry.registerItem(cherryLemonade, "cherrylemonade");
        GameRegistry.registerItem(kiwiLemonade, "kiwilemonade");
        GameRegistry.registerItem(strawberryLemonade, "strawberrylemonade");

        // Smoothy
        GameRegistry.registerItem(bananaSmoothie, "bananasmoothie");
        GameRegistry.registerItem(cherrySmoothie, "cherrysmoothie");
        GameRegistry.registerItem(chocolateSmoothie, "chocolatesmoothie");
        GameRegistry.registerItem(kiwiSmoothie, "kiwismoothie");
        GameRegistry.registerItem(lemonSmoothie, "lemonsmoothie");
        GameRegistry.registerItem(strawberrySmoothie, "strawberrysmoothie");

        // Misc
        GameRegistry.registerItem(iceCubes, "icecubes");
        GameRegistry.registerItem(jar, "jar");
        GameRegistry.registerItem(smoothieGlass, "smoothieglass");

        // Sauce
        GameRegistry.registerItem(ketchup, "ketchup");
        GameRegistry.registerItem(mayo, "mayo");
        GameRegistry.registerItem(mustard, "mustard");

        // Ingredients
        GameRegistry.registerItem(butter, "butter");
        GameRegistry.registerItem(dough, "dough");
        GameRegistry.registerItem(flour, "flour");
        GameRegistry.registerItem(salt, "salt");
    }

}
