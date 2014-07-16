package com.carvalho.util.serverside;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatStyle;
import net.minecraft.util.IChatComponent;

/**
 * Server side command.
 * Checks everyone's inventory and calculates 
 * how many of an item exist in the server total
 * @author PC
 *
 */
public class CalculateItemCommand implements ICommand {
	
	private static final String COMMAND_NAME="ItemCalc";

	public CalculateItemCommand() {
		//Placeholder
			}

	@Override
	public int compareTo(Object o) {
		// Unused
		return 0;
	}

	@Override
	public String getCommandName() {
		
		return COMMAND_NAME;
	}

	@Override
	public String getCommandUsage(ICommandSender var1) {
		
		return "Calculates item saturation";
	}
	/**
	 * Gets the list of aliases for this command.
	 * Other upper and lowercase variants of itemcalc
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public List getCommandAliases() {
		List<String> aliases=new ArrayList<String>();
		aliases.add("Itemcalc");
		aliases.add("itemCalc");
		aliases.add("itemcalc");
		return aliases;
	}
	/**
	 * Processes the command.
	 * Gets the server and its player list, and then calculates
	 * how many of the item everybody has as a whole
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
		/**
		 * The item ID to be searched.
		 */
		int ItemID=Integer.parseInt(var2[0]);
			//Nested enhanced for loops
			for(EntityPlayerMP player:players)
			{
				
				for(ItemStack inv:player.inventory.mainInventory)
				{
					//Entered as a try-catch to avoid blank inventory slots
					try{
						if(Item.getIdFromItem(inv.getItem())==ItemID)
						{
							itemCounter+=inv.stackSize;
							
							
						}
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
				player.addChatMessage(new ChatComponentText("Players in the server have " + itemCounter+" of this item in their inventories"));
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
