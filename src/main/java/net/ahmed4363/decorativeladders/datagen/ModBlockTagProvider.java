package net.ahmed4363.decorativeladders.datagen;

import net.ahmed4363.decorativeladders.block.ModBlocks;
import net.ahmed4363.decorativeladders.tags.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(ModTags.Blocks.LADDERS)
                //Oak
                        .add(ModBlocks.OAK_PLANK_LADDER)
                        .add(ModBlocks.OAK_LOG_LADDER)
                        .add(ModBlocks.STRIPPED_OAK_LOG_LADDER)
                //Spruce
                        .add(ModBlocks.SPRUCE_PLANK_LADDER)
                        .add(ModBlocks.SPRUCE_LOG_LADDER)
                        .add(ModBlocks.STRIPPED_SPRUCE_LOG_LADDER)
                //Birch
                        .add(ModBlocks.BIRCH_PLANK_LADDER)
                        .add(ModBlocks.BIRCH_LOG_LADDER)
                        .add(ModBlocks.STRIPPED_BIRCH_LOG_LADDER)
                //Dark Oak
                        .add(ModBlocks.DARK_OAK_PLANK_LADDER)
                        .add(ModBlocks.DARK_OAK_LOG_LADDER)
                        .add(ModBlocks.STRIPPED_DARK_OAK_LOG_LADDER)
                //Acacia
                .add(ModBlocks.ACACIA_PLANK_LADDER)
                .add(ModBlocks.ACACIA_LOG_LADDER)
                .add(ModBlocks.STRIPPED_ACACIA_LOG_LADDER)
                //Jungle
                .add(ModBlocks.JUNGLE_PLANK_LADDER)
                .add(ModBlocks.JUNGLE_LOG_LADDER)
                .add(ModBlocks.STRIPPED_JUNGLE_LOG_LADDER)
                //Mangrove
                .add(ModBlocks.MANGROVE_PLANK_LADDER)
                .add(ModBlocks.MANGROVE_LOG_LADDER)
                .add(ModBlocks.STRIPPED_MANGROVE_LOG_LADDER)
                //Cherry
                .add(ModBlocks.CHERRY_PLANK_LADDER)
                .add(ModBlocks.CHERRY_LOG_LADDER)
                .add(ModBlocks.STRIPPED_CHERRY_LOG_LADDER)
                //Bamboo
                .add(ModBlocks.BAMBOO_PLANK_LADDER)
                .add(ModBlocks.BAMBOO_LOG_LADDER)
                .add(ModBlocks.STRIPPED_BAMBOO_LOG_LADDER)
                //Crimson
                .add(ModBlocks.CRIMSON_PLANK_LADDER)
                .add(ModBlocks.CRIMSON_LOG_LADDER)
                .add(ModBlocks.STRIPPED_CRIMSON_LOG_LADDER)
                //Warped
                .add(ModBlocks.WARPED_PLANK_LADDER)
                .add(ModBlocks.WARPED_LOG_LADDER)
                .add(ModBlocks.STRIPPED_WARPED_LOG_LADDER);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .forceAddTag(ModTags.Blocks.LADDERS);

        getOrCreateTagBuilder(BlockTags.CLIMBABLE)
                .forceAddTag(ModTags.Blocks.LADDERS);
    }
}
