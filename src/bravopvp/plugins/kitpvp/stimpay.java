package bravopvp.plugins.kitpvp;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class stimpay implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("lol")) {
			if(p.hasPermission("bravo.lol")) {
				if(args.length == 0) {
					p.sendMessage(ChatColor.RED + "Not enough arguments! /lol <userName>");
					return true;
				}
				Player t = Bukkit.getServer().getPlayer(args[0]);
				if(t == null) {
					p.sendMessage(ChatColor.RED + "Hes not online!");
					return true;
				}
				Location location = t.getLocation();
	            Sheep sheep = (Sheep) p.getWorld().spawnEntity(location, EntityType.SHEEP);
	            sheep.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 99999999, 50000));
	            sheep.setPassenger(t);
	            sheep.setMaxHealth(900.0);
	            sheep.setAgeLock(true);
	            sheep.setCustomName("Stimpay");
	            sheep.setCustomNameVisible(true);
			}else{
				
			}
			 
		}
		return false;
	}

}
