
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theshapeshifterbyxboxscontentnw.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.theshapeshifterbyxboxscontentnw.client.renderer.ShapeshifterWolfRenderer;
import net.mcreator.theshapeshifterbyxboxscontentnw.client.renderer.ShapeshifterOnWallRenderer;
import net.mcreator.theshapeshifterbyxboxscontentnw.client.renderer.ShapeshifterKillerRenderer;
import net.mcreator.theshapeshifterbyxboxscontentnw.client.renderer.ShapeshifterFleeRenderer;
import net.mcreator.theshapeshifterbyxboxscontentnw.client.renderer.ShapeshifterFakeRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TheshapeshifterbyxboxscontentnwModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TheshapeshifterbyxboxscontentnwModEntities.SHAPESHIFTER_ON_WALL.get(), ShapeshifterOnWallRenderer::new);
		event.registerEntityRenderer(TheshapeshifterbyxboxscontentnwModEntities.SHAPESHIFTER_KILLER.get(), ShapeshifterKillerRenderer::new);
		event.registerEntityRenderer(TheshapeshifterbyxboxscontentnwModEntities.SHAPESHIFTER_FAKE.get(), ShapeshifterFakeRenderer::new);
		event.registerEntityRenderer(TheshapeshifterbyxboxscontentnwModEntities.SHAPESHIFTER_WOLF.get(), ShapeshifterWolfRenderer::new);
		event.registerEntityRenderer(TheshapeshifterbyxboxscontentnwModEntities.SHAPESHIFTER_FLEE.get(), ShapeshifterFleeRenderer::new);
	}
}
