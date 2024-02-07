package net.ahmed4363.decorativeladders.item.ItemGroups;

import net.ahmed4363.decorativeladders.DecorativeLadders;
import net.ahmed4363.decorativeladders.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    private static final ItemGroup Ladders = Registry.register(Registries.ITEM_GROUP,new Identifier(DecorativeLadders.MOD_ID, "ladders"),FabricItemGroup.builder()
            .displayName(Text.translatable("itemgroup.decorative-ladders.ladders"))
            .icon(() -> new ItemStack(Blocks.LADDER))
            .entries((displayContext, entries) -> {

                entries.add(ModBlocks.OAK_PLANK_LADDER);
                entries.add(ModBlocks.OAK_LOG_LADDER);

            }).build());


    public static void RegisterItemGroups()
    {
        DecorativeLadders.LOGGER.info("Adding Item Groups to " + DecorativeLadders.MOD_ID);
    }
}
