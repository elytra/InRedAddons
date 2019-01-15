package com.elytradev.inredaddons.item;

import com.elytradev.infraredstone.item.ItemBase;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

public class ModItems {
	public static void init() {

	}

	public static Item register(String name, Item item) {
		Registry.register(Registry.ITEM, "inredaddons:" + name, item);
		return item;
	}

	public static Item register(ItemBase item) {
		Registry.register(Registry.ITEM, "inredaddons:" + item.getName(), item);
		return item;
	}
}
