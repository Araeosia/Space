package com.araeosia.space;

import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;

import java.util.Random;

public class SpaceGenerator extends ChunkGenerator {
	public byte[][] generateBlockSections(World world, Random random, int chunkX, int chunkZ, BiomeGrid biomeGrid){
		byte[][] result = new byte[world.getMaxHeight() / 16][];
		return result;
	}
	public void setBlock(byte[][] result, int x, int y, int z, byte blkid) {
		if (result[y >> 4] == null) //is this chunkpart already initialised?
		{
			result[y >> 4] = new byte[4096]; //initialise the chunk part
		}
		result[y >> 4][((y & 0xF) << 8) | (z << 4) | x] = blkid; //set the block (look above, how this is done)
	}
}