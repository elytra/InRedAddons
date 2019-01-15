package com.elytradev.inredaddons.mixin;

import com.elytradev.infraredstone.api.SimpleEncoderScannable;
import net.minecraft.block.BlockState;
import net.minecraft.block.CauldronBlock;
import net.minecraft.state.property.IntegerProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(CauldronBlock.class)
public class MixinCauldron implements SimpleEncoderScannable {
	@Shadow @Final public static IntegerProperty field_10745;

	@Override
	public int getEncoderValue(World world, BlockPos pos, BlockState state, Direction direction) {
//		int fill = state.get(field_10745);
//		switch (fill) {
//			case 1:
//				return 0b00_0001;
//			case 2:
//				return 0b00_0010;
//			case 3:
//				return 0b00_0100;
//			default:
//				return 0b00_0000;
//		}
		return 0b11_1111;
	}
}
