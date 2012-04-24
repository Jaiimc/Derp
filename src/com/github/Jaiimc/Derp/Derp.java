package com.github.Jaiimc.Derp;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class Derp extends JavaPlugin {

public void onEnable(){
	getLogger().info("Derp has been enabled!");
}
public void onDisable(){
	getLogger().info("Derp has been disabled!");
}

@SuppressWarnings("unused")
private Derp plugin;

public Derp(Derp plugin) {
	this.plugin = plugin;
}

@Override

public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
if ((sender instanceof Player) && (sender.hasPermission("Derp.derp"))) {
((Player)sender).getInventory().addItem(new ItemStack(Material.DIAMOND,64));
return true;
} else {
sender.sendMessage(ChatColor.RED + "You must be a player!");
sender.sendMessage(ChatColor.RED + "You do not have permission to perform this command!");
return false;
}
}
}