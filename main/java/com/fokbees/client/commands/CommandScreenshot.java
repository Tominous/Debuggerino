package com.fokbees.client.commands;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ScreenShotHelper;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.client.IClientCommand;
import net.minecraftforge.server.command.CommandTreeBase;

public class CommandScreenshot extends CommandTreeBase implements IClientCommand {
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "screenshot";
	}

	@Override
	public String getUsage(ICommandSender sender) {
		// TODO Auto-generated method stub
		return "Used to save a screenshot without the use of: "+ Minecraft.getMinecraft().gameSettings.keyBindScreenshot;
	}


	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException 
	{
		Minecraft MC = Minecraft.getMinecraft();
		ScreenShotHelper.saveScreenshot(MC.mcDataDir, MC.displayWidth, MC.displayHeight, MC.getFramebuffer());
	}
	
	@Override
	public boolean allowUsageWithoutPrefix(ICommandSender sender, String message) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
