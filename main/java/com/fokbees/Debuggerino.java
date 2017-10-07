package com.fokbees;

import com.fokbees.init.CommandReg;

import net.minecraft.init.Blocks;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = Debuggerino.MODID, version = Debuggerino.VERSION, acceptedMinecraftVersions = "[1.11, 1.13]")
public class Debuggerino
{
    public static final String MODID = "debuggerino";
    public static final String VERSION = "Version 1";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	if(FMLCommonHandler.instance().getSide() == Side.CLIENT){
    		CommandReg.client();
    	}  	
    }
    
    
    @EventHandler
	public void serverStart(FMLServerStartingEvent e) {
    	CommandReg.common(e);
    }
    
}
