package com.github.Jaiimc.Derp;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

public class Derp extends JavaPlugin {
private DerpCommandExecutor myExecutor;	
Logger log = this.getLogger();

public void onEnable(){
	log = this.getLogger();
	log.info("Derp has been enabled!");
	myExecutor = new DerpCommandExecutor(this);
	getCommand("derp").setExecutor(myExecutor);
}
public void onDisable(){
	log.info("Derp has been disabled!");
}
}
