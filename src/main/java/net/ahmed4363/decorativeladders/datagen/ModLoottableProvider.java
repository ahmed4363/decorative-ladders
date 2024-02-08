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
        //Birch
                addDrop(ModBlocks.BIRCH_PLANK_LADDER);
                addDrop(ModBlocks.BIRCH_LOG_LADDER);
                addDrop(ModBlocks.STRIPPED_BIRCH_LOG_LADDER);
                //Dark Oak
                addDrop(ModBlocks.DARK_OAK_PLANK_LADDER);
                addDrop(ModBlocks.DARK_OAK_LOG_LADDER);
                addDrop(ModBlocks.STRIPPED_DARK_OAK_LOG_LADDER);
                //Acacia
                addDrop(ModBlocks.ACACIA_PLANK_LADDER);
                addDrop(ModBlocks.ACACIA_LOG_LADDER);
                addDrop(ModBlocks.STRIPPED_ACACIA_LOG_LADDER);
                //Jungle
                addDrop(ModBlocks.JUNGLE_PLANK_LADDER);
                addDrop(ModBlocks.JUNGLE_LOG_LADDER);
                addDrop(ModBlocks.STRIPPED_JUNGLE_LOG_LADDER);
                //Mangrove
                addDrop(ModBlocks.MANGROVE_PLANK_LADDER);
                addDrop(ModBlocks.MANGROVE_LOG_LADDER);
                addDrop(ModBlocks.STRIPPED_MANGROVE_LOG_LADDER);
                //Cherry
                addDrop(ModBlocks.CHERRY_PLANK_LADDER);
                addDrop(ModBlocks.CHERRY_LOG_LADDER);
                addDrop(ModBlocks.STRIPPED_CHERRY_LOG_LADDER);
                //Bamboo
                addDrop(ModBlocks.BAMBOO_PLANK_LADDER);
                addDrop(ModBlocks.BAMBOO_LOG_LADDER);
                addDrop(ModBlocks.STRIPPED_BAMBOO_LOG_LADDER);
                //Crimson
                addDrop(ModBlocks.CRIMSON_PLANK_LADDER);
                addDrop(ModBlocks.CRIMSON_LOG_LADDER);
                addDrop(ModBlocks.STRIPPED_CRIMSON_LOG_LADDER);
                //Warped
                addDrop(ModBlocks.WARPED_PLANK_LADDER);
                addDrop(ModBlocks.WARPED_LOG_LADDER);
                addDrop(ModBlocks.STRIPPED_WARPED_LOG_LADDER);

    }
}
