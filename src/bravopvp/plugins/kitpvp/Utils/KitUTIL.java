package bravopvp.plugins.kitpvp.Utils;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class KitUTIL {
	
	public static void KangarooARMOR(Player p) {
		PlayerInventory inv = p.getInventory();
		 //chest
        ItemStack helm = new ItemStack(Material.IRON_HELMET);
        
        //chest
        ItemStack chest = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta chestMeta = chest.getItemMeta();
        ((LeatherArmorMeta)chestMeta).setColor(Color.TEAL);
	        chest.setItemMeta(chestMeta);
        
        //legs
        ItemStack legs = new ItemStack(Material.IRON_LEGGINGS);
       
        //boots
        ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
        ItemMeta bootMeta = boots.getItemMeta();
        ((LeatherArmorMeta)bootMeta).setColor(Color.TEAL);
	    boots.setItemMeta(bootMeta);
	    ((PlayerInventory) inv).setHelmet(helm);
	    ((PlayerInventory)inv).setChestplate(chest);
	    ((PlayerInventory)inv).setLeggings(legs);
	    ((PlayerInventory)inv).setBoots(boots);
	}
	
	public static void TamerARMOR(Player p) {
		PlayerInventory inv = p.getInventory();
		
		 ItemStack helm = new ItemStack(Material.DIAMOND_HELMET);
         
         //chest
         ItemStack chest = new ItemStack(Material.LEATHER_CHESTPLATE);
         ItemMeta chestMeta = chest.getItemMeta();
         ((LeatherArmorMeta)chestMeta).setColor(Color.WHITE);
	        chest.setItemMeta(chestMeta);
	        chest.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
         
         //legs
         ItemStack legs = new ItemStack(Material.LEATHER_LEGGINGS);
         ItemMeta legsMeta = legs.getItemMeta();
         ((LeatherArmorMeta)legsMeta).setColor(Color.BLACK);
	         legs.setItemMeta(legsMeta);
	         chest.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
         
         //boots
         ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS);
	        

	        ((PlayerInventory) inv).setHelmet(helm);
	        ((PlayerInventory)inv).setChestplate(chest);
	        ((PlayerInventory)inv).setLeggings(legs);
	        ((PlayerInventory)inv).setBoots(boots);
	        
	}

	
	public static void PvPARMOR(Player p) {
		PlayerInventory inv = p.getInventory();
        //ARMOR
        ItemStack helm = new ItemStack(Material.IRON_HELMET);
        ItemStack chest = new ItemStack(Material.IRON_CHESTPLATE);
        ItemStack legs = new ItemStack(Material.IRON_LEGGINGS);
        ItemStack boots = new ItemStack(Material.IRON_BOOTS);
        
        ((PlayerInventory) inv).setHelmet(helm);
        ((PlayerInventory)inv).setChestplate(chest);
        ((PlayerInventory)inv).setLeggings(legs);
        ((PlayerInventory)inv).setBoots(boots);
	}
	
	
	public static void NinjaARMOR(Player p) {
		PlayerInventory inv = p.getInventory();
		
		 ItemStack helm = new ItemStack(Material.JACK_O_LANTERN);
         
         //chest
         ItemStack chest = new ItemStack(Material.LEATHER_CHESTPLATE);
         ItemMeta chestMeta = chest.getItemMeta();
         ((LeatherArmorMeta)chestMeta).setColor(Color.BLACK);
	        chest.setItemMeta(chestMeta);
         
         //legs
         ItemStack legs = new ItemStack(Material.LEATHER_LEGGINGS);
         ItemMeta legsMeta = legs.getItemMeta();
         ((LeatherArmorMeta)legsMeta).setColor(Color.BLACK);
	         legs.setItemMeta(legsMeta);
         
         //boots
         ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
         ItemMeta bootMeta = boots.getItemMeta();
         ((LeatherArmorMeta)bootMeta).setColor(Color.BLACK);
	        boots.setItemMeta(bootMeta);
	        

	        ((PlayerInventory) inv).setHelmet(helm);
	        ((PlayerInventory)inv).setChestplate(chest);
	        ((PlayerInventory)inv).setLeggings(legs);
	        ((PlayerInventory)inv).setBoots(boots);
	        
	}


	public static void HulkARMOR(Player p) {
		PlayerInventory inv = p.getInventory();
		
		 ItemStack helm = new ItemStack(Material.DIAMOND_HELMET);
         
         //chest
         ItemStack chest = new ItemStack(Material.LEATHER_CHESTPLATE);
         ItemMeta chestMeta = chest.getItemMeta();
         ((LeatherArmorMeta)chestMeta).setColor(Color.GREEN);
	        chest.setItemMeta(chestMeta);
         
	        chest.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
         //legs
         ItemStack legs = new ItemStack(Material.LEATHER_LEGGINGS);
         ItemMeta legsMeta = legs.getItemMeta();
         ((LeatherArmorMeta)legsMeta).setColor(Color.GREEN);
	         legs.setItemMeta(legsMeta);
	         chest.addEnchantment(Enchantment.THORNS, 2);
         
         //boots
         ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
         ItemMeta bootMeta = boots.getItemMeta();
         ((LeatherArmorMeta)bootMeta).setColor(Color.GREEN);
	        boots.setItemMeta(bootMeta);
	        

	        ((PlayerInventory) inv).setHelmet(helm);
	        ((PlayerInventory)inv).setChestplate(chest);
	        ((PlayerInventory)inv).setLeggings(legs);
	        ((PlayerInventory)inv).setBoots(boots);
	        
	}
}