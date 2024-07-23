package net.mcreator.theshapeshifterbyxboxscontentnw.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.BlockPos;

import net.mcreator.theshapeshifterbyxboxscontentnw.entity.ShapeshifterKillerEntity;

public class CrouchProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!world.isEmptyBlock(new BlockPos(x, y + 2, z))) {
			if (entity instanceof ShapeshifterKillerEntity) {
				((ShapeshifterKillerEntity) entity).setAnimation("animation.shapeshifter.crouchidle");
			}
			if (entity.getDeltaMovement().y() > 0) {
				if (entity instanceof ShapeshifterKillerEntity) {
					((ShapeshifterKillerEntity) entity).setAnimation("animation.shapeshifter.crouchmove");
				}
				if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1, 2, false, false));
			} else {
				if (entity instanceof ShapeshifterKillerEntity) {
					((ShapeshifterKillerEntity) entity).setAnimation("animation.shapeshifter.crouchidle");
				}
			}
			if (entity.getDeltaMovement().x() > 0) {
				if (entity instanceof ShapeshifterKillerEntity) {
					((ShapeshifterKillerEntity) entity).setAnimation("animation.shapeshifter.crouchmove");
				}
				if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1, 2, false, false));
			} else {
				if (entity instanceof ShapeshifterKillerEntity) {
					((ShapeshifterKillerEntity) entity).setAnimation("animation.shapeshifter.crouchidle");
				}
			}
			if (entity.getDeltaMovement().z() > 0) {
				if (entity instanceof ShapeshifterKillerEntity) {
					((ShapeshifterKillerEntity) entity).setAnimation("animation.shapeshifter.crouchmove");
				}
				if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1, 2, false, false));
			} else {
				if (entity instanceof ShapeshifterKillerEntity) {
					((ShapeshifterKillerEntity) entity).setAnimation("animation.shapeshifter.crouchidle");
				}
			}
		}
		if (world.isEmptyBlock(new BlockPos(x, y + 2, z))) {
			if (entity instanceof ShapeshifterKillerEntity) {
				((ShapeshifterKillerEntity) entity).setAnimation("empty");
			}
		}
	}
}
