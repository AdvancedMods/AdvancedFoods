package com.advancedmods.advancedfoods;

import com.advancedmods.advancedfoods.common.CommonProxy;
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
import com.advancedmods.advancedfoods.core.AFProps;
import com.dennisbonke.dbcore.core.mod.BaseMod;
import com.dennisbonke.dbcore.core.mod.updater.UpdateManager;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;

/**
 * Created by Dennisbonke on 10-2-2015.
 */
@Mod(name = AFProps.name, modid = AFProps.modid, version = AFProps.version, dependencies = AFProps.dependencies, modLanguage = "java", canBeDeactivated = false, acceptedMinecraftVersions = AFProps.ACCEPTED_MC_VERSIONS)
public class AdvancedFoods extends BaseMod {

	@SidedProxy(clientSide = AFProps.clientproxy, serverSide = AFProps.commonproxy)
	public static CommonProxy proxy;
	@Instance(AFProps.modid)
	public static AdvancedFoods instance;
	public static Logger log = LogManager.getLogger("AdvancedFoods");
	public static final String releaseURL = "https://raw.github.com/AdvancedMods/AdvancedFoods/master/VERSION";

    // Config declarations
    public static boolean bananaEnabled;
    public static boolean bananaSeedEnabled;
    public static boolean bananaSeedDropEnabled;
    public static boolean bananaSmoothieEnabled;
    public static boolean butterEnabled;
    public static boolean caramelEnabled;
    public static boolean cheeseEnabled;
    public static boolean cherryEnabled;
    public static boolean cherryLemonadeEnabled;
    public static boolean cherrySeedEnabled;
    public static boolean cherrySeedDropEnabled;
    public static boolean cherrySmoothieEnabled;
    public static boolean chickenSandwichEnabled;
    public static boolean chilliEnabled;
    public static boolean chilliSeedEnabled;
    public static boolean chilliSeedDropEnabled;
    public static boolean chocolateEnabled;
    public static boolean chocolateCakeEnabled;
    public static boolean chocolateCupCakeEnabled;
    public static boolean chocolateMilkEnabled;
    public static boolean chocolateSmoothieEnabled;
    public static boolean cornEnabled;
    public static boolean cornSeedEnabled;
    public static boolean cornSeedDropEnabled;
    public static boolean cupcakeEnabled;
    public static boolean doughEnabled;
    public static boolean fishSandwichEnabled;
    public static boolean flourEnabled;
    public static boolean friesEnabled;
    public static boolean hamburgerEnabled;
    public static boolean hotdogEnabled;
    public static boolean iceCubesEnabled;
    public static boolean jarEnabled;
    public static boolean jellybeansEnabled;
    public static boolean ketchupEnabled;
    public static boolean kiwiEnabled;
    public static boolean kiwiLemonadeEnabled;
    public static boolean kiwiSeedEnabled;
    public static boolean kiwiSeedDropEnabled;
    public static boolean kiwiSmoothieEnabled;
    public static boolean knifeEnabled;
    public static boolean lemonEnabled;
    public static boolean lemonSeedEnabled;
    public static boolean lemonSeedDropEnabled;
    public static boolean lemonadeEnabled;
    public static boolean mayoEnabled;
    public static boolean mustardEnabled;
    public static boolean saltEnabled;
    public static boolean smoothieGlassEnabled;
    public static boolean strawberryEnabled;
    public static boolean strawberryLemonadeEnabled;
    public static boolean strawberrySeedEnabled;
    public static boolean strawberrySeedDropEnabled;
    public static boolean strawberrySmoothieEnabled;
    public static boolean tacoEnabled;
    public static boolean toastEnabled;
    public static boolean toastSandwichEnabled;
    public static boolean tomatoEnabled;
    public static boolean tomatoSeedEnabled;
    public static boolean tomatoSeedDropEnabled;
    public static boolean tomatoSoupEnabled;
    public static boolean uncookedFriesEnabled;

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


	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		// Starting mod
		log.info("Starting Advanced Foods version " + AFProps.version + "...");
		log.info("Entering Pre-Init phase...");
		// Update manager
		log.info("Starting Update manager for Advanced Foods...");
		UpdateManager.registerUpdater(new UpdateManager(this, "https://raw.github.com/AdvancedMods/AdvancedFoods/master/VERSION", null));
		log.info("Update Manager for Advanced Foods started");
		// Do Pre-Init stuff
		proxy.preInit();
        log.info("Setting up configs...");
        setupConfigs(event.getSuggestedConfigurationFile());
        log.info("Configs setup");
		log.info("Pre-Init complete");

	}

	@EventHandler
	public void Init(FMLInitializationEvent event) {

		log.info("Entering Init phase...");
		// Init handlers
		log.info("Registering Handlers...");
		proxy.initHandlers();
		log.info("Handlers registered");
		log.info("Adding Grass Seed Hooks...");
		proxy.addGrassSeedsHooks();
		log.info("Grass Seed Hooks added");
		// Do Init stuff
		proxy.Init();
		log.info("Init complete");

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

		log.info("Entering Post-Init phase...");
		// Do Post-Init stuff
		proxy.postInit();
		log.info("Post-Init complete");
		log.info("Mod loaded");

	}

	@Override
	public String getModId() {
		return AFProps.modid;
	}

	@Override
	public String getModName() {
		return AFProps.name;
	}

	@Override
	public String getModVersion() {
		return AFProps.version;
	}

    public void setupConfigs(File file) {

        Configuration config = new Configuration(file);
        config.load();
        bananaEnabled = getItem(config, "bananaEnabled");
        bananaSeedDropEnabled = config.get("options", "bananaSeedDropEnabled", true).getBoolean(true);
        bananaSeedEnabled = getItem(config, "bananaSeedEnabled");
        bananaSmoothieEnabled = getItem(config, "bananaSmoothieEnabled");
        butterEnabled = getItem(config, "butterEnabled");
        caramelEnabled = getItem(config, "caramelEnabled");
        cheeseEnabled = getItem(config, "cheeseEnabled");
        cherryEnabled = getItem(config, "cherryEnabled");
        cherryLemonadeEnabled = getItem(config, "cherryLemonadeEnabled");
        cherrySeedDropEnabled = config.get("options", "cherrySeedDropEnabled", true).getBoolean(true);
        cherrySeedEnabled = getItem(config, "cherrySeedEnabled");
        cherrySmoothieEnabled = getItem(config, "cherrySmoothieEnabled");
        chickenSandwichEnabled = getItem(config, "chickenSandwichEnabled");
        chilliEnabled = getItem(config, "chilliEnabled");
        chilliSeedDropEnabled = config.get("options", "chilliSeedDropEnabled", true).getBoolean(true);
        chilliSeedEnabled = getItem(config, "chilliSeedEnabled");
        chocolateEnabled = getItem(config, "chocolateEnabled");
        chocolateCakeEnabled = getItem(config, "chocolateCakeEnabled");
        chocolateCupCakeEnabled = getItem(config, "chocolateCupCakeEnabled");
        chocolateMilkEnabled = getItem(config, "chocolateMilkEnabled");
        chocolateSmoothieEnabled = getItem(config, "chocolateSmoothieEnabled");
        cornEnabled = getItem(config, "cornEnabled");
        cornSeedEnabled = getItem(config, "cornSeedEnabled");
        cornSeedDropEnabled = config.get("options", "cornSeedDropEnabled", true).getBoolean(true);
        cupcakeEnabled = getItem(config, "cupcakeEnabled");
        doughEnabled = getItem(config, "doughEnabled");
        fishSandwichEnabled = getItem(config, "fishSandwichEnabled");
        flourEnabled = getItem(config, "flourEnabled");
        friesEnabled = getItem(config, "friesEnabled");
        hamburgerEnabled = getItem(config, "hamburgerEnabled");
        hotdogEnabled = getItem(config, "hotdogEnabled");
        iceCubesEnabled = getItem(config, "iceCubesEnabled");
        jarEnabled = getItem(config, "jarEnabled");
        jellybeansEnabled = getItem(config, "jellybeansEnabled");
        ketchupEnabled = getItem(config, "ketchupEnabled");
        kiwiEnabled = getItem(config, "kiwiEnabled");
        kiwiLemonadeEnabled = getItem(config, "kiwiLemonadeEnabled");
        kiwiSeedEnabled = getItem(config, "kiwiSeedEnabled");
        kiwiSeedDropEnabled = config.get("options", "kiwiSeedDropEnabled", true).getBoolean(true);
        kiwiSmoothieEnabled = getItem(config, "kiwiSmoothieEnabled");
        knifeEnabled = getItem(config, "knifeEnabled");
        lemonEnabled = getItem(config, "lemonEnabled");
        lemonSeedEnabled = getItem(config, "lemonSeedEnabled");
        lemonSeedDropEnabled = config.get("options", "lemonSeedDropEnabled", true).getBoolean(true);
        lemonadeEnabled = getItem(config, "lemonadeEnabled");
        mayoEnabled = getItem(config, "mayoEnabled");
        mustardEnabled = getItem(config, "mustardEnabled");
        saltEnabled = getItem(config, "saltEnabled");
        smoothieGlassEnabled = getItem(config, "smoothieGlassEnabled");
        strawberryEnabled = getItem(config, "strawberryEnabled");
        strawberryLemonadeEnabled = getItem(config, "strawberryLemonadeEnnabled");
        strawberrySeedEnabled = getItem(config, "strawberrySeedEnabled");
        strawberrySeedDropEnabled = config.get("options", "strawberrySeedDropEnabled", true).getBoolean(true);
        strawberrySmoothieEnabled = getItem(config, "strawberrySmoothieEnabled");
        tacoEnabled = getItem(config, "tacoEnabled");
        toastEnabled = getItem(config, "toastEnabled");
        toastSandwichEnabled = getItem(config, "toastSandwichEnabled");
        tomatoEnabled = getItem(config, "tomatoEnabled");
        tomatoSeedEnabled = getItem(config, "tomatoSeedEnabled");
        tomatoSeedDropEnabled = config.get("options", "tomatoSeedDropEnabled", true).getBoolean(true);
        tomatoSoupEnabled = getItem(config, "tomatoSoupEnabled");
        uncookedFriesEnabled = getItem(config, "uncookedFriesEnabled");
        config.save();

    }

    private boolean getItem(Configuration config, String string)
    {
        return config.get("Items", standardizeName(string), true).getBoolean(true);
    }

    private boolean getBlock(Configuration config, String string)
    {
        return config.get("Blocks", standardizeName(string), true).getBoolean(true);
    }

    private String standardizeName(String name)
    {
        if (name.endsWith("enabled")) {
            name = name.replaceAll("enabled", "Enabled");
        }
        if (!name.endsWith("Enabled")) {
            name = name + "Enabled";
        }
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        return name;
    }

    public void registerStuff() {



    }

}
