package net.mcreator.theshapeshifterbyxboxscontentnw.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.theshapeshifterbyxboxscontentnw.entity.ShapeshifterFakeEntity;
import net.mcreator.theshapeshifterbyxboxscontentnw.TheshapeshifterbyxboxscontentnwMod;

public class EmergishProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ShapeshifterFakeEntity) {
			((ShapeshifterFakeEntity) entity).setAnimation("animation.shapeshifter.wall_nvm");
		}
		TheshapeshifterbyxboxscontentnwMod.queueServerWork(140, () -> {
			if (!entity.level.isClientSide())
				entity.discard();
		});
		if (world.getBlockState(new BlockPos(x + 1, y, z)).canOcclude() == false) {
			if (!entity.level.isClientSide())
				entity.discard();
		}
		if (world.getBlockState(new BlockPos(x, y, z)).canOcclude() == true) {
			if (!entity.level.isClientSide())
				entity.discard();
		}
	}
}
