package net.ahmed4363.decorativeladders.datagen;

import net.ahmed4363.decorativeladders.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLoottableProvider extends FabricBlockLootTableProvider {
    public ModLoottableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        //Oak
        addDrop(ModBlocks.OAK_LOG_LADDER);
        addDrop(ModBlocks.STRIPPED_OAK_LOG_LADDER);
        addDrop(ModBlocks.OAK_PLANK_LADDER);
        //Spruce
        addDrop(ModBlocks.SPRUCE_PLANK_LADDER);
        addDrop(ModBlocks.STRIPPED_SPRUCE_LOG_LADDER);
        addDrop(ModBlocks.SPRUCE_LOG_LADDER);

    }
}
