/** Carvalho Util
 * @author Lucas Carvalho
 * @version 1.2
 * 
 */
package com.carvalho.util.networking;

import java.io.IOException;

import com.carvalho.util.CarvUtil;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.network.FMLNetworkEvent.ClientCustomPacketEvent;

/**
 * Handles packets for the client side.
 * @author Lucas Carvalho
 *
 */
public class ClientPacketHandler extends ServerPacketHandler {
	
	/**
	 * Processes the packet on the client side.
	 * Checks that the packet channel is for this mod to avoid any conflicts with
	 * other mods
	 * @param event The custom client packet event
	 * @throws IOException
	 */
	@SubscribeEvent
	public void onClientPakcet(ClientCustomPacketEvent event) throws IOException
	{
		channelName = event.packet.channel();
		if(channelName.equals(CarvUtil.networkChannelName))
		{
			ProcessPacketClientSide.processPacketOnClient(event.packet.payload(),event.packet.getTarget());
		}
	}

}
