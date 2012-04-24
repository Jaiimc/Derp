package com.github.Jaiimc.Derp;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DerpCommandExecutor implements CommandExecutor {
private Derp plugin;

public DerpCommandExecutor(Derp plugin) {
	this.plugin = plugin;
}

@Override

public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	Player player = null;
	if (sender instanceof Player) {
		player = (Player) sender;
		
	}
	
	if(cmd.getName().equalsIgnoreCase("Derp")) {
		sender.sendMessage(ChatColor.GREEN + "You're a derp.");
		return true;
	} else if (cmd.getName().equalsIgnoreCase("Derpage")) {
		if (player == null) {
			sender.sendMessage(ChatColor.RED + "Oh shit, you need to be a player.");
		} else {
			sender.sendMessage(ChatColor.GREEN + "You're also a derp.");
		}
		return true;
	}
	return false;
}
}