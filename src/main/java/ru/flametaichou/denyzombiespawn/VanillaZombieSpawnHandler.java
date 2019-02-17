package ru.flametaichou.denyzombiespawn;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

public class VanillaZombieSpawnHandler {
	
	@SubscribeEvent
	public void onEntitySpawn(EntityJoinWorldEvent event) {
		if(event.entity.getClass().equals(EntityZombie.class)){
        	event.setCanceled(true);
		}
	}
}
