/** Carvalho Util
 * @author Lucas Carvalho
 * @version 1.2
 * 
 */


package com.carvalho.util;



import com.carvalho.util.networking.ClientPacketHandler;
import com.carvalho.util.networking.ServerPacketHandler;
import com.carvalho.util.recipes.MiscRecipes;
import com.carvalho.util.recipes.ShapelessRecipes;
import com.carvalho.util.recipes.SmeltingRecipes;
import com.carvalho.util.serverside.CalculateItemCommand;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.FMLEventChannel;
import cpw.mods.fml.common.network.NetworkRegistry;
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
    
    //Verify the packets come from my channel
    public final static int PACKET_TYPE_ENTITY_SYNC = 2;
    public final static int PACKET_TYPE_C2S_TEST = 2;
    public final static int PACKET_TYPE_WORLD_SYNC = 2;
    
    /**
     * THe name for the mod network channel
     */
    public static final String networkChannelName="CarvUtil";
    public static FMLEventChannel channel;
 
  
   
   @Instance(MODID)
   public static CarvUtil instance;
    
    
    /**
     * The Creative Mode tab for any blocks/items this class has to offer.
     */
    public static CreativeTabs CarvTab=new CreativeTabs("CarvUtil") {
		
		@Override
		public Item getTabIconItem() {
			return Items.iron_pickaxe; //Placeholder icon
		}
	};
	
    
	
	/**
	 * The preinitializer. Loads the config file
	 * @param event The preinitialization event
	 */
    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
    	//Begin test area
    	
    	/**
    	 * The config file. Named after the mod
    	 */
    	Configuration config=new Configuration(event.getSuggestedConfigurationFile());
    	config.load();
    	
    	
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
     * Initializer. Registers the proxies
     * @param event The initialization event
     */
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	//Starts the network channel
    	CarvUtil.channel=NetworkRegistry.INSTANCE.newEventDrivenChannel(CarvUtil.networkChannelName);
    	CarvUtil.channel.register(new ServerPacketHandler());
    	CarvUtil.channel.register(new ClientPacketHandler());
    	
    	
    	
    }
    
    
    /**
     * Post initializer. Currently unused
     * @param event The post-initialization event
     */
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
     	
     	
     	
    	
    }
   
    /**
     * Client side loader
     * Registers any renderers
     * @param event
     */
    @EventHandler
    public void Load(FMLInitializationEvent event)
    {
    	//Empty for now
    }
    	
    
    /**
     * Server side loader
     * Registers any server side commands
     * @param event
     */
    @EventHandler
    public void serverLoad(FMLServerStartingEvent event)
    {
      event.registerServerCommand(new CalculateItemCommand());
    }
}


