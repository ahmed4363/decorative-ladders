package net.ahmed4363.decorativeladders.datagen;

import net.ahmed4363.decorativeladders.block.ModBlocks;
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
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                //Oak
                .add(ModBlocks.OAK_PLANK_LADDER)
                .add(ModBlocks.OAK_LOG_LADDER)
                .add(ModBlocks.STRIPPED_OAK_LOG_LADDER)
                //Spruce
                .add(ModBlocks.SPRUCE_PLANK_LADDER)
                .add(ModBlocks.SPRUCE_LOG_LADDER)
                .add(ModBlocks.STRIPPED_SPRUCE_LOG_LADDER);
        getOrCreateTagBuilder(BlockTags.CLIMBABLE)
                //Oak
                .add(ModBlocks.OAK_PLANK_LADDER)
                .add(ModBlocks.OAK_LOG_LADDER)
                .add(ModBlocks.STRIPPED_OAK_LOG_LADDER)
                //Spruce
                .add(ModBlocks.SPRUCE_PLANK_LADDER)
                .add(ModBlocks.SPRUCE_LOG_LADDER)
                .add(ModBlocks.STRIPPED_SPRUCE_LOG_LADDER);
    }
}
