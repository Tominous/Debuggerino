package com.fokbees.init;

import com.fokbees.client.commands.CommandChunkBoundaries;
import com.fokbees.client.commands.CommandChunks;
import com.fokbees.client.commands.CommandClearChat;
import com.fokbees.client.commands.CommandCloseMinecraft;
import com.fokbees.client.commands.CommandCurrentCoords;
import com.fokbees.client.commands.CommandF3Help;
import com.fokbees.client.commands.CommandFullScreen;
import com.fokbees.client.commands.CommandHitboxes;
import com.fokbees.client.commands.CommandReloadResources;
import com.fokbees.client.commands.CommandScreenshot;
import com.fokbees.client.commands.CommandTooltips;
import com.fokbees.common.commands.CommandDay;
import com.fokbees.common.commands.CommandNight;

import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.command.CommandHandler;
import net.minecraft.command.CommandParticle;
import net.minecraft.command.CommandPlaySound;
import net.minecraft.command.server.CommandSetBlock;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

public class CommandReg {

	public static void client() {
		ClientCommandHandler.instance.registerCommand(new CommandScreenshot());
		ClientCommandHandler.instance.registerCommand(new CommandReloadResources());
		ClientCommandHandler.instance.registerCommand(new CommandFullScreen());
		ClientCommandHandler.instance.registerCommand(new CommandTooltips());
		ClientCommandHandler.instance.registerCommand(new CommandClearChat());
		ClientCommandHandler.instance.registerCommand(new CommandHitboxes());
		ClientCommandHandler.instance.registerCommand(new CommandChunks());
		ClientCommandHandler.instance.registerCommand(new CommandF3Help());
		ClientCommandHandler.instance.registerCommand(new CommandCloseMinecraft());
		ClientCommandHandler.instance.registerCommand(new CommandChunkBoundaries());
		ClientCommandHandler.instance.registerCommand(new CommandCurrentCoords());
	} 
	
	
	public static void common(FMLServerStartingEvent e) {
		e.registerServerCommand(new CommandDay());
		e.registerServerCommand(new CommandNight());
	} 
	
}