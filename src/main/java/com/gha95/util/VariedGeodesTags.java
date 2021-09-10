package com.gha95.util;

import com.gha95.varied_geodes.VariedGeodes;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

public class VariedGeodesTags {
	public static class Blocks {
		public static final Tags.IOptionalNamedTag<Block> NATURAL_GEMS = 
				createTag("natural_gems");
		
		private static Tags.IOptionalNamedTag<Block> createTag(String name) {
			return BlockTags.createOptional(new ResourceLocation(VariedGeodes.MODID, name));
		}
		
		private static Tags.IOptionalNamedTag<Block> createForgeTag(String name) {
			return BlockTags.createOptional(new ResourceLocation("forge", name));
		}
	}
	
	public static class Items {
		public static final Tags.IOptionalNamedTag<Item> EMERALD_SHARD = 
				createForgeTag("gems/emerald_shard");
		
		private static Tags.IOptionalNamedTag<Item> createTag(String name) {
			return ItemTags.createOptional(new ResourceLocation(VariedGeodes.MODID, name));
		}
		
		private static Tags.IOptionalNamedTag<Item> createForgeTag(String name) {
			return ItemTags.createOptional(new ResourceLocation("forge", name));
		}
	}
}
