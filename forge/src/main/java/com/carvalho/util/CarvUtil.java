/** Carvalho Util
 * @author Lucas Carvalho
 * @version 1.1
 * 
 */


package com.carvalho.util;



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
    	
    	config.save();
    	
    //	testItem=new Item().setCreativeTab(CarvTab).setUnlocalizedName("TestItem");
    	//GameRegistry.registerItem(testItem,"TestItem");
    	
    	//testBlock=new Block(Material).setCreativeTab(CarvTab).
    	
    	
    	//Template for adding a recipe
    	/*GameRegistry.addRecipe(new ItemStack(Blocks.obsidian), new Object[]{
            "AAA",
            "AAA",
            "   ",
            'A', Items.arrow
        });*/
    	/*(Adds a way to convert items to their ingot forms by smelting
    	//For balance reasons only undamaged items may do so and no exp will be given
    	//Items included:
    	//Iron: Anvil, Cauldron, Compass, Iron Door, Hopper, 
    	 * 		Minecart, Bucket, Iron Bars, Compass, Map, Activator Rail,
    	 * 		Detetor Rail, Piston, Sticky Piston, Rail, 
    	 * Gold: Clock, Golden Apple
    	 * 
    	 * Diamond: Enchanting Table, Jukebox, Firework Charge (All variants)
    	 * 
    	 * See next section for breakable implementation
    	 */
    	//Iron
    	

    	
    	
    	//Gold
    	
    	
    	//Diamond
    	
    	
    	/*Breakable item smelting
    	//Only fully untouched tools may be smelted
    	//Items included:
    	//Iron: Flint and steel
    	 * Gold: 
    	 * 
    	 * Diamond: 
    	 * 
    	 * 
    	 */
    	
    	/*Shaped recipes
    	 * Feather and Leater Beds
    	 */
    	
    	
    	
		
        
}
    
    
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	
    }
    
    
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	
    }
    /**Allows the smelting of iron related non-tools back to their raw material, if the item
     * has not been used. Does not give experience points for balance reasons.
     * 
     * 
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
     * 
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
     * 
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
    
    
}


