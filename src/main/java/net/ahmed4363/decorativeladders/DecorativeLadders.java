package net.ahmed4363.decorativeladders;

import net.ahmed4363.decorativeladders.block.ModBlocks;
import net.fabricmc.api.ModInitializer;

public class DecorativeLadders implements ModInitializer {
	public static final String MOD_ID = "decorative-ladders";

	@Override
	public void onInitialize() {
		ModBlocks.RegisterModBlocks();
	}
}