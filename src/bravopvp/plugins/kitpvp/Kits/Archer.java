package bravopvp.plugins.kitpvp.Kits;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import bravopvp.plugins.kitpvp.Utils.GiveKit;

public class Archer implements CommandExecutor {


	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel,String[] args) {
		Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("archer")) {
			GiveKit.ArcherKIT(p);
		}
		return false;
	}


}
