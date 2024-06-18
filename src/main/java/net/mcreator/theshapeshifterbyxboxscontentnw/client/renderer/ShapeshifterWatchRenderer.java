
package net.mcreator.theshapeshifterbyxboxscontentnw.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.theshapeshifterbyxboxscontentnw.entity.model.ShapeshifterWatchModel;
import net.mcreator.theshapeshifterbyxboxscontentnw.entity.layer.ShapeshifterWatchLayer;
import net.mcreator.theshapeshifterbyxboxscontentnw.entity.ShapeshifterWatchEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ShapeshifterWatchRenderer extends GeoEntityRenderer<ShapeshifterWatchEntity> {
	public ShapeshifterWatchRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new ShapeshifterWatchModel());
		this.shadowRadius = 0f;
		this.addLayer(new ShapeshifterWatchLayer(this));
	}

	@Override
	public RenderType getRenderType(ShapeshifterWatchEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(0.55f, 0.55f, 0.55f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
