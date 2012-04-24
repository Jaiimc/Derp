package com.github.Jaiimc.Derp;

import org.bukkit.plugin.java.JavaPlugin;

public class Derp extends JavaPlugin {

private DerpCommandExecutor myExecutor;

public void onEnable(){
	getLogger().info("Derp has been enabled!");
	getCommand("derp").setExecutor(myExecutor);
}
public void onDisable(){
	getLogger().info("Derp has been disabled!");
}
}