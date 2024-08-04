package mov.naspen.uncraftableShulkers.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.inventory.CraftingRecipe;

public class CraftItemEventListener implements Listener {
    @EventHandler
    public void onCraftItemEvent(CraftItemEvent event) {
        //if key matches
        if(event.getRecipe() instanceof CraftingRecipe recipe) {
            if(recipe.getKey().getKey().equals("shulker_box_to_shells")) {
                //Pass the inventor of the crafting matrix to the emptyShulkerOnCraft method
                CraftEventHandler.emptyShulkerOnCraft(event.getInventory());
            }
        }
    }
}
