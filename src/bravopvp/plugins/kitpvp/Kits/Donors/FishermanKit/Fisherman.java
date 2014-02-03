package bravopvp.plugins.kitpvp.Kits.Donors.FishermanKit;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import bravopvp.plugins.kitpvp.Utils.GiveKit;

public class Fisherman implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command cmd, String labe, String[] args) {
		Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("fisherman")) {
			GiveKit.FishermanKIT(p);
		}
		return false;
	}

}
