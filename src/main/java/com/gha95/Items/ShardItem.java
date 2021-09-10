package com.gha95.Items;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class ShardItem extends Item {

	public ShardItem(Properties properties) {
		super(properties);
	}
	
	@Override
	public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> list, TooltipFlag flags) {
		super.appendHoverText(stack, level, list, flags);
		list.add(new TranslatableComponent("message.emerald_shard"));
	}
}
