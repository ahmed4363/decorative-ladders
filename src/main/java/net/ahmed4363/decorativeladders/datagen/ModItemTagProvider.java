package net.ahmed4363.decorativeladders.datagen;

import net.ahmed4363.decorativeladders.block.ModBlocks;
import net.ahmed4363.decorativeladders.tags.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Items.LADDERS)
                //Oak
                .add(ModBlocks.OAK_PLANK_LADDER.asItem())
                .add(ModBlocks.OAK_LOG_LADDER.asItem())
                .add(ModBlocks.STRIPPED_OAK_LOG_LADDER.asItem())
                //Spruce
                .add(ModBlocks.SPRUCE_PLANK_LADDER.asItem())
                .add(ModBlocks.SPRUCE_LOG_LADDER.asItem())
                .add(ModBlocks.STRIPPED_SPRUCE_LOG_LADDER.asItem());
    }
}
