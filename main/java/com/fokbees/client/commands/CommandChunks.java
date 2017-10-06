package com.fokbees.client.commands;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ScreenShotHelper;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.client.IClientCommand;
import net.minecraftforge.server.command.CommandTreeBase;

public class CommandChunks extends CommandTreeBase implements IClientCommand {
	
	@Override
	public String getName() {
		return "reload-chunks";
	}

	@Override
	public String getUsage(ICommandSender sender) {
		return "Reloads chunks";
	}


	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException 
	{
		Minecraft MC = Minecraft.getMinecraft();
		MC.renderGlobal.loadRenderers();
		sender.sendMessage(new TextComponentTranslation("debug.reload_chunks.message"));
	}
	
	@Override
	public boolean allowUsageWithoutPrefix(ICommandSender sender, String message) {
		return false;
	}
	
}

