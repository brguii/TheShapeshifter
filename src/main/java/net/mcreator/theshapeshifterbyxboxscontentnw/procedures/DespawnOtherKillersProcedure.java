package net.mcreator.theshapeshifterbyxboxscontentnw.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.theshapeshifterbyxboxscontentnw.entity.ShapeshifterKillerEntity;

public class DespawnOtherKillersProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!world.getEntitiesOfClass(ShapeshifterKillerEntity.class, AABB.ofSize(new Vec3(x, y, z), 128, 128, 128), e -> true).isEmpty()) {
			if (!entity.level.isClientSide())
				entity.discard();
		}
	}
}
