package com.carvalho.util.serverside;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;

/**
 * Server side command.
 * Checks everyone's inventory and calculates 
 * how many items exist in the server total
 * followed by the average item amount per player
 * @author PC
 *
 */
public class ItemSaturationCommand implements ICommand {
	
	private static final String COMMAND_NAME="ItemSaturation";

	public ItemSaturationCommand() {
		//Placeholder
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
		
		return "Calculates item saturation";
	}
	/**
	 * Gets the list of aliases for this command.
	 * Other upper and lowercase variants of ItemSaturation
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public List getCommandAliases() {
		List<String> aliases=new ArrayList<String>();
		aliases.add("Itemsaturation");
		aliases.add("itemSaturation");
		aliases.add("itemsaturation");
		return aliases;
	}
	/**
	 * Processes the command.
	 * Gets the server and its player list, and then calculates
	 * how many total items the players have and the average
	 */
	@Override
	public void processCommand(ICommandSender var1, String[] var2) {
	
		MinecraftServer server=MinecraftServer.getServer();
		
		//List implementation
		@SuppressWarnings("unchecked")
		List<EntityPlayerMP> players= server.getConfigurationManager().playerEntityList;
		/**
		 * Item counter. Starts at 0
		 */
		int itemCounter=0;
		int playerCounter=players.size();
		/**
		 * The item ID to be searched.
		 */
			//Nested enhanced for loops
			for(EntityPlayerMP player:players)
			{
				
				for(ItemStack inv:player.inventory.mainInventory)
				{
					//Entered as a try-catch to avoid blank inventory slots
					try{
						Item.getIdFromItem(inv.getItem());
							itemCounter+=inv.stackSize;
						
					}
					catch(NullPointerException e)
					{
						//Do nothing, keep going
					}
				
					
				}
				
				}
			if(var1 instanceof EntityPlayer)
			{
				EntityPlayer player=(EntityPlayer)var1;
				player.addChatMessage(new ChatComponentText("Players in the server have " + itemCounter+" items in inventory\n"));
				player.addChatMessage(new ChatComponentText("On average, "+ itemCounter/playerCounter +" items"));

			}
		}
	
	/**
	 * Determines who can use this command.
	 * All users can
	 */
	@Override
	public boolean canCommandSenderUseCommand(ICommandSender var1) {
		return true;
	}

	@SuppressWarnings("rawtypes")
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
