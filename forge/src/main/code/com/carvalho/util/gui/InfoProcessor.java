package com.carvalho.util.gui;

import ibxm.Player;

import java.util.ArrayList;

import net.minecraft.entity.player.EntityPlayer;

public class InfoProcessor {
	protected ArrayList<String> dataToDisplay;
	
	
	public InfoProcessor(EntityPlayer player)
	{
		dataToDisplay=new ArrayList<String>();
		
		
		dataToDisplay.add(Integer.toString(player.getItemInUseDuration()));
		dataToDisplay.add(Integer.toString(player.experienceTotal));
		dataToDisplay.add(player.getRNG().toString());
		
	}

}
