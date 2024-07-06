
package net.mcreator.theshapeshifterbyxboxscontentnw.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.theshapeshifterbyxboxscontentnw.entity.model.ShapeshifterFleeingModel;
import net.mcreator.theshapeshifterbyxboxscontentnw.entity.layer.ShapeshifterFleeingLayer;
import net.mcreator.theshapeshifterbyxboxscontentnw.entity.ShapeshifterFleeingEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ShapeshifterFleeingRenderer extends GeoEntityRenderer<ShapeshifterFleeingEntity> {
	public ShapeshifterFleeingRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new ShapeshifterFleeingModel());
		this.shadowRadius = 0f;
		this.addLayer(new ShapeshifterFleeingLayer(this));
	}

	@Override
	public RenderType getRenderType(ShapeshifterFleeingEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(0.55f, 0.55f, 0.55f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
