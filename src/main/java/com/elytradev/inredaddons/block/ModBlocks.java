package com.elytradev.inredaddons.block;

import com.elytradev.infraredstone.InfraRedstone;
import com.elytradev.infraredstone.block.NamedBlock;
import com.elytradev.inredaddons.block.entity.ColorLEDBlockEntity;
import com.elytradev.inredaddons.block.entity.LEDBlockEntity;
import com.elytradev.inredaddons.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.block.BlockItem;
import net.minecraft.util.registry.Registry;

import java.util.function.Supplier;

public class ModBlocks {
	public static final Block LED = register(new LEDBlock(), InfraRedstone.inRedGroup);
	public static final Block COLOR_LED = register(new ColorLEDBlock(), InfraRedstone.inRedGroup);

	public static final BlockEntityType<LEDBlockEntity> LED_BE = register("led", LEDBlockEntity::new);
	public static final BlockEntityType<ColorLEDBlockEntity> COLOR_LED_BE = register("rgb_led", ColorLEDBlockEntity::new);

	public static void init() {

	}

	public static Block register(NamedBlock block, ItemGroup tab) {
		Registry.register(Registry.BLOCK, "inredaddons:" + block.getName(), block.getBlock());
		BlockItem item = new BlockItem(block.getBlock(), new Item.Settings().itemGroup(tab));
		ModItems.register(block.getName(), item);
		return block.getBlock();
	}

	public static BlockEntityType register(String name, Supplier<BlockEntity> be) {
		return Registry.register(Registry.BLOCK_ENTITY, "inredaddons:" + name, BlockEntityType.Builder.create(be).method_11034(null));
	}
}
