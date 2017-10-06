package com.fokbees.client.commands;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ScreenShotHelper;
import net.minecraftforge.client.IClientCommand;
import net.minecraftforge.server.command.CommandTreeBase;

public class CommandHitboxes extends CommandTreeBase implements IClientCommand {
	
	@Override
	public String getName() {
		return "hitboxes";
	}

	@Override
	public String getUsage(ICommandSender sender) {
		return "Used to turn hitboxes on and off.";
	}


	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException 
	{
		Minecraft MC = Minecraft.getMinecraft();
		  boolean flag1 = !MC.getRenderManager().isDebugBoundingBox();
          MC.getRenderManager().setDebugBoundingBox(flag1);
	}
	
	@Override
	public boolean allowUsageWithoutPrefix(ICommandSender sender, String message) {
		return false;
	}
	
}

