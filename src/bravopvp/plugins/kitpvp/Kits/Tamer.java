package bravopvp.plugins.kitpvp.Kits;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import bravopvp.plugins.kitpvp.Utils.GiveKit;

public class Tamer implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String label,String[] args) {
		Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("tamer")) {
			GiveKit.TamerKit(p);
		}
		return false;
		
	}
}