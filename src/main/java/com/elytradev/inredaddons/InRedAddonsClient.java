package com.elytradev.inredaddons;

import com.elytradev.inredaddons.block.entity.*;
import com.elytradev.inredaddons.client.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.client.render.BlockEntityRendererRegistry;
import net.fabricmc.fabric.events.client.SpriteEvent;

public class InRedAddonsClient implements ClientModInitializer {
	private SpriteProvider provider = new SpriteProvider();

	@Override
	public void onInitializeClient() {
		SpriteEvent.PROVIDE.register(provider);

		BlockEntityRendererRegistry.INSTANCE.register(LEDBlockEntity.class, new LEDRenderer());
		BlockEntityRendererRegistry.INSTANCE.register(ColorLEDBlockEntity.class, new ColorLEDRenderer());
	}

}

