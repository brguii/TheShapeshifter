package net.mcreator.theshapeshifterbyxboxscontentnw.entity.model;

import software.bernie.geckolib3.model.provider.data.EntityModelData;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.theshapeshifterbyxboxscontentnw.entity.ShapeshifterFakeEntity;

public class ShapeshifterFakeModel extends AnimatedGeoModel<ShapeshifterFakeEntity> {
	@Override
	public ResourceLocation getAnimationResource(ShapeshifterFakeEntity entity) {
		return new ResourceLocation("theshapeshifterbyxboxscontentnw", "animations/shapeshifter.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ShapeshifterFakeEntity entity) {
		return new ResourceLocation("theshapeshifterbyxboxscontentnw", "geo/shapeshifter.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ShapeshifterFakeEntity entity) {
		return new ResourceLocation("theshapeshifterbyxboxscontentnw", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(ShapeshifterFakeEntity animatable, int instanceId, AnimationEvent animationEvent) {
		super.setCustomAnimations(animatable, instanceId, animationEvent);
		IBone head = this.getAnimationProcessor().getBone("neck");
		EntityModelData extraData = (EntityModelData) animationEvent.getExtraDataOfType(EntityModelData.class).get(0);
		AnimationData manager = animatable.getFactory().getOrCreateAnimationData(instanceId);
		int unpausedMultiplier = !Minecraft.getInstance().isPaused() || manager.shouldPlayWhilePaused ? 1 : 0;
		head.setRotationX(head.getRotationX() + extraData.headPitch * ((float) Math.PI / 180F) * unpausedMultiplier);
		head.setRotationY(head.getRotationY() + extraData.netHeadYaw * ((float) Math.PI / 180F) * unpausedMultiplier);
	}
}
