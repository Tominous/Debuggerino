package com.fokbees.client;

import com.fokbees.client.commands.CommandChunks;
import com.fokbees.client.commands.CommandClearChat;
import com.fokbees.client.commands.CommandFullScreen;
import com.fokbees.client.commands.CommandHitboxes;
import com.fokbees.client.commands.CommandReloadResources;
import com.fokbees.client.commands.CommandScreenshot;
import com.fokbees.client.commands.CommandTooltips;

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
	}
}