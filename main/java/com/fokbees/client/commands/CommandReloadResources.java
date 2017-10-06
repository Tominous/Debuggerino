package com.fokbees.client.commands;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.IClientCommand;
import net.minecraftforge.server.command.CommandTreeBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;

public class CommandReloadResources extends CommandTreeBase implements IClientCommand  {

	@Override
	public String getUsage(ICommandSender p_71518_1_) {
		return "/" + getName();
	}

	@Override
	public String getName() {
		return "resource-reload";
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
		Minecraft.getMinecraft().refreshResources();
		sender.sendMessage(new TextComponentTranslation("Reloaded Resources."));
	}

	@Override
	public boolean allowUsageWithoutPrefix(ICommandSender sender, String message) {
		return false;
	}

}