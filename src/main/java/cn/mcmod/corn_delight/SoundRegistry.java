package cn.mcmod.corn_delight;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SoundRegistry {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CornDelight.MODID);

    // Popcorn
    public static final RegistryObject<SoundEvent> POPCORN_POPS = SOUNDS.register("popcorn_pops",
            () -> new SoundEvent(new ResourceLocation(CornDelight.MODID, "popcorn_pops")));
}
