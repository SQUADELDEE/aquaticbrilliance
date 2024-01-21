package net.squadeldee.aquaticbrilliance.client;

import net.minecraft.resources.ResourceLocation;
import net.squadeldee.aquaticbrilliance.AquaticBrilliance;
import net.squadeldee.aquaticbrilliance.entity.custom.SunfishEntity;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

import javax.annotation.Nullable;

public class SunfishModel extends AnimatedGeoModel<SunfishEntity> {

    @Override
    public ResourceLocation getModelResource(SunfishEntity object) {
        return new ResourceLocation(AquaticBrilliance.MOD_ID, "geo/sunfish2.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SunfishEntity object) {
        return new ResourceLocation(AquaticBrilliance.MOD_ID, "textures/entity/sunfish/suntexture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SunfishEntity animatable) {
        return new ResourceLocation(AquaticBrilliance.MOD_ID, "animations/sunfish.animation2.json");
    }

//    @Override
//    public void setLivingAnimations(SunfishEntity entity, Integer uniqueID, @Nullable AnimationEvent customPredicate) {
//        super.setLivingAnimations(entity, uniqueID, customPredicate);
//        IBone rotBone = this.getAnimationProcessor().getBone("bone");
//
//        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
//        if (entity.isInWater()) {
//            rotBone.setRotationX(extraData.headPitch * ((float) Math.PI / 300.0F));
//            rotBone.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 300.0F));
//        }
//    }
}
