package net.p3pp3rf1y.sophisticatedcore.common;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.p3pp3rf1y.sophisticatedcore.init.ModFluids;
import net.p3pp3rf1y.sophisticatedcore.init.ModParticles;
import net.p3pp3rf1y.sophisticatedcore.inventory.ItemStackKey;

public class CommonEventHandler {
	public void registerHandlers() {
		IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
		ModFluids.registerHandlers(modBus);
		ModParticles.registerParticles(modBus);
		MinecraftForge.EVENT_BUS.addListener(ItemStackKey::clearCacheOnTickEnd);
	}
}
