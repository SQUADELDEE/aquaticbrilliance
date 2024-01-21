package net.squadeldee.aquaticbrilliance.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.squadeldee.aquaticbrilliance.AquaticBrilliance;
import net.squadeldee.aquaticbrilliance.entity.custom.MackerelEntity;
import net.squadeldee.aquaticbrilliance.entity.custom.SailfishEntity;
import net.squadeldee.aquaticbrilliance.entity.custom.SunfishEntity;
import net.squadeldee.aquaticbrilliance.entity.custom.TriggerfishEntity;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, AquaticBrilliance.MOD_ID);


    public static final RegistryObject<EntityType<SunfishEntity>> SUNFISH =
            ENTITY_TYPES.register("sunfish",
                    () -> EntityType.Builder.of(SunfishEntity::new, MobCategory.WATER_CREATURE)
                            .sized(1.1f, 2.5f)
                            .build(new ResourceLocation(AquaticBrilliance.MOD_ID, "sunfish").toString()));

    public static final RegistryObject<EntityType<SailfishEntity>> SAILFISH =
            ENTITY_TYPES.register("sailfish",
                    () -> EntityType.Builder.of(SailfishEntity::new, MobCategory.WATER_CREATURE)
                            .sized(1.1f, 0.8f)
                            .build(new ResourceLocation(AquaticBrilliance.MOD_ID, "sailfish").toString()));

    public static final RegistryObject<EntityType<MackerelEntity>> MACKEREL =
            ENTITY_TYPES.register("mackerel",
                    () -> EntityType.Builder.of(MackerelEntity::new, MobCategory.WATER_CREATURE)
                            .sized(0.5f, 0.5f)
                            .build(new ResourceLocation(AquaticBrilliance.MOD_ID, "mackerel").toString()));

    public static final RegistryObject<EntityType<TriggerfishEntity>> TRIGGERFISH =
            ENTITY_TYPES.register("triggerfish",
                    () -> EntityType.Builder.of(TriggerfishEntity::new, MobCategory.WATER_CREATURE)
                            .sized(0.5f, 0.5f)
                            .build(new ResourceLocation(AquaticBrilliance.MOD_ID, "triggerfish").toString()));
    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
