package com.elytradev.inredaddons.mixin;

import com.elytradev.infraredstone.api.EncoderScannable;
import net.minecraft.block.entity.LecternBlockEntity;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(LecternBlockEntity.class)
public class MixinLecternBlockEntity implements EncoderScannable {
	@Shadow private int field_17390;

	@Override
	public int getEncoderValue(Direction direction) {
		float percent = field_17390 > 1 ? (float)((LecternBlockEntity)(Object)this).method_17523() / ((float)this.field_17390 - 1.0F) : 1.0F;
		return MathHelper.floor(percent * 62.0F) + (((LecternBlockEntity)(Object)this).method_17522() ? 1 : 0);
	}
}
