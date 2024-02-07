package net.ahmed4363.decorativeladders;

import net.ahmed4363.decorativeladders.block.ModBlocks;
import net.ahmed4363.decorativeladders.item.ItemGroups.ModItemGroups;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DecorativeLadders implements ModInitializer {
	public static final String MOD_ID = "decorative-ladders";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModBlocks.RegisterModBlocks();
		ModItemGroups.RegisterItemGroups();
	}
}