package com.gha95.setup;

import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.gha95.varied_geodes.VariedGeodes.MODID;

import com.gha95.Items.GeodeItem;

public class Registration {
	private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
	
	public static void init() {
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
	
	public static final RegistryObject<Item> EMERALD_CLUSTER = ITEMS.register("emerald_cluster", 
			() -> new GeodeItem(new Item.Properties()));
}
