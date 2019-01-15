package com.elytradev.inredaddons.client;

import net.fabricmc.fabric.client.texture.SpriteRegistry;
import net.fabricmc.fabric.events.client.SpriteEvent;
import net.minecraft.util.Identifier;

public class SpriteProvider implements SpriteEvent.Provider {
	@Override
	public void registerSprites(SpriteRegistry registry) {
		registry.register(new Identifier("inredaddons:block/led_side_glow"));
		registry.register(new Identifier("inredaddons:block/led_end_glow"));
	}
}