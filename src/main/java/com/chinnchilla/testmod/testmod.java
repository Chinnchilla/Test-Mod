package com.chinnchilla.testmod;

import com.chinnchilla.testmod.handler.ConfigurationHandler;
import com.chinnchilla.testmod.reference.Reference;
import com.chinnchilla.testmod.proxy.IProxy;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)

public class testmod {

    @Mod.Instance(Reference.MOD_ID)
    public static testmod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void PreInit(FMLPreInitializationEvent event)
    {
        //Network Handling, Config, Blocks, Items
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {
        //GUI, Tile Entities, Crafting Recipes
    }

    @Mod.EventHandler
    public void PostInit(FMLPostInitializationEvent event)
    {
        //Wrap Up, Mod Compat
    }
}


