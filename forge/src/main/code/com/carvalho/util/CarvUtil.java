/** Carvalho Util
 * @author Lucas Carvalho
 * @version 1.1
 * 
 */


package com.carvalho.util;



import com.carvalho.util.gui.ControlPanelFrame;
import com.carvalho.util.proxy.CommonProxy;
import com.carvalho.util.recipes.MiscRecipes;
import com.carvalho.util.recipes.ShapelessRecipes;
import com.carvalho.util.recipes.SmeltingRecipes;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.*;


/** The main mod class.
 * 
 */
@Mod(modid = CarvUtil.MODID, version = CarvUtil.VERSION)
public class CarvUtil
{
    public static final String MODID = "CarvalhoUtil";
    public static final String VERSION = "1.2";
    
    
    @SidedProxy(clientSide="com.carvalho.util.proxy.ClientProxy",
    			serverSide="com.carvalho.util.proxy.CommonProxy")
   public static CommonProxy proxy;
   
   @Instance(MODID)
   public static CarvUtil instance;
    
    
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
    	//Begin test area
    	
    	//End test area
    	
    	/**
    	 * The config file. Named after the mod
    	 */
    	Configuration config=new Configuration(event.getSuggestedConfigurationFile());
    	config.load();
    	
    	//Gets the ID for the test block
    	//CarvUtil.block.setBlockID
    
    	//testBlockID=config.get(Configuration.CATEGORY_GENERAL,"Test block ID",200).getInt();
    	//Checks for Iron item setting
    	SmeltingRecipes.enableIronSmelting(config.get(Configuration.CATEGORY_GENERAL,"Enable Iron Smelting Recipes",true).getBoolean(true));
    	//Checks for Gold item setting
    	SmeltingRecipes.enableGoldSmelting(config.get(Configuration.CATEGORY_GENERAL,"Enable Gold Smelting Recipes",true).getBoolean(true));
    	//Checks for Diamond item setting
    	SmeltingRecipes.enableDiamondSmelting(config.get(Configuration.CATEGORY_GENERAL,"Enable Diamond Smelting Recipes",true).getBoolean(true));
    	//Checks for tool setting
    	SmeltingRecipes.enableToolSmelting(config.get(Configuration.CATEGORY_GENERAL,"Enable Tool Smelting Recipes",true).getBoolean(true));
    	//Checks for wood backwards setting
    	ShapelessRecipes.enableWoodBackwardsRecipes(config.get(Configuration.CATEGORY_GENERAL,"Enable Backwards Plank Recipes",true).getBoolean(true));
    	//Checks for misc recipes
    	MiscRecipes.enableMiscRecipes(config.get(Configuration.CATEGORY_GENERAL,"Enable Misc Recipes",true).getBoolean(true));
    	//Checks for armor smelting
    	SmeltingRecipes.enableArmorSmelting(config.get(Configuration.CATEGORY_GENERAL,"Enable Armor Smelting",true).getBoolean(true));
    	
    	//Checks for enhanced mob drops
    	if(config.get(Configuration.CATEGORY_GENERAL,"Enable Enhanced Mob Drops",true).getBoolean(true))
    		MinecraftForge.EVENT_BUS.register(new EnhancedDrops());

    	config.save();
 
    
    	
    	
		
        
}
    
    
    /**
     * Initializer. Currently unused
     * @param event The initialization evnent
     */
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    
    	proxy.registerProxies();
   
    	
    	
    }
    
    
    /**
     * Post initializer. Currently unused
     * @param event The post-initialization event
     */
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
     	ControlPanelFrame frame= new ControlPanelFrame();
     	
     	
    	
    }
    public void enableMiscOptions(boolean setting)
    {
    	if(setting)
    	{
    		
    	
    		
    	}
    }
    
   
}


