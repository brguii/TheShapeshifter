
package net.mcreator.theshapeshifterbyxboxscontentnw.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.theshapeshifterbyxboxscontentnw.entity.model.ShapeshifterKillerModel;
import net.mcreator.theshapeshifterbyxboxscontentnw.entity.layer.ShapeshifterKillerLayer;
import net.mcreator.theshapeshifterbyxboxscontentnw.entity.ShapeshifterKillerEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ShapeshifterKillerRenderer extends GeoEntityRenderer<ShapeshifterKillerEntity> {
	public ShapeshifterKillerRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new ShapeshifterKillerModel());
		this.shadowRadius = 0f;
		this.addLayer(new ShapeshifterKillerLayer(this));
	}

	@Override
	public RenderType getRenderType(ShapeshifterKillerEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(0.55f, 0.55f, 0.55f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
