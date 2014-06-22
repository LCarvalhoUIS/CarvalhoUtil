/** Carvalho Util
 * @author Lucas Carvalho
 * @version 1.1
 * 
 */
package com.carvalho.util;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;


/**
 * Adds smelting recipes that can be used in any furnace.
 */
public class SmeltingRecipes {

	/**Allows the smelting of iron related non-tools back to their raw material, if the item
	 * has not been used. Does not give experience points for balance reasons.
	 * 
	 * Anvil, Cauldron, Compass, Iron Door, Hopper, 
	 * Minecart, Bucket, Iron Bars, Compass, Map, Activator Rail,
	 * Detetor Rail, Piston, Sticky Piston, Rail, Tripwire Hook
	 * Trapped Chest, Heavy Weighted Pressure Plate
	 * @param setting Whether or not to enable this feature
	 */
	public static void enableIronSmelting(boolean setting)
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
	public static void enableGoldSmelting(boolean setting)
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
	public static void enableDiamondSmelting(boolean setting)
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
	public static void enableToolSmelting(boolean setting)
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

	/**Allows the smelting of armor back to their raw material, if the item
	 * has not been used. Does not give experience points for balance reasons.
	 * Armor included:
	 * Helmet, Chestplate, Leggings, Boots (Leather, Iron, Gold, Diamond),
	 *  Horse Armor (Iron, Gold, Diamond)
	 * 
	 * @param setting Whether or not to enable this feature
	 */
	public static void enableArmorSmelting(boolean setting)
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
