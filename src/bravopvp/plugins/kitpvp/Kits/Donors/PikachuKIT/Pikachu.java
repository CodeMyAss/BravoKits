package bravopvp.plugins.kitpvp.Kits.Donors.PikachuKIT;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import bravopvp.plugins.kitpvp.Utils.GiveKit;

public class Pikachu implements CommandExecutor {
	

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel,String[] args) {
		Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("pikachu")) {
			GiveKit.PikachuKIT(p);
		}
		return false;
	}


}



