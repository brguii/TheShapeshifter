package net.mcreator.theshapeshifterbyxboxscontentnw.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.theshapeshifterbyxboxscontentnw.entity.ShapeshifterWatchEntity;

public class ShapeshifterWatchModel extends AnimatedGeoModel<ShapeshifterWatchEntity> {
	@Override
	public ResourceLocation getAnimationResource(ShapeshifterWatchEntity entity) {
		return new ResourceLocation("theshapeshifterbyxboxscontentnw", "animations/shapeshifter.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ShapeshifterWatchEntity entity) {
		return new ResourceLocation("theshapeshifterbyxboxscontentnw", "geo/shapeshifter.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ShapeshifterWatchEntity entity) {
		return new ResourceLocation("theshapeshifterbyxboxscontentnw", "textures/entities/" + entity.getTexture() + ".png");
	}

}
