package net.squadeldee.aquaticbrilliance.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Vector3f;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.squadeldee.aquaticbrilliance.AquaticBrilliance;
import net.squadeldee.aquaticbrilliance.entity.custom.SunfishEntity;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class SunfishRenderer extends GeoEntityRenderer<SunfishEntity> {

    public SunfishRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SunfishModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(SunfishEntity instance) {
        return new ResourceLocation(AquaticBrilliance.MOD_ID, "textures/entity/sunfish/suntexture.png");
    }



    @Override
    public RenderType getRenderType(SunfishEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {

        if(animatable.isBaby()) {
            stack.scale(0.4F, 0.4F, 0.4F);
        } else {
            stack.scale(1.5F, 1.5F, 1.5F);
        }
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }



}
