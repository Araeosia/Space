package com.araeosia.space.util;

public class Planet {
	private int x;
	private int y;
	private int z;
	private int totalRadius;
	private int coreRadius;
	private int shellMaterial;
	private int coreMaterial;

	public Planet(int coreMaterial, int coreRadius, int shellMaterial, int totalRadius, int x, int y, int z) {
		this.coreMaterial = coreMaterial;
		this.coreRadius = coreRadius;
		this.shellMaterial = shellMaterial;
		this.totalRadius = totalRadius;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}

	public int getTotalRadius() {
		return totalRadius;
	}

	public int getCoreRadius() {
		return coreRadius;
	}

	public int getShellMaterial() {
		return shellMaterial;
	}

	public int getCoreMaterial() {
		return coreMaterial;
	}
	public static Planet load(String s){
		String[] data = s.split("§");
		return new Planet(Integer.parseInt(data[0]), Integer.parseInt(data[1]), Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5]), Integer.parseInt(data[6]));
	}
	public String save(){
		return coreMaterial+"§"+coreRadius+"§"+shellMaterial+"§"+totalRadius+"§"+x+"§"+y+"§"+z;
	}
}
