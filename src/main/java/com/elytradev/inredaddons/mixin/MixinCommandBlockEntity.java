package com.elytradev.inredaddons.mixin;

import com.elytradev.infraredstone.api.EncoderScannable;
import net.minecraft.block.entity.CommandBlockBlockEntity;
import net.minecraft.util.math.Direction;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(CommandBlockBlockEntity.class)
public class MixinCommandBlockEntity implements EncoderScannable {
	@Override
	public int getEncoderValue(Direction direction) {
		int successes = ((CommandBlockBlockEntity)(Object)(this)).getCommandExecutor().getSuccessCount();
		if (successes < 63) {
			return successes;
		} else {
			return 63;
		}
	}
}
