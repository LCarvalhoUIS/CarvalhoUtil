package com.carvalho.util.serverside;

import ibxm.Player;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;

/**
 * Server side command.
 * Checks everyone's inventory and calculates 
 * how many of an item exist in the server total
 * @author PC
 *
 */
public class CalculateBlocksCommand implements ICommand {
	
	private static final String COMMAND_NAME="CalculateBlocks";

	public CalculateBlocksCommand() {
		//Unused
	}

	@Override
	public int compareTo(Object o) {
		// Unused
		return 0;
	}

	/**
	 * Gets the command's name
	 */
	@Override
	public String getCommandName() {
		
		return COMMAND_NAME;
	}
	/**
	 * Describes what the command does
	 */
	@Override
	public String getCommandUsage(ICommandSender var1) {
	
		return "Calculates how many of an item exist in the server.";
	}

	@Override
	public List getCommandAliases() {
		List<String> aliases=new ArrayList<String>();
		aliases.add("calculateblocks");
		aliases.add("calculateBlocks");
		aliases.add("Calculateblocks");
		return aliases;
	}

	@Override
	public void processCommand(ICommandSender var1, String[] var2) {
	
		MinecraftServer server=MinecraftServer.getServer();
		List<EntityPlayerMP> players= server.getConfigurationManager().playerEntityList;
		int itemCounter=0;
	
		int ItemID=Integer.parseInt(var2[0]);
		
			for(EntityPlayerMP player:players)
			{
				
				for(ItemStack inv:player.inventory.mainInventory)
				{
				
					try{
						if(Item.getIdFromItem(inv.getItem())==ItemID)
						{
							itemCounter+=inv.stackSize;
							
							
						}
					}
					catch(NullPointerException e)
					{
						
					}
				
					
				}
				System.out.println("Players in the server have " + itemCounter+" of this item in their inventories");
					
				}
				
		}
		//	System.out.println("This user has this many exp points- " .get(1).experience);
	

	@Override
	public boolean canCommandSenderUseCommand(ICommandSender var1) {
		return true;
	}

	@Override
	public List addTabCompletionOptions(ICommandSender var1, String[] var2) {
		// Unused
		return null;
	}

	@Override
	public boolean isUsernameIndex(String[] var1, int var2) {
		// Unused
		return false;
	}

}
