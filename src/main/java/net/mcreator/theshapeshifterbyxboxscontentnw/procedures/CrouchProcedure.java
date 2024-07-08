package net.mcreator.theshapeshifterbyxboxscontentnw.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.BlockPos;

public class CrouchProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!((world.getBlockState(new BlockPos(x, y + 2, z))).getBlock() == Blocks.AIR)) {
			entity.setShiftKeyDown(true);
			if (entity.getDeltaMovement().y() > 0) {
				entity.setSprinting(true);
				entity.setShiftKeyDown(false);
			}
			if (entity.getDeltaMovement().x() > 0) {
				entity.setSprinting(true);
				entity.setShiftKeyDown(false);
			}
			if (entity.getDeltaMovement().z() > 0) {
				entity.setSprinting(true);
				entity.setShiftKeyDown(false);
			}
			if (entity.getDeltaMovement().y() == 0) {
				entity.setSprinting(false);
			}
			if (entity.getDeltaMovement().x() == 0) {
				entity.setSprinting(false);
			}
			if (entity.getDeltaMovement().z() == 0) {
				entity.setSprinting(false);
			}
		}
		if ((world.getBlockState(new BlockPos(x, y + 2, z))).getBlock() == Blocks.AIR) {
			entity.setShiftKeyDown(false);
		}
		if (entity.isSprinting()) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 1, false, false));
		}
	}
}
