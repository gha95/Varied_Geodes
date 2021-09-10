package com.gha95.Blocks;

import net.minecraft.world.level.block.AmethystBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class NaturalGemBlock extends AmethystBlock{
	public NaturalGemBlock() {
		super(Properties.of(Material.AMETHYST)
				.sound(SoundType.AMETHYST_CLUSTER)
				.strength(2.0f));
	}
}
