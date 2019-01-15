package com.elytradev.inredaddons.mixin;

import com.elytradev.infraredstone.api.SimpleEncoderScannable;
import net.minecraft.block.BlockState;
import net.minecraft.block.CakeBlock;
import net.minecraft.state.property.IntegerProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(CakeBlock.class)
public class MixinCake implements SimpleEncoderScannable {
	@Shadow @Final public static IntegerProperty field_10739;

	@Override
	public int getEncoderValue(World world, BlockPos pos, BlockState state, Direction dir) {
		int bites = state.get(field_10739);
		switch (bites) {
			case 0:
				return 0b11_1111;
			case 1:
				return 0b10_0000;
			case 2:
				return 0b01_0000;
			case 3:
				return 0b00_1000;
			case 4:
				return 0b00_0100;
			case 5:
				return 0b00_0010;
			case 6:
				return 0b00_0001;
			default:
				return 0b00_0000;
		}
	}
}
