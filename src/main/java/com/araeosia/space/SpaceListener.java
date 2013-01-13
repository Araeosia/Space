package com.araeosia.space;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class SpaceListener implements Listener {

	@EventHandler
	public void onPlayerMove(final PlayerMoveEvent event){
		if(!(event.getFrom().getWorld().getName().equalsIgnoreCase("Main") || event.getFrom().getWorld().getName().equalsIgnoreCase("Space")) || event.getFrom().getY()==event.getTo().getY()){
			return; // If it's not involving vertical motion in Main or Space, we don't care.
		}
		if(event.getFrom().getWorld().getName().equalsIgnoreCase("Main")){
			if(event.getTo().getY()>253){

			}
		}else{
			if(event.getFrom().getY()<1){

			}
		}
	}
}
