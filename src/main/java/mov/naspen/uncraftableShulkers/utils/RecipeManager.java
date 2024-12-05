package mov.naspen.uncraftableShulkers.utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.Tag;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.Plugin;

import java.util.logging.Level;

public class RecipeManager {

    public static void addShapelessShulkerRecipe(Plugin plugin){
        plugin.getLogger().log(Level.INFO,"Adding Shulker Box to Shells");
        //create a new unique recipeKey
        NamespacedKey key = new NamespacedKey(plugin, "shulker_box_to_shells");
        //creates a new recipe with the default light quantity as the output quantity
        ShapelessRecipe recipe = new ShapelessRecipe(key, new org.bukkit.inventory.ItemStack(Material.SHULKER_SHELL, 2));

        //A recipe choice representing all shulker boxes
        RecipeChoice.MaterialChoice shulkerBoxes = new RecipeChoice.MaterialChoice(Tag.SHULKER_BOXES);

        recipe.addIngredient(shulkerBoxes);

        Bukkit.addRecipe(recipe);
        plugin.getLogger().log(Level.INFO,"Shulker uncrafting recipe added!");
    }
    public static void addShapelessBundleRecipe(Plugin plugin){
        plugin.getLogger().log(Level.INFO,"Adding Bundle Box to Leather");
        //create a new unique recipeKey
        NamespacedKey key = new NamespacedKey(plugin, "bundle_to_leather");
        //creates a new recipe with the default light quantity as the output quantity
        ShapelessRecipe recipe = new ShapelessRecipe(key, new org.bukkit.inventory.ItemStack(Material.LEATHER, 1));

        //A recipe choice representing all shulker boxes
        RecipeChoice.MaterialChoice shulkerBoxes = new RecipeChoice.MaterialChoice(Tag.ITEMS_BUNDLES);

        recipe.addIngredient(shulkerBoxes);

        Bukkit.addRecipe(recipe);
        plugin.getLogger().log(Level.INFO,"Shapeless Light Block recipe added!");
    }
}
