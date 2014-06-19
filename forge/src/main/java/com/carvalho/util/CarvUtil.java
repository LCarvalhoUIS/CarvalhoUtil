/** Carvalho Util
 * @author Lucas Carvalho
 * @version 1.1
 * 
 */


package com.carvalho.util;



import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.common.config.*;


/** The main mod class.
 * 
 */
@Mod(modid = CarvUtil.MODID, version = CarvUtil.VERSION)
public class CarvUtil
{
    public static final String MODID = "CarvalhoUtil";
    public static final String VERSION = "1.1";
    
    
    /**
     * The Creative Mode tab for any blocks/items this class has to offer.
     */
    public static CreativeTabs CarvTab=new CreativeTabs("CarvUtil") {
		
		@Override
		public Item getTabIconItem() {
			// TODO Auto-generated method stub
			return Items.iron_pickaxe; //Placeholder icon
		}
	};
	
	//public static Item testItem;
	//public static Block testBlock;
	
	//public static int testBlockID;
    
	
	/**
	 * The preinitializer. Loads the config file
	 * @param event The preinitialization event
	 */
	
    @EventHandler
    public void preinit(FMLPreInitializationEvent event)

    {
    	/**
    	 * The config file. Named after the mod
    	 */
    	Configuration config=new Configuration(event.getSuggestedConfigurationFile());
    	config.load();
    	
    	//testBlockID=config.get(Configuration.CATEGORY_GENERAL,"Test block ID",200).getInt();
    	//Checks for Iron item setting
    	enableIronSmelting(config.get(Configuration.CATEGORY_GENERAL,"Enable Iron Smelting Recipes",true).getBoolean(true));
    	//Checks for Gold item setting
    	enableGoldSmelting(config.get(Configuration.CATEGORY_GENERAL,"Enable Gold Smelting Recipes",true).getBoolean(true));
    	//Checks for Diamond item setting
    	enableDiamondSmelting(config.get(Configuration.CATEGORY_GENERAL,"Enable Diamond Smelting Recipes",true).getBoolean(true));
    	//Checks for tool setting
    	enableToolSmelting(config.get(Configuration.CATEGORY_GENERAL,"Enable Tool Smelting Recipes",true).getBoolean(true));
    	//Checks for wood backwards setting
    	enableWoodBackwardsRecipes(config.get(Configuration.CATEGORY_GENERAL,"Enable Backwards Plank Recipes",true).getBoolean(true));
    	//Checks for misc recipes
    	enableMiscRecipes(config.get(Configuration.CATEGORY_GENERAL,"Enable Misc Recipes",true).getBoolean(true));
    	enableArmorSmelting(config.get(Configuration.CATEGORY_GENERAL,"Enable Armor Smelting",true).getBoolean(true));

    	config.save();
 
    	
    //	testItem=new Item().setCreativeTab(CarvTab).setUnlocalizedName("TestItem");
    	//GameRegistry.registerItem(testItem,"TestItem");
    	
    	//testBlock=new Block(Material).setCreativeTab(CarvTab).
    
    	
    	
		
        
}
    
    
    /**
     * Initializer. Currently unused
     * @param event The initialization evnent
     */
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	
    }
    
    
    /**
     * Post initializer. Currently unused
     * @param event The post-initialization event
     */
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	
    }
    /**Allows the smelting of iron related non-tools back to their raw material, if the item
     * has not been used. Does not give experience points for balance reasons.
     * 
     * Anvil, Cauldron, Compass, Iron Door, Hopper, 
     * Minecart, Bucket, Iron Bars, Compass, Map, Activator Rail,
     * Detetor Rail, Piston, Sticky Piston, Rail, Tripwire Hook
     * Trapped Chest, Heavy Weighted Pressure Plate
     * @param setting Whether or not to enable this feature
     */
    public void enableIronSmelting(boolean setting)
    {
    	
    	if(setting)
    	{
    	
    		GameRegistry.addSmelting(Blocks.anvil, new ItemStack(Items.iron_ingot,31),0.0f);
        	GameRegistry.addSmelting(Blocks.cauldron, new ItemStack(Items.iron_ingot,7),0.0f);
        	GameRegistry.addSmelting(Items.compass, new ItemStack(Items.iron_ingot,4),0.0f);
        	GameRegistry.addSmelting(Items.iron_door, new ItemStack(Items.iron_ingot,6),0.0f);
        	GameRegistry.addSmelting(Blocks.hopper, new ItemStack(Items.iron_ingot,5),0.0f);
        	GameRegistry.addSmelting(Items.minecart, new ItemStack(Items.iron_ingot,5),0.0f);
        	GameRegistry.addSmelting(Items.bucket, new ItemStack(Items.iron_ingot,3),0.0f);
        	GameRegistry.addSmelting(new ItemStack(Blocks.iron_bars,8),new ItemStack(Items.iron_ingot,3),0.0f);
        	GameRegistry.addSmelting(Items.map,new ItemStack(Items.iron_ingot,4),0.0f);
        	GameRegistry.addSmelting(Blocks.activator_rail,new ItemStack(Items.iron_ingot,1),0.0f);
        	GameRegistry.addSmelting(Blocks.detector_rail,new ItemStack(Items.iron_ingot,1),0.0f);
        	GameRegistry.addSmelting(Blocks.piston,new ItemStack(Items.iron_ingot,1),0.0f);
        	GameRegistry.addSmelting(Blocks.sticky_piston,new ItemStack(Items.iron_ingot,1),0.0f);
        	GameRegistry.addSmelting(Blocks.activator_rail,new ItemStack(Items.iron_ingot,1),0.0f);
        	GameRegistry.addSmelting(new ItemStack(Blocks.rail,8),new ItemStack(Items.iron_ingot,3),0.0f);
        	GameRegistry.addSmelting(new ItemStack(Blocks.tripwire_hook,2),new ItemStack(Items.iron_ingot,1),0.0f);
        	GameRegistry.addSmelting(Blocks.trapped_chest,new ItemStack(Items.iron_ingot,3),0.0f);
        	GameRegistry.addSmelting(Blocks.heavy_weighted_pressure_plate,new ItemStack(Items.iron_ingot,2),0.0f);
    		
    	}
    }
    
    /**Allows the smelting of gold related non-tools back to their raw material, if the item
     * has not been used. Does not give experience points for balance reasons.
     * Includes: Clock, Golden Apple
     * 
     * @param setting Whether or not to enable this feature
     */
    public void enableGoldSmelting(boolean setting)
    {
    	if(setting)
    	{
    		GameRegistry.addSmelting(Items.clock,new ItemStack(Items.gold_ingot,4),0.0f);
        	GameRegistry.addSmelting(Items.golden_apple,new ItemStack(Items.gold_ingot,8),0.0f);
    		
    	}
    }
    /**Allows the smelting of diamond related non-tools back to their raw material, if the item
     * has not been used. Does not give experience points for balance reasons.
     * Includes: Enchanting Table, Jubebox, Firework Charge (All variants)
     * 
     * @param setting Whether or not to enable this feature
     */
    public void enableDiamondSmelting(boolean setting)
    {
    	GameRegistry.addSmelting(Blocks.enchanting_table,new ItemStack(Items.diamond,2),0.0f);
    	GameRegistry.addSmelting(Blocks.jukebox,new ItemStack(Items.diamond),0.0f);
    	GameRegistry.addSmelting(Items.firework_charge,new ItemStack(Items.diamond),0.0f);
    	
    }
    /**Allows the smelting of iron, gold, and diamond related tools back to their raw material, if the item
     * has not been used. Does not give experience points for balance reasons.
     * Tools included:
     * Shears, Flint and Steel, Pickaxes, Axes, Shovels, Hoes (Iron, Gold, Diamond)
     * 
     * @param setting Whether or not to enable this feature
     */
    public void enableToolSmelting(boolean setting)
    {
    	if(setting)
    	{
    		GameRegistry.addSmelting(new ItemStack(Items.shears,1,0),new ItemStack(Items.iron_ingot,2),0.0f);
    		GameRegistry.addSmelting(new ItemStack(Items.flint_and_steel,1,0),new ItemStack(Items.iron_ingot,1),0.0f);
    		
    		GameRegistry.addSmelting(new ItemStack(Items.iron_pickaxe,1,0),new ItemStack(Items.iron_ingot,3),0.0f);
    		GameRegistry.addSmelting(new ItemStack(Items.golden_pickaxe,1,0),new ItemStack(Items.gold_ingot,3),0.0f);
        	GameRegistry.addSmelting(new ItemStack(Items.diamond_pickaxe,1,0),new ItemStack(Items.diamond,3),0.0f);
        	
        	GameRegistry.addSmelting(new ItemStack(Items.iron_axe,1,0),new ItemStack(Items.iron_ingot,3),0.0f);
    		GameRegistry.addSmelting(new ItemStack(Items.golden_axe,1,0),new ItemStack(Items.gold_ingot,3),0.0f);
        	GameRegistry.addSmelting(new ItemStack(Items.diamond_axe,1,0),new ItemStack(Items.diamond,3),0.0f);
        	
        	GameRegistry.addSmelting(new ItemStack(Items.iron_shovel,1,0),new ItemStack(Items.iron_ingot,1),0.0f);
    		GameRegistry.addSmelting(new ItemStack(Items.golden_shovel,1,0),new ItemStack(Items.gold_ingot,1),0.0f);
        	GameRegistry.addSmelting(new ItemStack(Items.diamond_shovel,1,0),new ItemStack(Items.diamond,1),0.0f);
        	
        	GameRegistry.addSmelting(new ItemStack(Items.iron_hoe,1,0),new ItemStack(Items.iron_ingot,2),0.0f);
    		GameRegistry.addSmelting(new ItemStack(Items.golden_hoe,1,0),new ItemStack(Items.gold_ingot,2),0.0f);
        	GameRegistry.addSmelting(new ItemStack(Items.diamond_hoe,1,0),new ItemStack(Items.diamond,2),0.0f);
        	
    	}
    }
    
    /**
     * Allows the shapeless backwards crafting of wood plank and stick related things
     * Things included:
     * 
     * @param setting Whether or not to enable this feature
     */
    public void enableWoodBackwardsRecipes(boolean setting)
    {
    	if(setting)
    	{
    		
    	}
    	
    }
    /**
     * Adds misc. recipes, both crafting and smelting.
     * Includes: 
     * Shaped:
     * Leather and Feather beds
     * Iron, Gold, and Diamond Horse Armor
     * Shapeless:
     * Water Bucket to Bucket
     * Milk Bucket to Bucket
     * Lava Bucket to Bucket
     * Any Potion/Bottle to Empty Bottle
     * Empty Bottle plus Head to Bottle o' Enchanting
     * Smelt:
     * 3 Rotten Flesh to 1 Leather 
     * 
     * @param setting Whether or not to enable this feature
     */
    public void enableMiscRecipes(boolean setting)
    {
    	if(setting)
    	{
    	//Shaped
    		//Beds
    		GameRegistry.addRecipe(new ItemStack(Items.bed), "xxx","yyy", 'x',Items.leather, 'y',Blocks.planks);
    		GameRegistry.addRecipe(new ItemStack(Items.bed), "xxx","xxx","yyy", 'x',Items.feather, 'y',Blocks.planks);
    		//Horse armor
    		GameRegistry.addRecipe(new ItemStack(Items.iron_horse_armor), "x  ","xyx","xxx", 'x',Items.iron_ingot, 'y',Blocks.wool);
    		GameRegistry.addRecipe(new ItemStack(Items.golden_horse_armor), "x  ","xyx","xxx", 'x',Items.gold_ingot, 'y',Blocks.wool);
    		GameRegistry.addRecipe(new ItemStack(Items.diamond_horse_armor), "x  ","xyx","xxx", 'x',Items.diamond, 'y',Blocks.wool);
    	//Shapeless
    		//Buckets & Bottles
    		GameRegistry.addShapelessRecipe(new ItemStack(Items.bucket),Items.water_bucket);
    		GameRegistry.addShapelessRecipe(new ItemStack(Items.bucket),Items.lava_bucket);
    		GameRegistry.addShapelessRecipe(new ItemStack(Items.bucket),Items.milk_bucket);
    		GameRegistry.addShapelessRecipe(new ItemStack(Items.glass_bottle),Items.potionitem);
    		//Bottle o' Enchanting
    		GameRegistry.addShapelessRecipe(new ItemStack(Items.experience_bottle),Items.glass_bottle,Items.skull);
    	//Smelt
    		GameRegistry.addSmelting(new ItemStack(Items.rotten_flesh,3),new ItemStack(Items.leather),0.0f);

    	}
    	
    }
    /**Allows the smelting of armor back to their raw material, if the item
     * has not been used. Does not give experience points for balance reasons.
     * Armor included:
     * Helmet, Chestplate, Leggings, Boots (Leather, Iron, Gold, Diamond),
     *  Horse Armor (Iron, Gold, Diamond)
     * 
     * @param setting Whether or not to enable this feature
     */
    public void enableArmorSmelting(boolean setting)
    {
    	if(setting)
    	{
    		//Helmets
    		GameRegistry.addSmelting(new ItemStack(Items.leather_helmet,1,0),new ItemStack(Items.leather,5),0.0f);
    		GameRegistry.addSmelting(new ItemStack(Items.iron_helmet,1,0),new ItemStack(Items.iron_ingot,5),0.0f);
    		GameRegistry.addSmelting(new ItemStack(Items.golden_helmet,1,0),new ItemStack(Items.gold_ingot,5),0.0f);
    		GameRegistry.addSmelting(new ItemStack(Items.diamond_helmet,1,0),new ItemStack(Items.diamond,5),0.0f);
    		//Chestplates
    		GameRegistry.addSmelting(new ItemStack(Items.leather_chestplate,1,0),new ItemStack(Items.leather,8),0.0f);
    		GameRegistry.addSmelting(new ItemStack(Items.iron_chestplate,1,0),new ItemStack(Items.iron_ingot,8),0.0f);
    		GameRegistry.addSmelting(new ItemStack(Items.golden_chestplate,1,0),new ItemStack(Items.gold_ingot,8),0.0f);
    		GameRegistry.addSmelting(new ItemStack(Items.diamond_chestplate,1,0),new ItemStack(Items.diamond,8),0.0f);
    		//Leggings
    		GameRegistry.addSmelting(new ItemStack(Items.leather_leggings,1,0),new ItemStack(Items.leather,7),0.0f);
    		GameRegistry.addSmelting(new ItemStack(Items.iron_leggings,1,0),new ItemStack(Items.iron_ingot,7),0.0f);
    		GameRegistry.addSmelting(new ItemStack(Items.golden_leggings,1,0),new ItemStack(Items.gold_ingot,7),0.0f);
    		GameRegistry.addSmelting(new ItemStack(Items.diamond_leggings,1,0),new ItemStack(Items.diamond,7),0.0f);
    		//Boots
    		GameRegistry.addSmelting(new ItemStack(Items.leather_boots,1,0),new ItemStack(Items.leather,4),0.0f);
    		GameRegistry.addSmelting(new ItemStack(Items.iron_boots,1,0),new ItemStack(Items.iron_ingot,4),0.0f);
    		GameRegistry.addSmelting(new ItemStack(Items.golden_boots,1,0),new ItemStack(Items.gold_ingot,4),0.0f);
    		GameRegistry.addSmelting(new ItemStack(Items.diamond_boots,1,0),new ItemStack(Items.diamond,4),0.0f);
    		//Horse armor
    		GameRegistry.addSmelting(new ItemStack(Items.iron_horse_armor,1,0),new ItemStack(Items.iron_ingot,6),0.0f);
    		GameRegistry.addSmelting(new ItemStack(Items.golden_horse_armor,1,0),new ItemStack(Items.gold_ingot,6),0.0f);
    		GameRegistry.addSmelting(new ItemStack(Items.diamond_horse_armor,1,0),new ItemStack(Items.diamond,6),0.0f);
    		
    	}
    	
    }
    
}


