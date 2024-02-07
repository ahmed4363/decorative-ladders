package net.ahmed4363.decorativeladders.datagen;

import net.ahmed4363.decorativeladders.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }
    private void ladderRecipe(Block ladder, Block input, Consumer<RecipeJsonProvider> exporter)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ladder, 1)
                .pattern("# #")
                .pattern("###")
                .pattern("# #")
                .input('#', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, new Identifier(getRecipeName(ladder)));
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ladderRecipe(ModBlocks.OAK_PLANK_LADDER, Blocks.OAK_PLANKS, exporter);
        ladderRecipe(ModBlocks.OAK_LOG_LADDER, Blocks.OAK_LOG, exporter);
    }
}
