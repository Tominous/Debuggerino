package com.fokbees.client.commands;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ScreenShotHelper;
import net.minecraftforge.client.IClientCommand;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.server.command.CommandTreeBase;

public class CommandCloseMinecraft extends CommandTreeBase implements IClientCommand {
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "quit";
	}

	@Override
	public String getUsage(ICommandSender sender) {
		// TODO Auto-generated method stub
		return "Close MC";
	}


	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException 
	{
		Minecraft MC = Minecraft.getMinecraft();
		MC.shutdown();
	}
	
	@Override
	public boolean allowUsageWithoutPrefix(ICommandSender sender, String message) {
		// TODO Auto-generated method stub
		return false;
	}
	
}

