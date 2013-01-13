package com.araeosia.space;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class SpaceListener implements Listener {

	private Space plugin;

	public SpaceListener(Space plugin){
		this.plugin = plugin;
	}

	@EventHandler
	public void onPlayerMove(final PlayerMoveEvent event){
		if(!(event.getFrom().getWorld().getName().equalsIgnoreCase("Main") || event.getFrom().getWorld().getName().equalsIgnoreCase("Space")) || event.getFrom().getY()==event.getTo().getY()){
			return; // If it's not involving vertical motion in Main or Space, we don't care.
		}
		if(event.getFrom().getWorld().getName().equalsIgnoreCase("Main")){
			if(event.getTo().getY()>253){
				plugin.getServer().getWorld("Space").getBlockAt(event.getTo().getBlockX(), 0, event.getTo().getBlockZ()).setType(Material.GLASS);
				event.getPlayer().teleport(new Location(plugin.getServer().getWorld("Space"), event.getTo().getX(), 2, event.getTo().getZ()));
			}
		}else{
			if(event.getFrom().getY()<1){
				event.getPlayer().teleport(new Location(plugin.getServer().getWorld("Main"), event.getTo().getX(), 253, event.getTo().getZ()));
			}
		}
	}
}
