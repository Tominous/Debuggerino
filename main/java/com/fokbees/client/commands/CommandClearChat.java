package com.fokbees.client.commands;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ScreenShotHelper;
import net.minecraftforge.client.IClientCommand;
import net.minecraftforge.server.command.CommandTreeBase;

public class CommandClearChat extends CommandTreeBase implements IClientCommand {
	
	@Override
	public String getName() {
		return "clear-chat";
	}

	@Override
	public String getUsage(ICommandSender sender) {
		return "Used to clear chat.";
	}


	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException 
	{
		Minecraft MC = Minecraft.getMinecraft();
		if (MC.ingameGUI != null)
        {
            MC.ingameGUI.getChatGUI().clearChatMessages(false);
        }
	}
	
	@Override
	public boolean allowUsageWithoutPrefix(ICommandSender sender, String message) {
		return false;
	}
	
}

