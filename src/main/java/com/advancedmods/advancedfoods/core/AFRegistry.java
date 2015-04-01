package com.advancedmods.advancedfoods.core;

import com.advancedmods.advancedfoods.common.blocks.crops.BananaPlant;
import com.advancedmods.advancedfoods.common.blocks.crops.CherryPlant;
import com.advancedmods.advancedfoods.common.blocks.crops.ChilliPlant;
import com.advancedmods.advancedfoods.common.blocks.crops.CornPlant;
import com.advancedmods.advancedfoods.common.blocks.crops.KiwiPlant;
import com.advancedmods.advancedfoods.common.blocks.crops.LemonPlant;
import com.advancedmods.advancedfoods.common.blocks.crops.StrawberryPlant;
import com.advancedmods.advancedfoods.common.blocks.crops.TomatoPlant;
import com.advancedmods.advancedfoods.common.items.drinks.ChocolateMilk;
import com.advancedmods.advancedfoods.common.items.food.Banana;
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
import com.advancedmods.advancedfoods.common.items.food.Fries;
import com.advancedmods.advancedfoods.common.items.food.Hamburger;
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
import com.advancedmods.advancedfoods.common.items.food.UncookedFries;
import com.advancedmods.advancedfoods.common.items.ingredients.Butter;
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
import com.advancedmods.advancedfoods.common.items.sauces.Wasabi;
import com.advancedmods.advancedfoods.common.items.seeds.BananaSeed;
import com.advancedmods.advancedfoods.common.items.seeds.CherrySeed;
import com.advancedmods.advancedfoods.common.items.seeds.ChilliSeed;
import com.advancedmods.advancedfoods.common.items.seeds.CornSeed;
import com.advancedmods.advancedfoods.common.items.seeds.KiwiSeed;
import com.advancedmods.advancedfoods.common.items.seeds.LemonSeed;
import com.advancedmods.advancedfoods.common.items.seeds.StrawberrySeed;
import com.advancedmods.advancedfoods.common.items.seeds.TomatoSeed;
import com.advancedmods.advancedfoods.common.items.smoothies.BananaSmoothie;
import com.advancedmods.advancedfoods.common.items.smoothies.CherrySmoothie;
import com.advancedmods.advancedfoods.common.items.smoothies.ChocolateSmoothie;
import com.advancedmods.advancedfoods.common.items.smoothies.KiwiSmoothie;
import com.advancedmods.advancedfoods.common.items.smoothies.LemonSmoothie;
import com.advancedmods.advancedfoods.common.items.smoothies.StrawberrySmoothie;
import com.advancedmods.advancedfoods.common.items.tools.Knife;
import com.advancedmods.advancedfoods.core.handler.ConfigurationHandler;
import com.advancedmods.advancedfoods.core.handler.CraftingHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * Created by Dennisbonke on 31-3-2015.
 */
@ObjectHolder(AFProps.modid)
public class AFRegistry {

    public static ConfigurationHandler config;
    // Item declarations
    // Foods
    public static Item banana = new Banana(4000, 2, false);
    public static Item caramel = new Caramel(4000, 1, false);
    public static Item cheese = new Cheese(4001, 5, false);
    public static Item cherry = new Cherry(4000, 2, false);
    public static Item chickenSandwich = new ChickenSandwich(4000, 6, false);
    public static Item chilli = new Chilli(4000, 2, false);
    public static Item chocolate = new Chocolate(4000, 4, false);
    public static Item chocolateCake = new ChocolateCake(4000, 10, false);
    public static Item chocolateCupcake = new ChocolateCupcake(4000, 6, false);
    public static Item corn = new Corn(4000, 2, false);
    public static Item cupcake = new Cupcake(4000, 6, false);
    public static Item fishSandwich = new FishSandwich(4000, 6, false);
    public static Item fries = new Fries(4000, 6, false);
    public static Item hamburger = new Hamburger(4000, 8, false);
    public static Item hotdog = new Hotdog(4000, 6, false);
    public static Item jellybeans = new Jellybeans(4000, 3, false);
    public static Item kiwi = new Kiwi(4000, 2, false);
    public static Item lemon = new Lemon(4000, 2, false);
    public static Item strawberry = new Strawberry(4000, 2, false);
    public static Item taco = new Taco(4000, 4, false);
    public static Item toast = new Toast(4000, 2, false);
    public static Item toastSandwich = new ToastSandwich(4000, 6, false);
    public static Item tomato = new Tomato(4000, 2, false);
    public static Item tomatoSoup = new TomatoSoup(4000, 6, false);
    public static Item uncoockedFries = new UncookedFries(4000, 1, false);

    // Drinks
    public static Item chocolateMilk = new ChocolateMilk(5000, 6, false);

    // Lemonade
    public static Item lemonade = new Lemonade(5000, 4, false);
    public static Item cherryLemonade = new CherryLemonade(5001, 5, false);
    public static Item kiwiLemonade = new KiwiLemonade(5002, 5, false);
    public static Item strawberryLemonade = new StrawberryLemonade(5002, 5, false);

    // Smoothie
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
    public static Item wasabi = new Wasabi();

    // Ingredients
    public static Item butter = new Butter(4000, 1, false);
    public static Item dough = new Dough();
    public static Item flour = new Flour();
    public static Item salt = new Salt();

    // Tools
    public static Item knife = new Knife();

    // Seeds
    public static Item bananaSeed = new BananaSeed();
    public static Item cherrySeed = new CherrySeed();
    public static Item chilliSeed = new ChilliSeed();
    public static Item cornSeed = new CornSeed();
    public static Item kiwiSeed = new KiwiSeed();
    public static Item lemonSeed = new LemonSeed();
    public static Item strawberrySeed = new StrawberrySeed();
    public static Item tomatoSeed = new TomatoSeed();

    // Block declarations
    public static Block bananaPlant = new BananaPlant();
    public static Block cherryPlant = new CherryPlant();
    public static Block chilliPlant = new ChilliPlant();
    public static Block cornPlant = new CornPlant();
    public static Block kiwiPlant = new KiwiPlant();
    public static Block lemonPlant = new LemonPlant();
    public static Block strawberryPlant = new StrawberryPlant();
    public static Block tomatoPlant = new TomatoPlant();

    public static void registerItemsAndBlocks() {
        if (config.bananaEnabled) {
            GameRegistry.registerItem(banana, "banana");
            if (config.bananaSeedEnabled) {
                GameRegistry.registerItem(bananaSeed, "bananaseed");
                GameRegistry.registerBlock(bananaPlant, "bananaplant");
            }
            if (config.bananaSmoothieEnabled) {
                GameRegistry.registerItem(bananaSmoothie, "bananasmoothie");
            }
        }
        if (config.butterEnabled) {
            GameRegistry.registerItem(butter, "butter");
        }
        if (config.caramelEnabled) {
            GameRegistry.registerItem(caramel, "caramel");
        }
        if (config.cheeseEnabled) {
            GameRegistry.registerItem(cheese, "cheese");
        }
        if (config.cherryEnabled) {
            GameRegistry.registerItem(cherry, "cherry");
            if (config.cherryLemonadeEnabled) {
                GameRegistry.registerItem(cherryLemonade, "cherrylemonade");
            }
            if (config.cherrySeedEnabled) {
                GameRegistry.registerBlock(cherryPlant, "cherryplant");
                GameRegistry.registerItem(cherrySeed, "cherryseed");
            }
            if (config.cherrySmoothieEnabled) {
                GameRegistry.registerItem(cherrySmoothie, "cherrysmoothie");
            }
        }
        if (config.chickenSandwichEnabled) {
            GameRegistry.registerItem(chickenSandwich, "chickensandwich");
        }
        if (config.chilliEnabled) {
            GameRegistry.registerItem(chilli, "chilli");
            if (config.chilliSeedEnabled) {
                GameRegistry.registerItem(chilliSeed, "chilliseed");
                GameRegistry.registerBlock(chilliPlant, "chilliplant");
            }
        }
        if (config.chocolateEnabled) {
            GameRegistry.registerItem(chocolate, "cocolate");
            if (config.chocolateCakeEnabled) {
                GameRegistry.registerItem(chocolateCake, "chocolatecake");
            }
            if (config.chocolateCupCakeEnabled && config.cupcakeEnabled) {
                GameRegistry.registerItem(chocolateCupcake, "chocolatecupcake");
            }
            if (config.chocolateMilkEnabled) {
                GameRegistry.registerItem(chocolateMilk, "chocolatemilk");
            }
            if (config.chocolateSmoothieEnabled) {
                GameRegistry.registerItem(chocolateSmoothie, "chocolatesmoothie");
            }
        }
        if (config.cornEnabled) {
            GameRegistry.registerItem(corn, "corn");
            if (config.cornSeedEnabled) {
                GameRegistry.registerItem(cornSeed, "cornseed");
                GameRegistry.registerBlock(cornPlant, "cornplant");
            }
        }
        if (config.cupcakeEnabled) {
            GameRegistry.registerItem(cupcake, "cupcake");
        }
        if (config.doughEnabled) {
            GameRegistry.registerItem(dough, "dough");
        }
        if (config.fishSandwichEnabled) {
            GameRegistry.registerItem(fishSandwich, "fishsandwich");
        }
        if (config.flourEnabled) {
            GameRegistry.registerItem(flour, "flour");
        }
        if (config.friesEnabled && config.uncookedFriesEnabled) {
            GameRegistry.registerItem(fries, "fries");
        }
        if (config.hamburgerEnabled) {
            GameRegistry.registerItem(hamburger, "hamburger");
        }
        if (config.hotdogEnabled) {
            GameRegistry.registerItem(hotdog, "hotdog");
        }
        if (config.iceCubesEnabled) {
            GameRegistry.registerItem(iceCubes, "icecubes");
        }
        if (config.jarEnabled) {
            GameRegistry.registerItem(jar, "jar");
        }
        if (config.jellybeansEnabled) {
            GameRegistry.registerItem(jellybeans, "jellybeans");
        }
        if (config.ketchupEnabled) {
            GameRegistry.registerItem(ketchup, "ketchup");
        }
        if (config.kiwiEnabled) {
            GameRegistry.registerItem(kiwi, "kiwi");
            if (config.kiwiLemonadeEnabled) {
                GameRegistry.registerItem(kiwiLemonade, "kiwilemonade");
            }
            if (config.kiwiSeedEnabled) {
                GameRegistry.registerItem(kiwiSeed, "kiwiseed");
                GameRegistry.registerBlock(kiwiPlant, "kiwiplant");
            }
            if (config.kiwiSmoothieEnabled) {
                GameRegistry.registerItem(kiwiSmoothie, "kiwismoothie");
            }
        }
        if (config.knifeEnabled) {
            GameRegistry.registerItem(knife, "knife");
        }
        if (config.lemonEnabled) {
            GameRegistry.registerItem(lemon, "lemon");
            if (config.lemonSeedEnabled) {
                GameRegistry.registerItem(lemonSeed, "lemonseed");
                GameRegistry.registerBlock(lemonPlant, "lemonplant");
            }
            if (config.lemonSmoothieEnabled) {
                GameRegistry.registerItem(lemonSmoothie, "lemonsmoothie");
            }
        }
        if (config.lemonadeEnabled) {
            GameRegistry.registerItem(lemonade, "lemonade");
        }
        if (config.mayoEnabled) {
            GameRegistry.registerItem(mayo, "mayo");
        }
        if (config.mustardEnabled) {
            GameRegistry.registerItem(mustard, "mustard");
        }
        if (config.saltEnabled) {
            GameRegistry.registerItem(salt, "salt");
        }
        if (config.smoothieGlassEnabled) {
            GameRegistry.registerItem(smoothieGlass, "smoothieglass");
        }
        if (config.strawberryEnabled) {
            GameRegistry.registerItem(strawberry, "strawberry");
            if (config.strawberryLemonadeEnabled) {
                GameRegistry.registerItem(strawberryLemonade, "strawberrylemonade");
            }
            if (config.strawberrySeedEnabled) {
                GameRegistry.registerItem(strawberrySeed, "strawberryseed");
                GameRegistry.registerBlock(strawberryPlant, "strawberryplant");
            }
            if (config.strawberrySmoothieEnabled) {
                GameRegistry.registerItem(strawberrySmoothie, "strawberrysmoothie");
            }
        }
        if (config.tacoEnabled) {
            GameRegistry.registerItem(taco, "taco");
        }
        if (config.toastEnabled) {
            GameRegistry.registerItem(toast, "toast");
        }
        if (config.toastSandwichEnabled && config.toastEnabled) {
            GameRegistry.registerItem(toastSandwich, "toastsandwich");
        }
        if (config.tomatoEnabled) {
            GameRegistry.registerItem(tomato, "tomato");
            if (config.tomatoSeedEnabled) {
                GameRegistry.registerItem(tomatoSeed, "tomatoseed");
                GameRegistry.registerBlock(tomatoPlant, "tomatoplant");
            }
            if (config.tomatoSoupEnabled) {
                GameRegistry.registerItem(tomatoSoup, "tomatosoup");
            }
        }
        if (config.wasabiEnabled) {
            GameRegistry.registerItem(wasabi, "wasabi");
        }
        if (config.uncookedFriesEnabled) {
            GameRegistry.registerItem(uncoockedFries, "uncookedfries");
        }
    }

    public static void addGrassSeedsHooks() {

        if (config.bananaSeedEnabled && config.bananaSeedDropEnabled) {
            MinecraftForge.addGrassSeed(new ItemStack(bananaSeed), 5);
        }
        if (config.cherrySeedEnabled && config.cherrySeedDropEnabled) {
            MinecraftForge.addGrassSeed(new ItemStack(cherrySeed), 5);
        }
        if (config.cherrySeedEnabled && config.chilliSeedDropEnabled) {
            MinecraftForge.addGrassSeed(new ItemStack(chilliSeed), 5);
        }
        if (config.cornSeedEnabled && config.cornSeedDropEnabled) {
            MinecraftForge.addGrassSeed(new ItemStack(cornSeed), 5);
        }
        if (config.kiwiSeedEnabled && config.kiwiSeedDropEnabled) {
            MinecraftForge.addGrassSeed(new ItemStack(kiwiSeed), 5);
        }
        if (config.lemonSeedEnabled && config.lemonSeedDropEnabled) {
            MinecraftForge.addGrassSeed(new ItemStack(lemonSeed), 5);
        }
        if (config.strawberrySeedEnabled && config.strawberrySeedDropEnabled) {
            MinecraftForge.addGrassSeed(new ItemStack(strawberrySeed), 5);
        }
        if (config.tomatoSeedEnabled && config.tomatoSeedDropEnabled) {
            MinecraftForge.addGrassSeed(new ItemStack(tomatoSeed), 5);
        }

	}

    public static void initHandlers() {
        FMLCommonHandler.instance().bus().register(new CraftingHandler());
    }

    public static void registerRecipes() {
        // Shapeless Ore Crafting
        // Drinks
        // Lemonade
        if (config.lemonadeEnabled && config.smoothieGlassEnabled && config.lemonEnabled) {
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(lemonade), new ItemStack(smoothieGlass), new ItemStack(lemon)));
        }
        if (config.cherryLemonadeEnabled && config.cherryEnabled && config.lemonadeEnabled && config.smoothieGlassEnabled ) {
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(cherryLemonade), new ItemStack(lemonade), new ItemStack(cherry)));
        }
        if (config.strawberryLemonadeEnabled && config.strawberryEnabled && config.lemonadeEnabled && config.smoothieGlassEnabled )
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(strawberryLemonade), new ItemStack(lemonade), new ItemStack(strawberry)));

        // Other
        if (config.chocolateMilkEnabled) {
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(chocolateMilk), new ItemStack(Items.milk_bucket), new ItemStack(Blocks.cocoa)));
        }

        // Smoothie
        if (config.bananaSmoothieEnabled && config.smoothieGlassEnabled && config.iceCubesEnabled && config.bananaEnabled) {
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(bananaSmoothie), new ItemStack(smoothieGlass), new ItemStack(iceCubes), new ItemStack(banana)));
        }
        if (config.bananaSmoothieEnabled && config.smoothieGlassEnabled && config.iceCubesEnabled && config.bananaEnabled) {
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(cherrySmoothie), new ItemStack(smoothieGlass), new ItemStack(iceCubes), new ItemStack(cherry)));
        }
        if (config.bananaSmoothieEnabled && config.smoothieGlassEnabled && config.iceCubesEnabled && config.bananaEnabled) {
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(chocolateSmoothie), new ItemStack(smoothieGlass), new ItemStack(iceCubes), new ItemStack(chocolate)));
        }
        if (config.bananaSmoothieEnabled && config.smoothieGlassEnabled && config.iceCubesEnabled && config.bananaEnabled) {
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(lemonSmoothie), new ItemStack(smoothieGlass), new ItemStack(iceCubes), new ItemStack(lemon)));
        }
        if (config.bananaSmoothieEnabled && config.smoothieGlassEnabled && config.iceCubesEnabled && config.bananaEnabled) {
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(strawberrySmoothie), new ItemStack(smoothieGlass), new ItemStack(iceCubes), new ItemStack(strawberry)));
        }

        // Misc
        if (config.iceCubesEnabled) {
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(iceCubes, 9), new ItemStack(Blocks.ice)));
        }
        if (config.iceCubesEnabled) {
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(iceCubes), new ItemStack(Items.snowball)));
        }

        // Ingredients
        if (config.flourEnabled) {
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(flour), new ItemStack(Items.wheat)));
        }
        if (config.uncookedFriesEnabled && config.knifeEnabled) {
            GameRegistry.addRecipe(new ItemStack(uncoockedFries), new Object[]{"pk", 'p', Items.potato, 'k', new ItemStack(knife, 1, OreDictionary.WILDCARD_VALUE)});
        }

        // Shaped Ore Crafting
        // Foods
        if (config.chocolateCakeEnabled && config.chocolateEnabled) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(chocolateCake), "ccc", "ses", "www", 'c', chocolate, 's', Items.sugar, 'e', Items.egg, 'w', Items.wheat));
        }
        if (config.cupcakeEnabled) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(cupcake, 5), "pcp", " p ", 'p', Items.paper, 'c', Items.cake));
        }
        if (config.cupcakeEnabled && config.chocolateEnabled) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(chocolateCupcake, 5), "CcC", "ppp", 'p', Items.paper, 'c', cupcake, 'C', chocolate));
        }
        if (config.hamburgerEnabled) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(hamburger), " b ", " B ", " b ", 'b', Items.bread, 'B', Items.beef));
        }

        // Misc
        if (config.iceCubesEnabled) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.ice), "iii", "iii", "iii", 'i', new ItemStack(iceCubes)));
        }
        if (config.jarEnabled) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(jar), " g ", "g g", "ggg", 'g', Blocks.glass_pane));
        }
        if (config.smoothieGlassEnabled) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(smoothieGlass), "g g", " g ", 'g', Blocks.glass_pane));
        }

        // Tools
        if (config.knifeEnabled) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(knife), "i  ", " s ", 'i', Items.iron_ingot, 's', Items.stick));
        }

        // Smelting
        // Foods
        if (config.caramelEnabled) {
            GameRegistry.addSmelting(new ItemStack(Items.sugar), new ItemStack(caramel, 3), 5);
        }
        if (config.toastEnabled) {
            GameRegistry.addSmelting(new ItemStack(Items.bread), new ItemStack(toast), 5);
        }

        // Ingredients
        if (config.doughEnabled) {
            GameRegistry.addSmelting(new ItemStack(dough), new ItemStack(Items.bread), 5);
        }
    }

}
