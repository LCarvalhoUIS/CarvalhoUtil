package com.carvalho.util.serverside;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
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
 * Checks how many of a block within a XYZ range are near you.
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
	
		return "Calculates how many of a block exist near you.";
	}

	@SuppressWarnings("rawtypes")
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
		World world=server.getEntityWorld();
		EntityPlayer player;
		
		@SuppressWarnings("unchecked")
		int itemCounter=0;
		int xRadius=Integer.parseInt(var2[0]);
		int yRadius=Integer.parseInt(var2[1]);
		int zRadius=Integer.parseInt(var2[2]);
		int blockID=Integer.parseInt(var2[3]);
		int playerx;
		int playery;
		int playerz;
		if(var1 instanceof EntityPlayer)
		{
			player=(EntityPlayer) var1;
			playerx=(int) player.posX;
			playery=(int) player.posY;
			playerz=(int) player.posZ;
			
			for(int searchX=playerx-xRadius;searchX<=playerx+xRadius;searchX++)
			{
				for(int searchY=playery-yRadius;searchY<=playery+yRadius;searchY++)
				{
					for(int searchZ=playerz-zRadius;searchZ<=playerz+zRadius;searchZ++)
					{
						if(Block.getIdFromBlock(world.getBlock(searchX,searchY,searchZ))==blockID)
							itemCounter++;
						
					}
					
				}
			}
			player.addChatMessage(new ChatComponentText(itemCounter+" of this block were found in the area"));
			
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
