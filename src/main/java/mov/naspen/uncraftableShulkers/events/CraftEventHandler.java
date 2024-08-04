package mov.naspen.uncraftableShulkers.events;

import org.bukkit.Tag;
import org.bukkit.block.ShulkerBox;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BlockStateMeta;

import static mov.naspen.uncraftableShulkers.UncraftableShulkers.plugin;

public class CraftEventHandler {
    public static void emptyShulkerOnCraft(Inventory inventory){
        //get the shulker box item stack from the event.getInventory()
        //remove the shulker box item stack from the event.getInventory()
        for(ItemStack item : inventory) {
            //Using the Shulker Boxes tag to test the item in the crafting matrix
            if(item != null && Tag.SHULKER_BOXES.isTagged(item.getType())) {
                //testing and getting the blockstate meta
                if(item.getItemMeta() != null && item.getItemMeta() instanceof BlockStateMeta blockStateMeta) {
                    if(blockStateMeta.getBlockState() instanceof ShulkerBox shulkerBox) {
                        //For each item stack in the shulker box, drop its contents at the location of the inventory
                        for(ItemStack content : shulkerBox.getInventory().getContents()) {
                            if(content != null) {
                                if(inventory.getLocation() != null) {
                                    inventory.getLocation().getWorld().dropItemNaturally(inventory.getLocation(), content);
                                }else{
                                    plugin.getLogger().warning("Could not drop item from shulker box, location is null");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
