package com.fokbees;

import com.fokbees.client.CommandReg;

import net.minecraft.init.Blocks;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = DebugPlus.MODID, version = DebugPlus.VERSION)
public class DebugPlus
{
    public static final String MODID = "debugplus";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	CommandReg.client();
    }
    
}
