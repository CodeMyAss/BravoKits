package bravopvp.plugins.kitpvp.Kits.Donors.Ghost;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import bravopvp.plugins.kitpvp.Utils.GiveKit;

public class Ghost implements CommandExecutor{
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("ghost")) {
			GiveKit.GhostKIT(p);
		}
		return false;
		
	}
}


	
