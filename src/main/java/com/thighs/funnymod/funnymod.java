package com.thighs.funnymod;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod(
    modid = funnymod.MOD_ID,
    name = funnymod.MOD_NAME,
    version = funnymod.MOD_VERSION,
    clientSideOnly = true
)
public class funnymod {
    public static final String MOD_NAME = "${GRADLE_MOD_NAME}";
    public static final String MOD_ID = "{GRADLE_MOD_ID}";
    public static final String MOD_VERSION = "{GRADLE_MOD_VERSION}";

    @Mod.Instance(funnymod.MOD_ID)
    private static funnymod instance;

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        ClientCommandHandler.instance.registerCommand(new testcommand());

        if(event.getSide()==Side.CLIENT)MinecraftForge.EVENT_BUS.register(this);
    }

    public static funnymod getInstance(){
        return instance;
    }
     
    @SubscribeEvent
    public void renderPlayerPre(RenderPlayerEvent.Pre event){
        GlStateManager.disableDepth();
        //event.entity.setInvisible(false);
    }

    @SubscribeEvent
    public void renderPlayerPost(RenderPlayerEvent.Post event){
        GlStateManager.enableDepth();
        //event.entity.setInvisible(false);
    }
    
}
