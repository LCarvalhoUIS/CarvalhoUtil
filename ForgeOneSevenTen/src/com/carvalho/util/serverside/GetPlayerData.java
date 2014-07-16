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
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

/**
 * Server side command.
 * Checks everyone's inventory and calculates 
 * how many of an item exist in the server total
 * @author PC
 *
 */
public class GetPlayerData implements ICommand {
	
	private static final String COMMAND_NAME="GetPlayerData";

	public GetPlayerData() {
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
	
		return "Calculates how many of a block exist near you.";
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List getCommandAliases() {
		List<String> aliases=new ArrayList<String>();
		aliases.add("Getplayerdata");
		aliases.add("GetPlayerdata");
		aliases.add("GetplayerData");
		aliases.add("getplayerdata");
		aliases.add("getPlayerData");
		aliases.add("getPlayerdata");
		aliases.add("getplayerData");
		return aliases;
	}

	@Override
	public void processCommand(ICommandSender var1, String[] var2) {
	
		if(var1 instanceof EntityPlayer)
		{
			EntityPlayer player=(EntityPlayer)var1;
			player.addChatMessage(new ChatComponentText("Exp points: " + player.experienceTotal+"\n"));
			player.addChatMessage(new ChatComponentText("RNG seed: " + player.getRNG().toString()+"\n"));


		}
			
				
		}
		
	

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
