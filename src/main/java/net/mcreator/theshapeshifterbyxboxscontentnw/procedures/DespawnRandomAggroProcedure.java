package net.mcreator.theshapeshifterbyxboxscontentnw.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class DespawnRandomAggroProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (Mth.nextInt(RandomSource.create(), 1, 6000) >= 5995) {
			if (!entity.level.isClientSide())
				entity.discard();
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, x, y, z, 12, 1.5, 1.5, 1.5, 2);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("theshapeshifterbyxboxscontentnw:sound")), SoundSource.NEUTRAL, (float) 1.2, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("theshapeshifterbyxboxscontentnw:sound")), SoundSource.NEUTRAL, (float) 1.2, 1, false);
				}
			}
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
