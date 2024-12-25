package net.ahmed4363.decorativeladders;

import net.ahmed4363.decorativeladders.datagen.BlockTagDataGen;
import net.ahmed4363.decorativeladders.datagen.LootDataGen;
import net.ahmed4363.decorativeladders.datagen.RecipeDataGen;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DecorativeLaddersDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(RecipeDataGen.RecipeProvider::new);
		pack.addProvider(BlockTagDataGen::new);
		pack.addProvider(LootDataGen::new);
	}
}
