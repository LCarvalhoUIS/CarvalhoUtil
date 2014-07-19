/** Carvalho Util
 * @author Lucas Carvalho
 * @version 1.2
 * 
 */
package com.carvalho.util.networking;

import io.netty.buffer.ByteBufOutputStream;
import io.netty.buffer.Unpooled;

import java.io.IOException;

import com.carvalho.util.CarvUtil;

import cpw.mods.fml.common.network.internal.FMLProxyPacket;
/**
 * Generates the packet on the client side.
 *
 */
public class CreatePacketClientSide {
	
	/**
	 * Placeholder default constructor
	 */
	public CreatePacketClientSide()
	{
		//Placeholder
	}
	
	//Client-Server packet generation
	/**
	 * Prepares the packet.
	 * @param parTestValue
	 * @return packet The finished packet
	 * @throws IOException
	 */
	public static FMLProxyPacket createClientToServerTestPacket(int parTestValue) throws IOException
	{
		ByteBufOutputStream bbos=new ByteBufOutputStream(Unpooled.buffer());
		
		
		FMLProxyPacket packet=new FMLProxyPacket(bbos.buffer(),CarvUtil.networkChannelName);
		
		//Avoids memory leak
		bbos.close();
		
		return packet;
	}
		
}
