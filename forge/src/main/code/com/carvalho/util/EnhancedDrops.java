/** Carvalho Util
 * @author Lucas Carvalho
 * @version 1.2
 * 
 */
package com.carvalho.util;

import java.util.Random;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraftforge.event.entity.living.LivingDeathEvent;




/**
 * Adds different mob drops.
 * Current drops:
 * Horses drop raw beef (or cooked beef if on fire
 *
 */
public class EnhancedDrops {
	
	
	/**
	 * Adds the special drops.
	 * @param event trigger of any entity death
	 */
	@SubscribeEvent
	public void DropEnhancedLoot(LivingDeathEvent event)
	{
		//Gets the source of damage and finds the looting modifier
		Entity source=event.source.getSourceOfDamage();
		//Finds out if the entity was killed by a player
		boolean wasKilledByPlayer=false;
		int lootingModifier=0;
		if(source instanceof EntityPlayer)
		{
			wasKilledByPlayer=true;
			lootingModifier=EnchantmentHelper.getLootingModifier((EntityLivingBase) source);
			}
		
		//For horses
		if(event.entity instanceof EntityHorse)
		{
			EntityHorse horse=(EntityHorse) event.entity;
		/*	if(horse.isBurning())
				horse.dropItem(Items.cooked_beef,1);
			else
				horse.dropItem(Items.beef,1);*/
			
			dropFewItems(wasKilledByPlayer,lootingModifier,horse);

			
			//Ends the event
		event.setCanceled(true);
		}
	}
	 /**
     * Drop 0-2 items of this living's type. @param par1 - Whether this entity has recently been hit by a player. @param
     * par2 - Level of Looting used to kill this mob.
     * Modified from EntityCow
     */
	  protected void dropFewItems(boolean par1, int par2,EntityLiving deadEntity)
	    {
		   /**
			 * The RNG for mod drops.
			 */
			Random rand=new Random();
	        int j = rand.nextInt(3) + rand.nextInt(1 + par2);
	        int k;

	        for (k = 0; k < j; ++k)
	        {
	           deadEntity.dropItem(Items.leather, 1);
	        }

	        j = rand.nextInt(3) + 1 + rand.nextInt(1 + par2);

	        for (k = 0; k < j; ++k)
	        {
	            if (deadEntity.isBurning())
	            {
	                deadEntity.dropItem(Items.cooked_beef, 1);
	            }
	            else
	            {
	                deadEntity.dropItem(Items.beef, 1);
	            }
	        }
	    }

	
	


}
