
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theshapeshifterbyxboxscontentnw.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.theshapeshifterbyxboxscontentnw.entity.ShapeshifterOnWallEntity;
import net.mcreator.theshapeshifterbyxboxscontentnw.entity.ShapeshifterKillerEntity;
import net.mcreator.theshapeshifterbyxboxscontentnw.entity.ShapeshifterFakeEntity;
import net.mcreator.theshapeshifterbyxboxscontentnw.TheshapeshifterbyxboxscontentnwMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheshapeshifterbyxboxscontentnwModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TheshapeshifterbyxboxscontentnwMod.MODID);
	public static final RegistryObject<EntityType<ShapeshifterOnWallEntity>> SHAPESHIFTER_ON_WALL = register("shapeshifter_on_wall",
			EntityType.Builder.<ShapeshifterOnWallEntity>of(ShapeshifterOnWallEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ShapeshifterOnWallEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ShapeshifterKillerEntity>> SHAPESHIFTER_KILLER = register("shapeshifter_killer",
			EntityType.Builder.<ShapeshifterKillerEntity>of(ShapeshifterKillerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ShapeshifterKillerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ShapeshifterFakeEntity>> SHAPESHIFTER_FAKE = register("shapeshifter_fake",
			EntityType.Builder.<ShapeshifterFakeEntity>of(ShapeshifterFakeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ShapeshifterFakeEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ShapeshifterOnWallEntity.init();
			ShapeshifterKillerEntity.init();
			ShapeshifterFakeEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SHAPESHIFTER_ON_WALL.get(), ShapeshifterOnWallEntity.createAttributes().build());
		event.put(SHAPESHIFTER_KILLER.get(), ShapeshifterKillerEntity.createAttributes().build());
		event.put(SHAPESHIFTER_FAKE.get(), ShapeshifterFakeEntity.createAttributes().build());
	}
}
