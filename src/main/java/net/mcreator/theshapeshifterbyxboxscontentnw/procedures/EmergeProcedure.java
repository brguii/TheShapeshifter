package net.mcreator.theshapeshifterbyxboxscontentnw.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.theshapeshifterbyxboxscontentnw.init.TheshapeshifterbyxboxscontentnwModEntities;
import net.mcreator.theshapeshifterbyxboxscontentnw.entity.ShapeshifterOnWallEntity;
import net.mcreator.theshapeshifterbyxboxscontentnw.entity.ShapeshifterKillerEntity;
import net.mcreator.theshapeshifterbyxboxscontentnw.TheshapeshifterbyxboxscontentnwMod;

public class EmergeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		TheshapeshifterbyxboxscontentnwMod.queueServerWork(50, () -> {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.INVISIBILITY);
			if (entity instanceof ShapeshifterOnWallEntity) {
				((ShapeshifterOnWallEntity) entity).setAnimation("animation.shapeshifter.wall_emerge");
			}
			TheshapeshifterbyxboxscontentnwMod.queueServerWork(95, () -> {
				if (!entity.level.isClientSide())
					entity.discard();
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new ShapeshifterKillerEntity(TheshapeshifterbyxboxscontentnwModEntities.SHAPESHIFTER_KILLER.get(), _level);
					entityToSpawn.moveTo(x, y, z, 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					entityToSpawn.setDeltaMovement(0, 0, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
			});
		});
	}
}
