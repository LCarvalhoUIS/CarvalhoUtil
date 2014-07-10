package com.carvalho.util.networking;

import io.netty.buffer.ByteBufOutputStream;
import io.netty.buffer.Unpooled;

import java.io.IOException;

import scala.reflect.internal.Trees.This;

import com.carvalho.util.CarvUtil;

import cpw.mods.fml.common.network.internal.FMLProxyPacket;

public class CreatePacketClientSide {
	
	public CreatePacketClientSide()
	{
		//Placeholder
	}
	
	//Client-Server packet generation
	
	public static FMLProxyPacket createClientToServerTestPacket(int parTestValue) throws IOException
	{
		ByteBufOutputStream bbos=new ByteBufOutputStream(Unpooled.buffer());
		
		
		FMLProxyPacket packet=new FMLProxyPacket(bbos.buffer(),CarvUtil.networkChannelName);
		bbos.close();
		
		return null;
	}
		
}
