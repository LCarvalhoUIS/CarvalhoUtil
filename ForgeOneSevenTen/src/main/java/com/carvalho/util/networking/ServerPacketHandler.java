/** Carvalho Util
 * @author Lucas Carvalho
 * @version 1.2
 * 
 */
package com.carvalho.util.networking;

import java.io.IOException;

import com.carvalho.util.CarvUtil;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.network.FMLNetworkEvent.ServerCustomPacketEvent;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.NetHandlerPlayServer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;

/**
 * Handles packets for the server side.
 * @author Lucas Carvalho
 *
 */
public class ServerPacketHandler {
	
	public String channelName;
	protected EntityPlayerMP thePlayer;
	protected World theworld;
	
	/**
	 * Processes the packet on the server side.
	 * Checks that the packet channel is for this mod to avoid any conflicts with
	 * other mods
	 * @param event The custom server packet event
	 * @throws IOException
	 */
	@SubscribeEvent
	public void onServerPacket(ServerCustomPacketEvent event) throws IOException
	{
		channelName=event.packet.channel();
		
		NetHandlerPlayServer theNetHandlerPlayServer = (NetHandlerPlayServer)event.handler;
		thePlayer=theNetHandlerPlayServer.playerEntity;
		MinecraftServer server=MinecraftServer.getServer();
		
		if(channelName.equals(CarvUtil.networkChannelName))
		{
			ProcessPacketServerSide.ProcessPacketonServer(event.packet.payload(),event.packet.getTarget(),thePlayer);
		}
	}

}
