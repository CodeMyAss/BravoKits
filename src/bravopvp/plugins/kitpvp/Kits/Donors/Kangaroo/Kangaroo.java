package bravopvp.plugins.kitpvp.Kits.Donors.Kangaroo;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import bravopvp.plugins.kitpvp.Utils.GiveKit;

public class Kangaroo implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command cmd, String labe, String[] args) {
		Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("kangaroo")) {
			GiveKit.KangarooKIT(p);
		}
		return false;
	}

}



