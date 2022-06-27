package net.muks.midmod;

import net.fabricmc.api.ModInitializer;
import net.muks.midmod.item.ModItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MID implements ModInitializer {
	public static final String MOD_ID = "mid";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItem.registerModItems();
	}
}
