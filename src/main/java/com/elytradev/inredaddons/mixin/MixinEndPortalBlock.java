package com.elytradev.inredaddons.mixin;

import com.elytradev.infraredstone.api.SimpleEncoderScannable;
import net.minecraft.block.BlockState;
import net.minecraft.block.EndPortalFrameBlock;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(EndPortalFrameBlock.class)
public class MixinEndPortalBlock implements SimpleEncoderScannable {
	@Shadow @Final public static BooleanProperty field_10958;

	@Override
	public int getEncoderValue(World world, BlockPos pos, BlockState state, Direction dir) {
		return state.get(field_10958)? 0b00_0001 : 0b00_0000;
	}
}
