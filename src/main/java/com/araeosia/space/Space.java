package com.araeosia.space;

import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

public class Space extends JavaPlugin {

	@Override
	public void onEnable(){

	}
	@Override
	public void onDisable(){

	}
	public ChunkGenerator getDefaultWorldGenerator(String worldName, String id){
		return new SpaceGenerator();
	}
}
