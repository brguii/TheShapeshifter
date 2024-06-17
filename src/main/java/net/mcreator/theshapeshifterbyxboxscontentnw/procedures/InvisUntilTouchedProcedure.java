package net.mcreator.theshapeshifterbyxboxscontentnw.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.theshapeshifterbyxboxscontentnw.TheshapeshifterbyxboxscontentnwMod;

public class InvisUntilTouchedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 10000, 1, false, false));
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 10000, 1, false, false));
		TheshapeshifterbyxboxscontentnwMod.queueServerWork(10000, () -> {
			if (!entity.level.isClientSide())
				entity.discard();
		});
	}
}
