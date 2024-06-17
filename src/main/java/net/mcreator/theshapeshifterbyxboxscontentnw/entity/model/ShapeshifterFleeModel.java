package net.mcreator.theshapeshifterbyxboxscontentnw.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.theshapeshifterbyxboxscontentnw.entity.ShapeshifterFleeEntity;

public class ShapeshifterFleeModel extends AnimatedGeoModel<ShapeshifterFleeEntity> {
	@Override
	public ResourceLocation getAnimationResource(ShapeshifterFleeEntity entity) {
		return new ResourceLocation("theshapeshifterbyxboxscontentnw", "animations/shapeshifter.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ShapeshifterFleeEntity entity) {
		return new ResourceLocation("theshapeshifterbyxboxscontentnw", "geo/shapeshifter.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ShapeshifterFleeEntity entity) {
		return new ResourceLocation("theshapeshifterbyxboxscontentnw", "textures/entities/" + entity.getTexture() + ".png");
	}

}
