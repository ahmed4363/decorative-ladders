package net.ahmed4363.decorativeladders.block;

import net.ahmed4363.decorativeladders.DecorativeLadders;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block OAK_PLANK_LADDER = RegisterBlock("oak_plank_ladder", new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER).pistonBehavior(PistonBehavior.NORMAL)));
    public static final Block OAK_LOG_LADDER = RegisterBlock("oak_log_ladder", new LadderBlock(FabricBlockSettings.copyOf(ModBlocks.OAK_PLANK_LADDER)));

    private static Block RegisterBlock(String name, Block block)
    {
        RegisterBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(DecorativeLadders.MOD_ID, name), block);
    }
    private static Item RegisterBlockItem(String name, Block block)
    {
        return Registry.register(Registries.ITEM,  new Identifier(DecorativeLadders.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }
    public static void RegisterModBlocks()
    {
        DecorativeLadders.LOGGER.info("Registering Blocks for " + DecorativeLadders.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> content.addAfter(Items.OAK_BUTTON, OAK_PLANK_LADDER));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> content.addAfter(Items.OAK_BUTTON, OAK_LOG_LADDER));
    }
}
