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
import net.squadeldee.aquaticbrilliance.entity.custom.MackerelEntity;
import net.squadeldee.aquaticbrilliance.entity.custom.SailfishEntity;
import net.squadeldee.aquaticbrilliance.entity.custom.SailfishEntity;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class SailfishRenderer extends GeoEntityRenderer<SailfishEntity> {

    public SailfishRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SailfishModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(SailfishEntity instance) {
        return new ResourceLocation(AquaticBrilliance.MOD_ID, "textures/entity/sailfish/sailtexture.png");
    }



    @Override
    public RenderType getRenderType(SailfishEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {

        if(animatable.isBaby()) {
            stack.scale(0.4F, 0.4F, 0.4F);
        } else {
            stack.scale(0.8F, 0.8F, 0.8F);
        }
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }

    @Override
    protected void applyRotations(SailfishEntity endWhale, PoseStack matrixStackIn, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(endWhale, matrixStackIn, ageInTicks, rotationYaw, partialTicks);

        float f = 4.3F * Mth.sin(0.6F * ageInTicks);
        matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(f));
        if (!endWhale.isInWater()) {
            matrixStackIn.translate(0.1F, 0.1F, -0.1F);
            matrixStackIn.mulPose(Vector3f.ZP.rotationDegrees(90.0F));
        }



    }
    
}
