package net.mcreator.theshapeshifterbyxboxscontentnw.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class FiftyFiftyDespawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Mth.nextInt(RandomSource.create(), 1, 2) == 2) {
			if (!entity.level.isClientSide())
				entity.discard();
		}
	}
}
