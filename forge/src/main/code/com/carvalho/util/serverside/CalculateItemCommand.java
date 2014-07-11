package com.carvalho.util.serverside;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;

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
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getCommandName() {
		// TODO Auto-generated method stub
		return COMMAND_NAME;
	}

	@Override
	public String getCommandUsage(ICommandSender var1) {
		// TODO Auto-generated method stub
		return "Calculates item saturation";
	}

	@Override
	public List getCommandAliases() {
		List<String> aliases=new ArrayList<String>();
		aliases.add("Itemcalc");
		aliases.add("itemCalc");
		aliases.add("itemcalc");
		return aliases;
	}

	@Override
	public void processCommand(ICommandSender var1, String[] var2) {
	
		MinecraftServer server=MinecraftServer.getServer();
			
		//	System.out.println("This user has this many exp points- " .get(1).experience);
	}

	@Override
	public boolean canCommandSenderUseCommand(ICommandSender var1) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public List addTabCompletionOptions(ICommandSender var1, String[] var2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isUsernameIndex(String[] var1, int var2) {
		// TODO Auto-generated method stub
		return false;
	}

}
