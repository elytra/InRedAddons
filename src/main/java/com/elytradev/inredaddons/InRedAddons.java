package com.elytradev.inredaddons;

import com.elytradev.inredaddons.block.ModBlocks;
import com.elytradev.inredaddons.item.ModItems;
import net.fabricmc.api.ModInitializer;

public class InRedAddons implements ModInitializer {

	@Override
	public void onInitialize() {
		ModBlocks.init();
		ModItems.init();
	}
}
