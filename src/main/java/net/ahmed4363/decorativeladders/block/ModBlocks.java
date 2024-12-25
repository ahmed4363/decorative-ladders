package net.ahmed4363.decorativeladders.block;

import net.ahmed4363.decorativeladders.DecorativeLadders;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModBlocks {
    //Oak Set
    public static final Block OAK_PLANK_LADDER = RegisterLadder("oak_plank_ladder");
    public static final Block OAK_LOG_LADDER = RegisterLadder("oak_log_ladder");
    public static final Block STRIPPED_OAK_LOG_LADDER = RegisterLadder("stripped_oak_log_ladder");
    //Spruce Set
    public static final Block SPRUCE_PLANK_LADDER = RegisterLadder("spruce_plank_ladder");
    public static final Block SPRUCE_LOG_LADDER = RegisterLadder("spruce_log_ladder");
    public static final Block STRIPPED_SPRUCE_LOG_LADDER = RegisterLadder("stripped_spruce_log_ladder");
    //Birch Set
    public static final Block BIRCH_PLANK_LADDER = RegisterLadder("birch_plank_ladder");
    public static final Block BIRCH_LOG_LADDER = RegisterLadder("birch_log_ladder");
    public static final Block STRIPPED_BIRCH_LOG_LADDER = RegisterLadder("stripped_birch_log_ladder");
    //Dark Oak Set
    public static final Block DARK_OAK_PLANK_LADDER = RegisterLadder("dark_oak_plank_ladder");
    public static final Block DARK_OAK_LOG_LADDER = RegisterLadder("dark_oak_log_ladder");
    public static final Block STRIPPED_DARK_OAK_LOG_LADDER = RegisterLadder("stripped_dark_oak_log_ladder");
    //Acacia Set
    public static final Block ACACIA_PLANK_LADDER = RegisterLadder("acacia_plank_ladder");
    public static final Block ACACIA_LOG_LADDER = RegisterLadder("acacia_log_ladder");
    public static final Block STRIPPED_ACACIA_LOG_LADDER = RegisterLadder("stripped_acacia_log_ladder");
    //Jungle Set
    public static final Block JUNGLE_PLANK_LADDER = RegisterLadder("jungle_plank_ladder");
    public static final Block JUNGLE_LOG_LADDER = RegisterLadder("jungle_log_ladder");
    public static final Block STRIPPED_JUNGLE_LOG_LADDER = RegisterLadder("stripped_jungle_log_ladder");
    //Mangrove Set
    public static final Block MANGROVE_PLANK_LADDER = RegisterLadder("mangrove_plank_ladder");
    public static final Block MANGROVE_LOG_LADDER = RegisterLadder("mangrove_log_ladder");
    public static final Block STRIPPED_MANGROVE_LOG_LADDER = RegisterLadder("stripped_mangrove_log_ladder");
    //Cherry Set
    public static final Block CHERRY_PLANK_LADDER = RegisterLadder("cherry_plank_ladder");
    public static final Block CHERRY_LOG_LADDER = RegisterLadder("cherry_log_ladder");
    public static final Block STRIPPED_CHERRY_LOG_LADDER = RegisterLadder("stripped_cherry_log_ladder");
    //Bamboo Set
    public static final Block BAMBOO_PLANK_LADDER = RegisterLadder("bamboo_plank_ladder");
    public static final Block BAMBOO_LOG_LADDER = RegisterLadder("bamboo_log_ladder");
    public static final Block STRIPPED_BAMBOO_LOG_LADDER = RegisterLadder("stripped_bamboo_log_ladder");
    //Crimson Set
    public static final Block CRIMSON_PLANK_LADDER = RegisterLadder("crimson_plank_ladder");
    public static final Block CRIMSON_LOG_LADDER = RegisterLadder("crimson_log_ladder");
    public static final Block STRIPPED_CRIMSON_LOG_LADDER = RegisterLadder("stripped_crimson_log_ladder");
    //Warped Set
    public static final Block WARPED_PLANK_LADDER = RegisterLadder("warped_plank_ladder");
    public static final Block WARPED_LOG_LADDER = RegisterLadder("warped_log_ladder");
    public static final Block STRIPPED_WARPED_LOG_LADDER = RegisterLadder("stripped_warped_log_ladder");


    private static Block RegisterBlock(String name, Block block)
    {
        RegistryKey<Block> key = GetBlockKey(name);
        RegisterBlockItem(name, block);
        return Registry.register(Registries.BLOCK, key, block);
    }
    private static Block RegisterLadder(String name)
    {
        LadderBlock ladder = new LadderBlock(AbstractBlock.Settings.copy(Blocks.LADDER).solid().pistonBehavior(PistonBehavior.NORMAL).registryKey(GetBlockKey(name)));
        return RegisterBlock(name, ladder);
    }
    private static Item RegisterBlockItem(String name, Block block)
    {
        RegistryKey<Item> key = GetItemKey(name);
        return Registry.register(Registries.ITEM, Identifier.of(DecorativeLadders.MOD_ID, name), new BlockItem(block, new Item.Settings().registryKey(key).useBlockPrefixedTranslationKey()));
    }
    private static RegistryKey<Block> GetBlockKey(String name)
    {
        Identifier id = Identifier.of(DecorativeLadders.MOD_ID, name);
        return RegistryKey.of(RegistryKeys.BLOCK, id);
    }
    private static RegistryKey<Item> GetItemKey(String name)
    {
        Identifier id = Identifier.of(DecorativeLadders.MOD_ID, name);
        return RegistryKey.of(RegistryKeys.ITEM, id);
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
