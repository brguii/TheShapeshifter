package net.mcreator.theshapeshifterbyxboxscontentnw.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.theshapeshifterbyxboxscontentnw.init.TheshapeshifterbyxboxscontentnwModEntities;
import net.mcreator.theshapeshifterbyxboxscontentnw.entity.ShapeshifterFleeingEntity;

public class TurnIntoSSFleeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!entity.level.isClientSide())
			entity.discard();
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new ShapeshifterFleeingEntity(TheshapeshifterbyxboxscontentnwModEntities.SHAPESHIFTER_FLEEING.get(), _level);
			entityToSpawn.moveTo(x, y, z, 0, 0);
			entityToSpawn.setYBodyRot(0);
			entityToSpawn.setYHeadRot(0);
			entityToSpawn.setDeltaMovement(0, 0, 0);
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
	}
}
