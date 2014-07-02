package com.carvalho.util;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;

/**
 * A simple part of the mod, created to demonstrate understanding of basic Java
 * concepts.
 * @author Lucas Carvalho
 *
 */
public class KnowledgeDemonstration {
	
	
	
	public void onPlayerSpawn(EntityJoinWorldEvent event)
	{
		if(event.entity instanceof EntityPlayer)
		{
			System.out.println("Aha");
		}
	}

}
