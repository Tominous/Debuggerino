package com.fokbees.client.commands;

import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.server.command.CommandTreeBase;

public class CommandCurrentCoords extends CommandTreeBase {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "current-coords";
	}

	@Override
	public String getUsage(ICommandSender sender) {
		// TODO Auto-generated method stub
		return "Used to tell the player their coordinates";
	}

	
	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException 
	{	
		if(sender instanceof EntityPlayer){
			BlockPos pos = sender.getCommandSenderEntity().getPosition();
			sender.sendMessage(new TextComponentString("Your current postion: " + pos));
		}
	}
	
}
