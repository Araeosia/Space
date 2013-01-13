package com.araeosia.space;

import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class Space extends JavaPlugin {

	public Logger logger = getLogger();

	@Override
	public void onEnable(){
		logger.info("Enabling SPACCEEEEEE...");
		getServer().getPluginManager().registerEvents(new SpaceListener(), this);
	}
	@Override
	public void onDisable(){
		logger.info("Disabling Space.");
	}
	public ChunkGenerator getDefaultWorldGenerator(String worldName, String id){
		return new SpaceGenerator();
	}
}
