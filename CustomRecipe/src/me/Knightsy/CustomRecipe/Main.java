package me.Knightsy.CustomRecipe;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		Bukkit.addRecipe(Recipe());
	}
	
	@Override
	public void onDisable() {
		
	}
	
	private ShapedRecipe Recipe() {
		
		ItemStack item = new ItemStack(Material.NETHER_STAR);
		
		NamespacedKey key = new NamespacedKey(this, "nether_star");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" T ", "TET", " T ");
		
		recipe.setIngredient('T', Material.GHAST_TEAR);
		recipe.setIngredient('E', Material.EMERALD_BLOCK);
		
		return recipe;
	}
	
	
}
