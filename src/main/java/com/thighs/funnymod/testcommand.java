package com.thighs.funnymod;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;

public class testcommand extends CommandBase{

    static Minecraft mc;

    @Override
    public String getCommandName(){
        return("pepelaugh");
    }

    @Override
    public String getCommandUsage(ICommandSender arg0) {
        return null;
    }

    @Override
    public void processCommand(ICommandSender arg0, String[] arg1) throws CommandException {
        
    
        Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("monkaS"));
        /* 
        final List<EntityPlayer> playerList = Minecraft.getMinecraft().theWorld.playerEntities;
        for(int i=0;i<playerList.size();i++){
            if( playerList.get(i).isInvisible()){
                playerList.get(i).setInvisible(false);
            }
            System.out.println(playerList.get(i).isInvisible());
        }
        */

        /*
        Collection<NetworkPlayerInfo> players = Minecraft.getMinecraft().getNetHandler().getPlayerInfoMap();
        Iterator<NetworkPlayerInfo> i = players.iterator();
        while(i.hasNext()){
            System.out.println(i.next().getGameProfile());
        }
        */


    }


    @Override
    public int getRequiredPermissionLevel(){
        return 0;
    }
}
