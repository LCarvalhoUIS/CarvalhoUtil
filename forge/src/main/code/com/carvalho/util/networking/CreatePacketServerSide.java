package com.carvalho.util.networking;

import io.netty.buffer.ByteBufOutputStream;
import io.netty.buffer.Unpooled;

import java.io.IOException;

import com.carvalho.util.CarvUtil;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import cpw.mods.fml.common.network.internal.FMLProxyPacket;

public class CreatePacketServerSide {
	
	
	public CreatePacketServerSide()
	{
		//Placeholder
	}
	
	//Server to Client Packet Generation
	
	public static FMLProxyPacket createEntityPacket(Entity parEntity) throws IOException
	{
		ByteBufOutputStream bbos=new ByteBufOutputStream(Unpooled.buffer());
		
		
		FMLProxyPacket packet=new FMLProxyPacket(bbos.buffer(),CarvUtil.networkChannelName);
		
		bbos.close();
		return null;
		
		
		
		
	}
	
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
