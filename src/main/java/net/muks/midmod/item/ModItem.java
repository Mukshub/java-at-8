package net.muks.midmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.muks.midmod.MID;


public class ModItem {
    public static final Item BEANS = registerItem("beans",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD)));
    public static final FoodComponent BENS = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MID.MOD_ID, name), item);

    }
    public static void registerModItems() {
        MID.LOGGER.info("Registering Mod items for " + MID.MOD_ID);
    }
}
