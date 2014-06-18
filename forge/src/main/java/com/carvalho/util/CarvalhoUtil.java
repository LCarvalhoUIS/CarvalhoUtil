package com.carvalho.util;


import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = CarvalhoUtil.MODID, version = CarvalhoUtil.VERSION)
public class CarvalhoUtil
{
    public static final String MODID = "CarvalhoUtil";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
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
    	GameRegistry.addSmelting(Blocks.anvil, new ItemStack(Items.iron_ingot,31),0.0f);
    	GameRegistry.addSmelting(Blocks.cauldron, new ItemStack(Items.iron_ingot,7),0.0f);
    	GameRegistry.addSmelting(Items.compass, new ItemStack(Items.iron_ingot,4),0.0f);
    	GameRegistry.addSmelting(Blocks.iron_door, new ItemStack(Items.iron_ingot,6),0.0f);
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

    	
    	
    	//Gold
    	GameRegistry.addSmelting(Items.clock,new ItemStack(Items.gold_ingot,4),0.0f);
    	GameRegistry.addSmelting(Items.golden_apple,new ItemStack(Items.gold_ingot,8),0.0f);
    	
    	//Diamond
    	GameRegistry.addSmelting(Blocks.enchanting_table,new ItemStack(Items.diamond,2),0.0f);
    	GameRegistry.addSmelting(Blocks.jukebox,new ItemStack(Items.diamond),0.0f);
    	GameRegistry.addSmelting(Items.firework_charge,new ItemStack(Items.diamond),0.0f);
    	
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
    	GameRegistry.addSmelting(new ItemStack(Items.flint_and_steel,1,0),new ItemStack(Items.iron_ingot,1),0.0f);

    	GameRegistry.addSmelting(new ItemStack(Items.diamond_pickaxe,1,0),new ItemStack(Items.diamond,3),0.0f);
    	
    	/*Shaped recipes
    	 * Feather and Leater Beds
    	 */
    	GameRegistry.addRecipe(new ItemStack(Blocks.bed), new Object[]{
            "AAA",
            "BBB",
            "   ",
            'A', Items.leather,Blocks.planks
        });
    	GameRegistry.addRecipe(new ItemStack(Blocks.bed), new Object[]{
            "AAA",
            "AAA",
            "BBB",
            'A', Items.feather,Blocks.planks
        });


    	
    	//GameRegistry.addSmelting(Blocks, new ItemStack(Items.iron_ingot,31),0.1f);
    	/*
    	GameRegistry.addSmelting(Items.iron_pickaxe, new ItemStack(Items.iron_ingot,3),0.1f);
    	GameRegistry.addSmelting(Items.iron_shovel, new ItemStack(Items.iron_ingot,1),0.1f);
    	GameRegistry.addSmelting(Items.iron_hoe, new ItemStack(Items.iron_ingot,2),0.1f);
    	GameRegistry.addSmelting(Items.iron_axe, new ItemStack(Items.iron_ingot,3),0.1f);
    	*/
    
    	
		
        
}
}
