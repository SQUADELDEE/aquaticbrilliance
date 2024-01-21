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
import net.squadeldee.aquaticbrilliance.entity.custom.MackerelEntity;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class MackerelRenderer extends GeoEntityRenderer<MackerelEntity> {
    public MackerelRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new MackerelModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(MackerelEntity instance) {
        return new ResourceLocation(AquaticBrilliance.MOD_ID, "textures/entity/mackerel/macktexture.png");
    }



    @Override
    public RenderType getRenderType(MackerelEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {

        if(animatable.isBaby()) {
            stack.scale(0.4F, 0.4F, 0.4F);
        } else {
            stack.scale(1F, 1F, 1F);
        }
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }

    @Override
    protected void applyRotations(MackerelEntity endWhale, PoseStack matrixStackIn, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(endWhale, matrixStackIn, ageInTicks, rotationYaw, partialTicks);

        float f = 4.3F * Mth.sin(0.6F * ageInTicks);
        matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(f));
        if (!endWhale.isInWater()) {
            matrixStackIn.translate(0.1F, 0.1F, -0.1F);
            matrixStackIn.mulPose(Vector3f.ZP.rotationDegrees(90.0F));
        }



    }
}
