package com.gha95.datagen;

import com.gha95.setup.Registration;
import com.gha95.varied_geodes.VariedGeodes;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class Items extends ItemModelProvider{

	public Items(DataGenerator generator, ExistingFileHelper existingFileHelper) {
		super(generator, VariedGeodes.MODID, existingFileHelper);
	}

	@Override
	protected void registerModels() {
		singleTexture(Registration.EMERALD_CLUSTER.get().getRegistryName().getPath(), 
				new ResourceLocation("item/amethyst_cluster"), 
				"layer0",
				new ResourceLocation(VariedGeodes.MODID, "item/emerald_cluster"));
	}
	
}
