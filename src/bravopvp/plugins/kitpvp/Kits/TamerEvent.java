package bravopvp.plugins.kitpvp.Kits;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Wolf;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import bravopvp.plugins.kitpvp.BravoKits;
import bravopvp.plugins.kitpvp.Utils.KitArrays;

public class TamerEvent implements Listener {
	
	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		final Player p = e.getPlayer();
		Action a = e.getAction();
		if (a == Action.RIGHT_CLICK_BLOCK || a == Action.RIGHT_CLICK_AIR) {
			if(KitArrays.tamerUsed.contains(p.getName())) {
				if(p.getItemInHand().getType() == Material.BONE) {
					if (KitArrays.tamerWAIT.contains(p.getName())){
                        p.sendMessage(ChatColor.RED + "Wolf spawner is currently on cooldown!");
					}else{
						
						 Location location = p.getEyeLocation();
			             Wolf wolf = (Wolf) p.getWorld().spawnEntity(location, EntityType.WOLF);
			             wolf.setOwner(p);
			             wolf.teleport(p);
			             wolf.setMaxHealth(200.0);
			             wolf.setCustomName(ChatColor.RED + p.getName() + "'s Wolf");
			             wolf.setCustomNameVisible(true);
			             wolf.setAdult();
			             wolf.setCollarColor(DyeColor.CYAN);
			             
			             wolf.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 99999999, 2));
			             
			             Wolf wolf2 = (Wolf) p.getWorld().spawnEntity(location, EntityType.WOLF);
			             wolf2.setOwner(p);
			             wolf2.teleport(p);
			             wolf2.setMaxHealth(200.0);
			             wolf2.setCustomName(ChatColor.RED + p.getName() + "'s Wolf");
			             wolf2.setCustomNameVisible(true);
			             wolf2.setAdult();
			             wolf2.setCollarColor(DyeColor.CYAN);
			             p.sendMessage(ChatColor.RED + "You have now spawned in a wolf!");
			             KitArrays.tamerWAIT.add(p.getName());
                        Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(BravoKits.plugin, new Runnable() {
                            public void run() {
                                    if (KitArrays.tamerWAIT.contains(p.getName())){
                                           KitArrays.tamerWAIT.remove(p.getName());
                                            p.sendMessage(ChatColor.RED + "Wolf spawn is no longer on cooldown");
                                            }
                                    }
                                } ,500L);
					}
				}
			}
		}
	}
}
