package com.fokbees.client.commands;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.debug.DebugRenderer.IDebugRenderer;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ScreenShotHelper;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.client.IClientCommand;
import net.minecraftforge.server.command.CommandTreeBase;

public class CommandTooltips extends CommandTreeBase implements IClientCommand  {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "tooltips";
	}

	@Override
	public String getUsage(ICommandSender sender) {
		// TODO Auto-generated method stub
		return "Toggles tooltops on and off.";
	}


	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException 
	{
		Minecraft MC = Minecraft.getMinecraft();
		MC.gameSettings.advancedItemTooltips = !MC.gameSettings.advancedItemTooltips;
		sender.sendMessage(new TextComponentString("Enabled Tooltips."));
		MC.gameSettings.saveOptions();
	}

	@Override
	public boolean allowUsageWithoutPrefix(ICommandSender sender, String message) {
		// TODO Auto-generated method stub
		return false;
	}

}
