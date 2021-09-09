package com.gha95.varied_geodes;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.gha95.setup.Registration;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(VariedGeodes.MODID)
public class VariedGeodes {
	public static final String MODID = "varied_geodes";
	
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public VariedGeodes() {
    	IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        // Register the setup method for modloading
        modEventBus.addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
        
        //Initialise registration of our own items
        Registration.init();
    }

    private void setup(final FMLCommonSetupEvent event) {
    }
}
