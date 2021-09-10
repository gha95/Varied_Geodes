package com.gha95.Blocks;

import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class ClusterBlock extends AmethystClusterBlock{
	public ClusterBlock() {
		super(2, 0, Properties.of(Material.AMETHYST)
				.sound(SoundType.AMETHYST_CLUSTER)
				.strength(2.0f));
	}
}
