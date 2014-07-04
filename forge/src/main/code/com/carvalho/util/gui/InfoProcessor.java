/** Carvalho Util
 * @author Lucas Carvalho
 * @version 1.2
 * 
 */
package com.carvalho.util.gui;

import java.util.ArrayList;

import net.minecraft.entity.player.EntityPlayer;


/**
 * Data gatherer for the GUI
 * @author Lucas Carvalho
 *
 */
public class InfoProcessor {
	/**
	 * Part of the skill demonstration, standard ArrayList containing the data
	 */
	protected ArrayList<String> dataToDisplay;
	/**
	 * The player whose data is being displayed
	 */
	EntityPlayer player;
	
	
	public InfoProcessor(EntityPlayer player)
	{
		this.player=player;
		dataToDisplay=new ArrayList<String>();
		processData();
		
		
	}
	/**
	 * Gets the data.
	 */
	public void processData()
	{
		dataToDisplay.add(Integer.toString(player.getItemInUseDuration()));
		dataToDisplay.add(Integer.toString(player.experienceTotal));
		dataToDisplay.add(player.getRNG().toString());
	}

}
