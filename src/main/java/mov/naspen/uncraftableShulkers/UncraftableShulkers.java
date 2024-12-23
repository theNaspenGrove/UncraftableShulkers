package mov.naspen.uncraftableShulkers;

import mov.naspen.uncraftableShulkers.events.CraftItemEventListener;
import mov.naspen.uncraftableShulkers.events.CrafterCraftEventListener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import static mov.naspen.uncraftableShulkers.utils.RecipeManager.addShapelessBundleRecipe;
import static mov.naspen.uncraftableShulkers.utils.RecipeManager.addShapelessShulkerRecipe;

public final class UncraftableShulkers extends JavaPlugin {

    public static Plugin plugin;

    @Override
    public void onEnable() {
        plugin = this;
        // Plugin startup logic
        addShapelessShulkerRecipe(this);
        addShapelessBundleRecipe(this);
        getServer().getPluginManager().registerEvents(new CraftItemEventListener(), this);
        getServer().getPluginManager().registerEvents(new CrafterCraftEventListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
