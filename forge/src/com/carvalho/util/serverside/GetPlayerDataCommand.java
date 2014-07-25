package com.carvalho.util.serverside;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;

/**
 * Server side command.
 * Gets and displays the player's experience points (not level)
 * and RNG seed
 * @author PC
 *
 */
public class GetPlayerDataCommand implements ICommand {
	
	private static final String COMMAND_NAME="GetPlayerData";

	public GetPlayerDataCommand() {
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
	
		return "Displays your EXP points (not level) and RNG seed";
	}
	/**
	 * Gets the list of aliases for this command.
	 * Other upper and lowercase variants of GetPlayerData
	 */
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
	/**
	 * Processes the command.
	 * Displays the EXP points (not levels) and RNG seed of the player
	 */
	@Override
	public void processCommand(ICommandSender var1, String[] var2) {
	
		if(var1 instanceof EntityPlayer)
		{
			EntityPlayer player=(EntityPlayer)var1;
			player.addChatMessage(new ChatComponentText("Exp points: " + player.experienceTotal+"\n"));
			player.addChatMessage(new ChatComponentText("RNG seed: " + player.getRNG().toString()+"\n"));
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
