# UncraftableShulkers

A very simple plugin that allows players and auto crafters to "uncraft" shulker boxes into 2 shulker shells and drops any contents they have. 

 - Crafting any color of shulker box by itself in a crafting grid will result in 2 shulker shells 
   - The chest is lost 
 - Any items inside of the shulker box will be dropped 
 - Players and auto crafters can can do the recipe and both will drop the contents of the shulker box

> [!WARNING]
> **Could not drop item from shulker box, location is null**  
> If you see this in your console after uncrafting a shulker box with items in it and the shulker box *didn't* drop it's item, then whatever method you used to uncraft the shulker box didn't provide a location to the craft event! 
