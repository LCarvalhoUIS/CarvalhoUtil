/** Carvalho Util
 * @author Lucas Carvalho
 * @version 1.1
 * 
 */
package com.carvalho.util;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.passive.EntityHorse;
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
		//For horses
		if(event.entity instanceof EntityHorse)
		{
			EntityHorse horse=(EntityHorse) event.entity;
			if(horse.isBurning())
				horse.dropItem(Items.cooked_beef,1);
			else
				horse.dropItem(Items.beef,1);
			
			
			
			//Ends the event
		event.setCanceled(true);
		}
	}
	
	


}
