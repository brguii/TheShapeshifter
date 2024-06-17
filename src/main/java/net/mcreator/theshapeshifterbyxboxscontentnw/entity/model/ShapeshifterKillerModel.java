package net.mcreator.theshapeshifterbyxboxscontentnw.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.theshapeshifterbyxboxscontentnw.entity.ShapeshifterKillerEntity;

public class ShapeshifterKillerModel extends AnimatedGeoModel<ShapeshifterKillerEntity> {
	@Override
	public ResourceLocation getAnimationResource(ShapeshifterKillerEntity entity) {
		return new ResourceLocation("theshapeshifterbyxboxscontentnw", "animations/shapeshifter.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ShapeshifterKillerEntity entity) {
		return new ResourceLocation("theshapeshifterbyxboxscontentnw", "geo/shapeshifter.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ShapeshifterKillerEntity entity) {
		return new ResourceLocation("theshapeshifterbyxboxscontentnw", "textures/entities/" + entity.getTexture() + ".png");
	}

}
