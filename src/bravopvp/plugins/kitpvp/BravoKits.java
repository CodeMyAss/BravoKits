package bravopvp.plugins.kitpvp;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import bravopvp.plugins.kitpvp.Commands.KitCommand;
import bravopvp.plugins.kitpvp.GUI.PVPGUI;
import bravopvp.plugins.kitpvp.Kits.Archer;
import bravopvp.plugins.kitpvp.Kits.PvP;
import bravopvp.plugins.kitpvp.Kits.Tamer;
import bravopvp.plugins.kitpvp.Kits.TamerEvent;
import bravopvp.plugins.kitpvp.Kits.Donors.FishermanKit.Fisherman;
import bravopvp.plugins.kitpvp.Kits.Donors.FishermanKit.FishermanEVENT;
import bravopvp.plugins.kitpvp.Kits.Donors.Ghost.Ghost;
import bravopvp.plugins.kitpvp.Kits.Donors.Ghost.GhostEvent;
import bravopvp.plugins.kitpvp.Kits.Donors.Hulk.Hulk;
import bravopvp.plugins.kitpvp.Kits.Donors.Hulk.HulkEVENT;
import bravopvp.plugins.kitpvp.Kits.Donors.Kangaroo.Kangaroo;
import bravopvp.plugins.kitpvp.Kits.Donors.Kangaroo.KangarooEVENT;
import bravopvp.plugins.kitpvp.Kits.Donors.Ninja.Ninja;
import bravopvp.plugins.kitpvp.Kits.Donors.Ninja.NinjaEVENT;
import bravopvp.plugins.kitpvp.Kits.Donors.PikachuKIT.Pikachu;
import bravopvp.plugins.kitpvp.Kits.Donors.PikachuKIT.PikachuEVENT;
import bravopvp.plugins.kitpvp.Utils.DeathEvent;

public class BravoKits extends JavaPlugin {
	public static Plugin plugin;
	
	public void onEnable() {
		plugin = this;
	    PluginManager pm = Bukkit.getServer().getPluginManager();
	   
		//LISTENERS

		pm.registerEvents(new DeathEvent(), this);
		pm.registerEvents(new PikachuEVENT(), this);
		pm.registerEvents(new FishermanEVENT(), this);
		pm.registerEvents(new KangarooEVENT(), this);
		pm.registerEvents(new GhostEvent(), this);
		pm.registerEvents(new NinjaEVENT(), this);
		pm.registerEvents(new TamerEvent(), this);
		pm.registerEvents(new HulkEVENT(), this);
		
		
		
		//GUIS
		pm.registerEvents(new PVPGUI(), this);
		
		//KITS
		getCommand("pvp").setExecutor(new PvP());
		getCommand("archer").setExecutor(new Archer());
		getCommand("tamer").setExecutor(new Tamer());
		getCommand("lol").setExecutor(new stimpay());

		
		//DONOR KITS
		getCommand("pikachu").setExecutor(new Pikachu());
		getCommand("fisherman").setExecutor(new Fisherman());
		getCommand("kangaroo").setExecutor(new Kangaroo());
		getCommand("ghost").setExecutor(new Ghost());
		getCommand("ninja").setExecutor(new Ninja());
		getCommand("hulk").setExecutor(new Hulk());
		
		
		//MISC
		getCommand("kit").setExecutor(new KitCommand());
	}
	
	
	public void onDisable() {
		
	}

}
