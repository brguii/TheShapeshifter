package net.mcreator.theshapeshifterbyxboxscontentnw.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class DespawnSomewhatRandomProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (Mth.nextInt(RandomSource.create(), 1, 3000) >= 2995) {
			if (!entity.level.isClientSide())
				entity.discard();
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, x, y, z, 12, 1.5, 1.5, 1.5, 2);
		}
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
