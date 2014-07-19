/** Carvalho Util
 * @author Lucas Carvalho
 * @version 1.2
 * 
 */
package com.carvalho.util.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;


/**
 * Adds a combination of shaped, shapeless, and smelted recipes.
 * 
 *
 */
public class MiscRecipes {

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
	public static void enableMiscRecipes(boolean setting)
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
			//Buckets & Bottles (Buckets disabled due to a glitch)
			//GameRegistry.addShapelessRecipe(new ItemStack(Items.bucket),Items.water_bucket);
			//GameRegistry.addShapelessRecipe(new ItemStack(Items.bucket),Items.lava_bucket);
			//GameRegistry.addShapelessRecipe(new ItemStack(Items.bucket),Items.milk_bucket);
			//GameRegistry.addShapelessRecipe(new ItemStack(Items.glass_bottle),Items.potionitem);
			//Bottle o' Enchanting
			GameRegistry.addShapelessRecipe(new ItemStack(Items.experience_bottle),Items.glass_bottle,Items.skull);
		//Smelt
			GameRegistry.addSmelting(new ItemStack(Items.rotten_flesh,3),new ItemStack(Items.leather),0.0f);
	
		}
		
	}

}
