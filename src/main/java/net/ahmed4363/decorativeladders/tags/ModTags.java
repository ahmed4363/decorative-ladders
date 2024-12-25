package net.ahmed4363.decorativeladders.tags;

import net.ahmed4363.decorativeladders.DecorativeLadders;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> LADDERS = createTag("ladders");

        public static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(DecorativeLadders.MOD_ID, name));
        }
    }
    public static class Blocks {
        public static final TagKey<Block> LADDERS = createTag("ladders");

        public static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(DecorativeLadders.MOD_ID, name));
        }
    }

}
