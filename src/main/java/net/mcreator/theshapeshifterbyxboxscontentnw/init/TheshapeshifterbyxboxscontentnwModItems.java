
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theshapeshifterbyxboxscontentnw.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.theshapeshifterbyxboxscontentnw.TheshapeshifterbyxboxscontentnwMod;

public class TheshapeshifterbyxboxscontentnwModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TheshapeshifterbyxboxscontentnwMod.MODID);
	public static final RegistryObject<Item> SHAPESHIFTER_ON_WALL_SPAWN_EGG = REGISTRY.register("shapeshifter_on_wall_spawn_egg",
			() -> new ForgeSpawnEggItem(TheshapeshifterbyxboxscontentnwModEntities.SHAPESHIFTER_ON_WALL, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SHAPESHIFTER_KILLER_SPAWN_EGG = REGISTRY.register("shapeshifter_killer_spawn_egg",
			() -> new ForgeSpawnEggItem(TheshapeshifterbyxboxscontentnwModEntities.SHAPESHIFTER_KILLER, -6710887, -3355444, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SHAPESHIFTER_FAKE_SPAWN_EGG = REGISTRY.register("shapeshifter_fake_spawn_egg",
			() -> new ForgeSpawnEggItem(TheshapeshifterbyxboxscontentnwModEntities.SHAPESHIFTER_FAKE, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
