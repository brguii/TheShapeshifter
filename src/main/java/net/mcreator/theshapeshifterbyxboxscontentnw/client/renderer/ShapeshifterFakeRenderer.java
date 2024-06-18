
package net.mcreator.theshapeshifterbyxboxscontentnw.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.theshapeshifterbyxboxscontentnw.entity.model.ShapeshifterFakeModel;
import net.mcreator.theshapeshifterbyxboxscontentnw.entity.ShapeshifterFakeEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ShapeshifterFakeRenderer extends GeoEntityRenderer<ShapeshifterFakeEntity> {
	public ShapeshifterFakeRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new ShapeshifterFakeModel());
		this.shadowRadius = 0f;
	}

	@Override
	public RenderType getRenderType(ShapeshifterFakeEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(0.55f, 0.55f, 0.55f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
