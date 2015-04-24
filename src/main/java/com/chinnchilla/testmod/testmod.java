package com.chinnchilla.testmod;

import com.chinnchilla.testmod.proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "testmod", name = "Test Mod", version = "1.7.10-1.0")

public class testmod {

    @Mod.Instance("testmod")
    public static testmod instance;

    @SidedProxy(clientSide = "com.chinnchilla.testmod.proxy.ClientProxy", serverSide = "com.chinnchilla.testmod.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void PreInit(FMLPreInitializationEvent)
    {
        //Network Handling, Config, Blocks, Items
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent)
    {
        //GUI, Tile Entities, Crafting Recipes
    }

    @Mod.EventHandler
    public void PostInit(FMLPostInitializationEvent)
    {
        //Wrap Up, Mod Compat
    }
}


