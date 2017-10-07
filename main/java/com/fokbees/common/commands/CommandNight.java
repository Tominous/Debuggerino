package com.fokbees.common.commands;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandException;
import net.minecraft.command.CommandResultStats;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.server.command.CommandTreeBase;

public class CommandNight extends CommandTreeBase {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "night";
	}

	@Override
	public String getUsage(ICommandSender sender) {
		// TODO Auto-generated method stub
		return "Sets time to night.";
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException 
	{	
		 setAllWorldTimes(server, 13000);
	}
	
	  protected void setAllWorldTimes(MinecraftServer server, int time)
	    {
	        for (int i = 0; i < server.worlds.length; ++i)
	        {
	            server.worlds[i].setWorldTime((long)time);
	        }
	    }
	
}
