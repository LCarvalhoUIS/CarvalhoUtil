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

import net.minecraft.world.World;
import cpw.mods.fml.common.network.internal.FMLProxyPacket;
/**
 * Generates the packet on the server side.
 *
 */
public class CreatePacketServerSide {
	
	/**
	 * Placeholder for the default constructor
	 */
	public CreatePacketServerSide()
	{
		//Placeholder
	}
	
	//Server to Client Packet Generation
	/**
	 * Prepares the packet.
	 * @param parTestValue
	 * @return packet The finished packet
	 * @throws IOException
	 */
	public static FMLProxyPacket createPacket(World world) throws IOException
	{
		ByteBufOutputStream bbos=new ByteBufOutputStream(Unpooled.buffer());
		bbos.writeInt(CarvUtil.PACKET_TYPE_WORLD_SYNC);
		//bbos.writeInt(world);
		
		FMLProxyPacket packet=new FMLProxyPacket(bbos.buffer(),CarvUtil.networkChannelName);
		
		//Avoids memory leak
		bbos.close();
		
		
		return packet;
		
		
		
		
	}
	/**
	 * Sends the packet.
	 * @param packet The packet to be sent
	 */
	public static void sentToAll(FMLProxyPacket packet)
	{
		CarvUtil.channel.sendToAll(packet);
	}
	  /* public static void sendS2CEntitySync(Entity parEntity)
	   {
	      try 
	      {
	         sendToAll(createEntityPacket(parEntity));
	      } 
	      catch (IOException e) 
	      {
	         e.printStackTrace();
	      }
	   }*/


}
