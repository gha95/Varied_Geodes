package com.gha95.setup;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.gha95.varied_geodes.VariedGeodes.MODID;

import com.gha95.Blocks.ClusterBlock;
import com.gha95.Blocks.NaturalGemBlock;
import com.gha95.Items.ClusterItem;
import com.gha95.Items.NaturalItem;
import com.gha95.Items.ShardItem;

public class Registration {
	private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
	private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
	
	public static void init() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus(); 
		ITEMS.register(bus);
		BLOCKS.register(bus);
	}
	
	//Emerald Cluster
	public static final RegistryObject<ClusterBlock> EMERALD_CLUSTER_BLOCK = BLOCKS
			.register("emerald_cluster_block", ClusterBlock::new);
	
	public static final RegistryObject<Item> EMERALD_CLUSTER = ITEMS.register("emerald_cluster", 
			() -> new ClusterItem(EMERALD_CLUSTER_BLOCK.get(), new Item.Properties()
			.tab(CreativeModeTab.TAB_DECORATIONS)));
	
	//Emerald shard
	public static final RegistryObject<Item> EMERALD_SHARD = ITEMS.register("emerald_shard", 
			() -> new ShardItem(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
	
	//Natural Emerald
	public static final RegistryObject<NaturalGemBlock> NATURAL_EMERALD_BLOCK = BLOCKS
			.register("natural_emerald_block", NaturalGemBlock::new);
	
	public static final RegistryObject<Item> NATURAL_EMERALD = ITEMS.register("natural_emerald", 
			() -> new NaturalItem(NATURAL_EMERALD_BLOCK.get(), new Item.Properties()
			.tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
}
