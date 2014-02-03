package bravopvp.plugins.kitpvp.Kits.Donors.Hulk;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import bravopvp.plugins.kitpvp.Utils.KitArrays;

public class HulkEVENT implements Listener {
	
	@EventHandler
	public void onKill(PlayerDeathEvent event) {
		if (event.getEntity().getLastDamageCause() == null||event.getEntity().getKiller() == null) {
            return;
          }

          Player killer = event.getEntity().getKiller();  
          if(KitArrays.hulkUsed.contains(killer.getName())) {
        	  EntityDamageEvent.DamageCause cause = event.getEntity().getLastDamageCause().getCause();
              if ((cause == EntityDamageEvent.DamageCause.ENTITY_ATTACK || cause == EntityDamageEvent.DamageCause.PROJECTILE)){
                  killer.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 300, 2));
                  killer.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 300, 2));
              }
          }
	}
}