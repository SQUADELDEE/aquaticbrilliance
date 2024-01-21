package net.squadeldee.aquaticbrilliance.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.squadeldee.aquaticbrilliance.AquaticBrilliance;
import net.squadeldee.aquaticbrilliance.client.MackerelRenderer;
import net.squadeldee.aquaticbrilliance.client.SailfishRenderer;
import net.squadeldee.aquaticbrilliance.client.SunfishRenderer;
import net.squadeldee.aquaticbrilliance.client.TriggerfishRenderer;
import net.squadeldee.aquaticbrilliance.entity.ModEntityTypes;
import net.squadeldee.aquaticbrilliance.entity.custom.MackerelEntity;
import net.squadeldee.aquaticbrilliance.entity.custom.SailfishEntity;
import net.squadeldee.aquaticbrilliance.entity.custom.SunfishEntity;
import net.squadeldee.aquaticbrilliance.entity.custom.TriggerfishEntity;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class ModBusEvents {

    @Mod.EventBusSubscriber(modid = AquaticBrilliance.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
            event.put(ModEntityTypes.SUNFISH.get(), SunfishEntity.setAttributes().build());
            event.put(ModEntityTypes.SAILFISH.get(), SailfishEntity.setAttributes().build());
            event.put(ModEntityTypes.MACKEREL.get(), MackerelEntity.setAttributes().build());
            event.put(ModEntityTypes.TRIGGERFISH.get(), TriggerfishEntity.setAttributes().build());

        }

        @SubscribeEvent
        public static void entityRenderers(EntityRenderersEvent.RegisterRenderers event){
            event.registerEntityRenderer(ModEntityTypes.SUNFISH.get(), SunfishRenderer::new);
            event.registerEntityRenderer(ModEntityTypes.SAILFISH.get(), SailfishRenderer::new);
            event.registerEntityRenderer(ModEntityTypes.MACKEREL.get(), MackerelRenderer::new);
            event.registerEntityRenderer(ModEntityTypes.TRIGGERFISH.get(), TriggerfishRenderer::new);

        }












    }
}
