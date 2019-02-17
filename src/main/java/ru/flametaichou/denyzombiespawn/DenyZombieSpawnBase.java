package ru.flametaichou.denyzombiespawn;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.MinecraftForge;


@Mod (modid = "denyzombiespawn", name = "Deny Zombie Spawn", version = "1.0", acceptableRemoteVersions = "*")

public class DenyZombieSpawnBase {
	
	
	@EventHandler
	public void initialize(FMLInitializationEvent event)
	{
		// Register the Entity Hurt Handler
		MinecraftForge.EVENT_BUS.register(new VanillaZombieSpawnHandler());
	}
	
}
