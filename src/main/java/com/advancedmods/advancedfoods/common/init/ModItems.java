package com.advancedmods.advancedfoods.common.init;

import com.advancedmods.advancedfoods.common.items.food.Banana;
import com.advancedmods.advancedfoods.common.items.food.Butter;
import com.advancedmods.advancedfoods.common.items.food.Caramel;
import com.advancedmods.advancedfoods.common.items.food.Cheese;
import com.advancedmods.advancedfoods.common.items.food.Cherry;
import com.advancedmods.advancedfoods.common.items.food.ChickenSandwich;
import com.advancedmods.advancedfoods.common.items.food.Jellybeans;
import com.advancedmods.advancedfoods.common.items.food.Kiwi;
import com.advancedmods.advancedfoods.common.items.food.Strawberry;
import com.advancedmods.advancedfoods.common.items.food.Taco;
import com.advancedmods.advancedfoods.common.items.food.Toast;
import com.advancedmods.advancedfoods.common.items.food.Tomato;
import com.advancedmods.advancedfoods.common.items.ingredients.Dough;
import com.advancedmods.advancedfoods.common.items.misc.IceCubes;
import com.advancedmods.advancedfoods.common.items.misc.SmoothieGlass;
import com.advancedmods.advancedfoods.common.items.sauces.Ketchup;
import com.advancedmods.advancedfoods.common.items.smoothies.BananaSmoothie;
import com.advancedmods.advancedfoods.common.items.smoothies.CherrySmoothie;
import com.advancedmods.advancedfoods.common.items.smoothies.ChocolateSmoothie;
import com.advancedmods.advancedfoods.common.items.smoothies.KiwiSmoothie;
import com.advancedmods.advancedfoods.common.items.smoothies.LemonSmoothie;
import com.advancedmods.advancedfoods.common.items.smoothies.StrawberrySmoothie;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

/**
 * Created by Dennisbonke on 11-2-2015.
 */
public class ModItems {

    // Foods
    public static Item banana = new Banana();
    public static Item butter = new Butter(4000, 1, false);
    public static Item caramel = new Caramel(4000, 1, false);
    public static Item cheese = new Cheese(4001, 5, false);
    public static Item cherry = new Cherry(4002, 4, false);
    public static Item chickenSandwich = new ChickenSandwich(4000, 6, false);
    //public static Item chilli = new Chilli();
    //public static Item chocolate = new Chocolate(4000, 4, false);
    //public static Item chocolateCake = new ChocolateCake(4000, 10, false);
    //public static Item chocolateCupcake = new ChocolateCupcake(4000, 6, false);
    //public static Item cupcake = new Cupcake(4000, 6, false);
    //public static Item fishSandwich = new FishSandwich(4000, 6, false);
    //public static Item hotdog = new Hotdog(4000, 6, false);
    public static Item jellybeans = new Jellybeans(4000, 3, false);
    public static Item kiwi = new Kiwi(4000, 4, false);
    //public static Item lemon = new Lemon();
    public static Item strawberry = new Strawberry();
    public static Item taco = new Taco(4000, 4, false);
    public static Item toast = new Toast(4000, 2, false);
    //public static Item toastSandwich = new ToastSandwich(4000, 6, false);
    public static Item tomato = new Tomato(4000, 3, false);
    //public static Item tomatoSoup = new TomatoSoup(4000, 6, false);

    // Drinks
    // Lemonade
    //public static Item lemonade = new Lemonade(5000, 4, false);
    //public static Item cherryLemonade = new CherryLemonade(5001, 5, false);
    //public static Item kiwiLemonade = new KiwiLemonade(5002, 5, false);
    //public static Item strawberryLemonade = new StrawberryLemonade(5002, 5, false);

    // Smoothy
    public static Item bananaSmoothie = new BananaSmoothie(5000, 6, false);
    public static Item cherrySmoothie = new CherrySmoothie(5000, 6, false);
    public static Item chocolateSmoothie = new ChocolateSmoothie(5000, 6, false);
    public static Item kiwiSmoothie = new KiwiSmoothie(5000, 6, false);
    public static Item lemonSmoothie = new LemonSmoothie(5000, 6, false);
    public static Item strawberrySmoothie = new StrawberrySmoothie(5000, 6, false);

    // Misc
    public static Item iceCubes = new IceCubes();
    //public static Item jar = new Jar();
    public static Item smoothieGlass = new SmoothieGlass();

    // Sauce
    public static Item ketchup = new Ketchup();
    //public static Item mayo = new Mayo();
    //public static Item mustard = new Mustard();

    // Ingredients
    public static Item dough = new Dough();
    //public static Item flour = new Flour();
    //public static Item salt = new Salt();

    public static void init() {
        // Foods
        GameRegistry.registerItem(banana, banana.getUnlocalizedName());
        GameRegistry.registerItem(butter, butter.getUnlocalizedName());
        GameRegistry.registerItem(caramel, caramel.getUnlocalizedName());
        GameRegistry.registerItem(cheese, cheese.getUnlocalizedName());
        GameRegistry.registerItem(cherry, cherry.getUnlocalizedName());
        GameRegistry.registerItem(chickenSandwich, chickenSandwich.getUnlocalizedName());
        //GameRegistry.registerItem(chilli, chilli.getUnlocalizedName());
        //GameRegistry.registerItem(chocolate, chocolate.getUnlocalizedName());
        //GameRegistry.registerItem(chocolateCake, chocolateCake.getUnlocalizedName());
        //GameRegistry.registerItem(chocolateCupcake, chocolateCupcake.getUnlocalizedName());
        //GameRegistry.registerItem(cupcake, cupcake.getUnlocalizedName());
        //GameRegistry.registerItem(fishSandwich, fishSandwich.getUnlocalizedName());
        //GameRegistry.registerItem(hotdog, hotdog.getUnlocalizedName());
        GameRegistry.registerItem(jellybeans, jellybeans.getUnlocalizedName());
        GameRegistry.registerItem(kiwi, kiwi.getUnlocalizedName());
        //GameRegistry.registerItem(lemon, lemon.getUnlocalizedName());
        GameRegistry.registerItem(strawberry, strawberry.getUnlocalizedName());
        GameRegistry.registerItem(taco, taco.getUnlocalizedName());
        GameRegistry.registerItem(toast, toast.getUnlocalizedName());
        //GameRegistry.registerItem(toastSandwich, toastSandwich.getUnlocalizedName());
        GameRegistry.registerItem(tomato, tomato.getUnlocalizedName());
        //GameRegistry.registerItem(tomatoSoup, tomatoSoup.getUnlocalizedName());

        // Drinks
        // Lemonade
        //GameRegistry.registerItem(lemonade, lemonade.getUnlocalizedName());
        //GameRegistry.registerItem(cherryLemonade, cherryLemonade.getUnlocalizedName());
        //GameRegistry.registerItem(kiwiLemonade, kiwiLemonade.getUnlocalizedName());
        //GameRegistry.registerItem(strawberryLemonade, strawberryLemonade.getUnlocalizedName());

        // Smoothy
        GameRegistry.registerItem(bananaSmoothie, bananaSmoothie.getUnlocalizedName());
        GameRegistry.registerItem(cherrySmoothie, cherrySmoothie.getUnlocalizedName());
        GameRegistry.registerItem(chocolateSmoothie, chocolateSmoothie.getUnlocalizedName());
        GameRegistry.registerItem(kiwiSmoothie, kiwiSmoothie.getUnlocalizedName());
        GameRegistry.registerItem(lemonSmoothie, lemonSmoothie.getUnlocalizedName());
        GameRegistry.registerItem(strawberrySmoothie, strawberrySmoothie.getUnlocalizedName());

        // Misc
        GameRegistry.registerItem(iceCubes, iceCubes.getUnlocalizedName());
        //GameRegistry.registerItem(jar, jar.getUnlocalizedName());
        GameRegistry.registerItem(smoothieGlass, smoothieGlass.getUnlocalizedName());

        // Sauce
        GameRegistry.registerItem(ketchup, ketchup.getUnlocalizedName());
        //GameRegistry.registerItem(mayo, mayo.getUnlocalizedName());
        //GameRegistry.registerItem(mustard, mustard.getUnlocalizedName());

        // Ingredients
        GameRegistry.registerItem(dough, dough.getUnlocalizedName());
        //GameRegistry.registerItem(flour, flour.getUnlocalizedName());
        //GameRegistry.registerItem(salt, salt.getUnlocalizedName());
    }

}
