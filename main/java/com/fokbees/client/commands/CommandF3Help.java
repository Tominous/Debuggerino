package com.fokbees.client.commands;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiNewChat;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ScreenShotHelper;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.client.IClientCommand;
import net.minecraftforge.server.command.CommandTreeBase;

public class CommandF3Help extends CommandTreeBase implements IClientCommand {
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "F3-Help";
	}

	@Override
	public String getUsage(ICommandSender sender) {
		// TODO Auto-generated method stub
		return "Display Vanilla F3 Help.";
	}


	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException 
	{
		Minecraft MC = Minecraft.getMinecraft();
		 GuiNewChat guinewchat = MC.ingameGUI.getChatGUI();
         guinewchat.printChatMessage(new TextComponentTranslation("debug.reload_chunks.help", new Object[0]));
         guinewchat.printChatMessage(new TextComponentTranslation("debug.show_hitboxes.help", new Object[0]));
         guinewchat.printChatMessage(new TextComponentTranslation("debug.clear_chat.help", new Object[0]));
         guinewchat.printChatMessage(new TextComponentTranslation("debug.cycle_renderdistance.help", new Object[0]));
         guinewchat.printChatMessage(new TextComponentTranslation("debug.chunk_boundaries.help", new Object[0]));
         guinewchat.printChatMessage(new TextComponentTranslation("debug.advanced_tooltips.help", new Object[0]));
         guinewchat.printChatMessage(new TextComponentTranslation("debug.creative_spectator.help", new Object[0]));
         guinewchat.printChatMessage(new TextComponentTranslation("debug.pause_focus.help", new Object[0]));
         guinewchat.printChatMessage(new TextComponentTranslation("debug.help.help", new Object[0]));
         guinewchat.printChatMessage(new TextComponentTranslation("debug.reload_resourcepacks.help", new Object[0]));
        
	}
	
	@Override
	public boolean allowUsageWithoutPrefix(ICommandSender sender, String message) {
		// TODO Auto-generated method stub
		return false;
	}
	
}

