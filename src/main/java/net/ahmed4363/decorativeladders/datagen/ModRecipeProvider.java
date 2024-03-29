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
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ladder, 7)
                .pattern("# #")
                .pattern("###")
                .pattern("# #")
                .input('#', input)
                .criterion(FabricRecipeProvider.hasItem(input), FabricRecipeProvider.conditionsFromItem(ladder))
                .offerTo(exporter, new Identifier(getRecipeName(ladder)));
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        //Oak
        ladderRecipe(ModBlocks.OAK_PLANK_LADDER, Blocks.OAK_PLANKS, exporter);
        ladderRecipe(ModBlocks.OAK_LOG_LADDER, Blocks.OAK_LOG, exporter);
        ladderRecipe(ModBlocks.STRIPPED_OAK_LOG_LADDER, Blocks.STRIPPED_OAK_LOG, exporter);
        //Spruce
        ladderRecipe(ModBlocks.SPRUCE_PLANK_LADDER, Blocks.SPRUCE_PLANKS, exporter);
        ladderRecipe(ModBlocks.SPRUCE_LOG_LADDER, Blocks.SPRUCE_LOG, exporter);
        ladderRecipe(ModBlocks.STRIPPED_SPRUCE_LOG_LADDER, Blocks.STRIPPED_SPRUCE_LOG, exporter);
        //Birch
        ladderRecipe(ModBlocks.BIRCH_PLANK_LADDER, Blocks.BIRCH_PLANKS, exporter);
        ladderRecipe(ModBlocks.BIRCH_LOG_LADDER, Blocks.BIRCH_LOG, exporter);
        ladderRecipe(ModBlocks.STRIPPED_BIRCH_LOG_LADDER, Blocks.STRIPPED_BIRCH_LOG, exporter);
        //Dark Oak
        ladderRecipe(ModBlocks.DARK_OAK_PLANK_LADDER, Blocks.DARK_OAK_PLANKS, exporter);
        ladderRecipe(ModBlocks.DARK_OAK_LOG_LADDER, Blocks.DARK_OAK_LOG, exporter);
        ladderRecipe(ModBlocks.STRIPPED_DARK_OAK_LOG_LADDER, Blocks.STRIPPED_DARK_OAK_LOG, exporter);
        //Acacia
        ladderRecipe(ModBlocks.ACACIA_PLANK_LADDER, Blocks.ACACIA_PLANKS, exporter);
        ladderRecipe(ModBlocks.ACACIA_LOG_LADDER, Blocks.ACACIA_LOG, exporter);
        ladderRecipe(ModBlocks.STRIPPED_ACACIA_LOG_LADDER, Blocks.STRIPPED_ACACIA_LOG, exporter);
        //Jungle
        ladderRecipe(ModBlocks.JUNGLE_PLANK_LADDER, Blocks.JUNGLE_PLANKS, exporter);
        ladderRecipe(ModBlocks.JUNGLE_LOG_LADDER, Blocks.JUNGLE_LOG, exporter);
        ladderRecipe(ModBlocks.STRIPPED_JUNGLE_LOG_LADDER, Blocks.STRIPPED_JUNGLE_LOG, exporter);
        //Mangrove
        ladderRecipe(ModBlocks.MANGROVE_PLANK_LADDER, Blocks.MANGROVE_PLANKS, exporter);
        ladderRecipe(ModBlocks.MANGROVE_LOG_LADDER, Blocks.MANGROVE_LOG, exporter);
        ladderRecipe(ModBlocks.STRIPPED_MANGROVE_LOG_LADDER, Blocks.STRIPPED_MANGROVE_LOG, exporter);
        //Cherry
        ladderRecipe(ModBlocks.CHERRY_PLANK_LADDER, Blocks.CHERRY_PLANKS, exporter);
        ladderRecipe(ModBlocks.CHERRY_LOG_LADDER, Blocks.CHERRY_LOG, exporter);
        ladderRecipe(ModBlocks.STRIPPED_CHERRY_LOG_LADDER, Blocks.STRIPPED_CHERRY_LOG, exporter);
        //Bamboo
        ladderRecipe(ModBlocks.BAMBOO_PLANK_LADDER, Blocks.BAMBOO_PLANKS, exporter);
        ladderRecipe(ModBlocks.BAMBOO_LOG_LADDER, Blocks.BAMBOO_BLOCK, exporter);
        ladderRecipe(ModBlocks.STRIPPED_BAMBOO_LOG_LADDER, Blocks.STRIPPED_BAMBOO_BLOCK, exporter);
        //Crimson
        ladderRecipe(ModBlocks.CRIMSON_PLANK_LADDER, Blocks.CRIMSON_PLANKS, exporter);
        ladderRecipe(ModBlocks.CRIMSON_LOG_LADDER, Blocks.CRIMSON_STEM, exporter);
        ladderRecipe(ModBlocks.STRIPPED_CRIMSON_LOG_LADDER, Blocks.STRIPPED_CRIMSON_STEM, exporter);
        //Warped
        ladderRecipe(ModBlocks.WARPED_PLANK_LADDER, Blocks.WARPED_PLANKS, exporter);
        ladderRecipe(ModBlocks.WARPED_LOG_LADDER, Blocks.WARPED_STEM, exporter);
        ladderRecipe(ModBlocks.STRIPPED_WARPED_LOG_LADDER, Blocks.STRIPPED_WARPED_STEM, exporter);
    }
}
