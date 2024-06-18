
package net.mcreator.theshapeshifterbyxboxscontentnw.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.theshapeshifterbyxboxscontentnw.entity.model.ShapeshifterOnWallModel;
import net.mcreator.theshapeshifterbyxboxscontentnw.entity.layer.ShapeshifterOnWallLayer;
import net.mcreator.theshapeshifterbyxboxscontentnw.entity.ShapeshifterOnWallEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ShapeshifterOnWallRenderer extends GeoEntityRenderer<ShapeshifterOnWallEntity> {
	public ShapeshifterOnWallRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new ShapeshifterOnWallModel());
		this.shadowRadius = 0f;
		this.addLayer(new ShapeshifterOnWallLayer(this));
	}

	@Override
	public RenderType getRenderType(ShapeshifterOnWallEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(0.55f, 0.55f, 0.55f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
