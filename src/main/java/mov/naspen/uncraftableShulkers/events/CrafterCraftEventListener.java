package mov.naspen.uncraftableShulkers.events;

import org.bukkit.block.Crafter;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.CrafterCraftEvent;
import org.bukkit.inventory.CraftingRecipe;

public class CrafterCraftEventListener implements Listener {
    @EventHandler
    public void onCraftItemEvent(CrafterCraftEvent event) {
        if(event.getRecipe() instanceof CraftingRecipe recipe) {
            if(recipe.getKey().getKey().equals("shulker_box_to_shells")) {
                //We know it's a crafter, so get the state of the crafter
                Crafter crafter = (Crafter) event.getBlock().getState();
                //Pass the crafter's inventory to the emptyShulkerOnCraft method
                CraftEventHandler.emptyShulkerOnCraft(crafter.getInventory());
            }
        }
    }
}
