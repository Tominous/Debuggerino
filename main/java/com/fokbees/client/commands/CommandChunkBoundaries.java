package com.fokbees.client.commands;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ScreenShotHelper;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.client.IClientCommand;
import net.minecraftforge.server.command.CommandTreeBase;

public class CommandChunkBoundaries extends CommandTreeBase implements IClientCommand  {

	@Override
	public String getName() {
		return "chunk-boundaries";
	}

	@Override
	public String getUsage(ICommandSender sender) {
		return "Toggles chunk boundaries on and off.";
	}


	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException 
	{
		  Minecraft MC = Minecraft.getMinecraft();
		  boolean flag = MC.debugRenderer.toggleChunkBorders();
          sender.sendMessage(new TextComponentTranslation(flag ? "debug.chunk_boundaries.on" : "debug.chunk_boundaries.off"));
         
	}

	@Override
	public boolean allowUsageWithoutPrefix(ICommandSender sender, String message) {
		return false;
	}

}
