package com.carvalho.util.networking;

import java.io.IOException;

import com.carvalho.util.CarvUtil;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.network.FMLNetworkEvent.ClientCustomPacketEvent;

public class ClientPacketHandler extends ServerPacketHandler {
	
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
