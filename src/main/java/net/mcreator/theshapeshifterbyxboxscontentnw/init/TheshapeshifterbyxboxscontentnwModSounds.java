
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theshapeshifterbyxboxscontentnw.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.theshapeshifterbyxboxscontentnw.TheshapeshifterbyxboxscontentnwMod;

public class TheshapeshifterbyxboxscontentnwModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TheshapeshifterbyxboxscontentnwMod.MODID);
	public static final RegistryObject<SoundEvent> KNOCKING = REGISTRY.register("knocking", () -> new SoundEvent(new ResourceLocation("theshapeshifterbyxboxscontentnw", "knocking")));
	public static final RegistryObject<SoundEvent> SOUND = REGISTRY.register("sound", () -> new SoundEvent(new ResourceLocation("theshapeshifterbyxboxscontentnw", "sound")));
	public static final RegistryObject<SoundEvent> SOUND2 = REGISTRY.register("sound2", () -> new SoundEvent(new ResourceLocation("theshapeshifterbyxboxscontentnw", "sound2")));
}
