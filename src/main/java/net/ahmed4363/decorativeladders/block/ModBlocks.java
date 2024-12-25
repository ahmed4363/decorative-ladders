package net.ahmed4363.decorativeladders.block;

import net.ahmed4363.decorativeladders.DecorativeLadders;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    //Oak Set
    public static final Block OAK_PLANK_LADDER = RegisterBlock("oak_plank_ladder", new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER).pistonBehavior(PistonBehavior.NORMAL).solid()));
    public static final Block OAK_LOG_LADDER = RegisterLadderBlock("oak_log_ladder");
    public static final Block STRIPPED_OAK_LOG_LADDER = RegisterLadderBlock("stripped_oak_log_ladder");
    //Spruce Set
    public static final Block SPRUCE_PLANK_LADDER = RegisterLadderBlock("spruce_plank_ladder");
    public static final Block SPRUCE_LOG_LADDER = RegisterLadderBlock("spruce_log_ladder");
    public static final Block STRIPPED_SPRUCE_LOG_LADDER = RegisterLadderBlock("stripped_spruce_log_ladder");
    //Birch Set
    public static final Block BIRCH_PLANK_LADDER = RegisterLadderBlock("birch_plank_ladder");
    public static final Block BIRCH_LOG_LADDER = RegisterLadderBlock("birch_log_ladder");
    public static final Block STRIPPED_BIRCH_LOG_LADDER = RegisterLadderBlock("stripped_birch_log_ladder");
    //Dark Oak Set
    public static final Block DARK_OAK_PLANK_LADDER = RegisterLadderBlock("dark_oak_plank_ladder");
    public static final Block DARK_OAK_LOG_LADDER = RegisterLadderBlock("dark_oak_log_ladder");
    public static final Block STRIPPED_DARK_OAK_LOG_LADDER = RegisterLadderBlock("stripped_dark_oak_log_ladder");
    //Acacia Set
    public static final Block ACACIA_PLANK_LADDER = RegisterLadderBlock("acacia_plank_ladder");
    public static final Block ACACIA_LOG_LADDER = RegisterLadderBlock("acacia_log_ladder");
    public static final Block STRIPPED_ACACIA_LOG_LADDER = RegisterLadderBlock("stripped_acacia_log_ladder");
    //Jungle Set
    public static final Block JUNGLE_PLANK_LADDER = RegisterLadderBlock("jungle_plank_ladder");
    public static final Block JUNGLE_LOG_LADDER = RegisterLadderBlock("jungle_log_ladder");
    public static final Block STRIPPED_JUNGLE_LOG_LADDER = RegisterLadderBlock("stripped_jungle_log_ladder");
    //Mangrove Set
    public static final Block MANGROVE_PLANK_LADDER = RegisterLadderBlock("mangrove_plank_ladder");
    public static final Block MANGROVE_LOG_LADDER = RegisterLadderBlock("mangrove_log_ladder");
    public static final Block STRIPPED_MANGROVE_LOG_LADDER = RegisterLadderBlock("stripped_mangrove_log_ladder");
    //Cherry Set
    public static final Block CHERRY_PLANK_LADDER = RegisterLadderBlock("cherry_plank_ladder");
    public static final Block CHERRY_LOG_LADDER = RegisterLadderBlock("cherry_log_ladder");
    public static final Block STRIPPED_CHERRY_LOG_LADDER = RegisterLadderBlock("stripped_cherry_log_ladder");
    //Bamboo Set
    public static final Block BAMBOO_PLANK_LADDER = RegisterLadderBlock("bamboo_plank_ladder");
    public static final Block BAMBOO_LOG_LADDER = RegisterLadderBlock("bamboo_log_ladder");
    public static final Block STRIPPED_BAMBOO_LOG_LADDER = RegisterLadderBlock("stripped_bamboo_log_ladder");
    //Crimson Set
    public static final Block CRIMSON_PLANK_LADDER = RegisterLadderBlock("crimson_plank_ladder");
    public static final Block CRIMSON_LOG_LADDER = RegisterLadderBlock("crimson_log_ladder");
    public static final Block STRIPPED_CRIMSON_LOG_LADDER = RegisterLadderBlock("stripped_crimson_log_ladder");
    //Warped Set
    public static final Block WARPED_PLANK_LADDER = RegisterLadderBlock("warped_plank_ladder");
    public static final Block WARPED_LOG_LADDER = RegisterLadderBlock("warped_log_ladder");
    public static final Block STRIPPED_WARPED_LOG_LADDER = RegisterLadderBlock("stripped_warped_log_ladder");


    private static Block RegisterLadderBlock(String name)
    {
        return RegisterBlock(name, new LadderBlock(FabricBlockSettings.copyOf(ModBlocks.OAK_PLANK_LADDER)));
    }
    private static Block RegisterBlock(String name, Block block)
    {
        RegisterBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(DecorativeLadders.MOD_ID, name), block);
    }
    private static void RegisterBlockItem(String name, Block block)
    {
        Registry.register(Registries.ITEM, new Identifier(DecorativeLadders.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }
    public static void RegisterModBlocks()
    {
        DecorativeLadders.LOGGER.info("Registering Blocks for " + DecorativeLadders.MOD_ID);
        //Oak
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> content.addAfter(Items.OAK_BUTTON, OAK_PLANK_LADDER));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> content.addAfter(Items.OAK_BUTTON, STRIPPED_OAK_LOG_LADDER));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> content.addAfter(Items.OAK_BUTTON, OAK_LOG_LADDER));
        //Spruce
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> content.addAfter(Items.SPRUCE_BUTTON, SPRUCE_PLANK_LADDER));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> content.addAfter(Items.SPRUCE_BUTTON, STRIPPED_SPRUCE_LOG_LADDER));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> content.addAfter(Items.SPRUCE_BUTTON, SPRUCE_LOG_LADDER));
        //Birch
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> content.addAfter(Items.BIRCH_BUTTON, BIRCH_PLANK_LADDER));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> content.addAfter(Items.BIRCH_BUTTON, STRIPPED_BIRCH_LOG_LADDER));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> content.addAfter(Items.BIRCH_BUTTON, BIRCH_LOG_LADDER));
        //Dark Oak
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> content.addAfter(Items.DARK_OAK_BUTTON, DARK_OAK_PLANK_LADDER));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> content.addAfter(Items.DARK_OAK_BUTTON, STRIPPED_DARK_OAK_LOG_LADDER));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> content.addAfter(Items.DARK_OAK_BUTTON, DARK_OAK_LOG_LADDER));
        //Acacia
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> content.addAfter(Items.ACACIA_BUTTON, ACACIA_PLANK_LADDER));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> content.addAfter(Items.ACACIA_BUTTON, STRIPPED_ACACIA_LOG_LADDER));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> content.addAfter(Items.ACACIA_BUTTON, ACACIA_LOG_LADDER));
        //Jungle
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> content.addAfter(Items.JUNGLE_BUTTON, JUNGLE_PLANK_LADDER));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> content.addAfter(Items.JUNGLE_BUTTON, STRIPPED_JUNGLE_LOG_LADDER));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> content.addAfter(Items.JUNGLE_BUTTON, JUNGLE_LOG_LADDER));
        //Mangrove
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> content.addAfter(Items.MANGROVE_BUTTON, MANGROVE_PLANK_LADDER));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> content.addAfter(Items.MANGROVE_BUTTON, STRIPPED_MANGROVE_LOG_LADDER));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> content.addAfter(Items.MANGROVE_BUTTON, MANGROVE_LOG_LADDER));
        //Cherry
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> content.addAfter(Items.CHERRY_BUTTON, CHERRY_PLANK_LADDER));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> content.addAfter(Items.CHERRY_BUTTON, STRIPPED_CHERRY_LOG_LADDER));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> content.addAfter(Items.CHERRY_BUTTON, CHERRY_LOG_LADDER));
        //Bamboo
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> content.addAfter(Items.BAMBOO_BUTTON, BAMBOO_PLANK_LADDER));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> content.addAfter(Items.BAMBOO_BUTTON, STRIPPED_BAMBOO_LOG_LADDER));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> content.addAfter(Items.BAMBOO_BUTTON, BAMBOO_LOG_LADDER));
        //Crimson
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> content.addAfter(Items.CRIMSON_BUTTON, CRIMSON_PLANK_LADDER));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> content.addAfter(Items.CRIMSON_BUTTON, STRIPPED_CRIMSON_LOG_LADDER));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> content.addAfter(Items.CRIMSON_BUTTON, CRIMSON_LOG_LADDER));
        //Warped
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> content.addAfter(Items.WARPED_BUTTON, WARPED_PLANK_LADDER));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> content.addAfter(Items.WARPED_BUTTON, STRIPPED_WARPED_LOG_LADDER));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> content.addAfter(Items.WARPED_BUTTON, WARPED_LOG_LADDER));
    }
}
