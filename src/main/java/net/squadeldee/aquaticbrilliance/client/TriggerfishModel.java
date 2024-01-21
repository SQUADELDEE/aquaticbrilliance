package net.squadeldee.aquaticbrilliance.client;

import net.minecraft.resources.ResourceLocation;
import net.squadeldee.aquaticbrilliance.AquaticBrilliance;
import net.squadeldee.aquaticbrilliance.entity.custom.TriggerfishEntity;
import net.squadeldee.aquaticbrilliance.entity.custom.TriggerfishEntity;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

import javax.annotation.Nullable;

public class TriggerfishModel extends AnimatedGeoModel<TriggerfishEntity> {
    @Override
    public ResourceLocation getModelResource(TriggerfishEntity object) {
        return new ResourceLocation(AquaticBrilliance.MOD_ID, "geo/triggerfish.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(TriggerfishEntity object) {
        return new ResourceLocation(AquaticBrilliance.MOD_ID, "textures/entity/triggerfish/trigtexture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(TriggerfishEntity animatable) {
        return new ResourceLocation(AquaticBrilliance.MOD_ID, "animations/triggerfish.animation.json");
    }

    @Override
    public void setLivingAnimations(TriggerfishEntity entity, Integer uniqueID, @Nullable AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone rotBone = this.getAnimationProcessor().getBone("bone");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (entity.isInWater()) {
            rotBone.setRotationX(extraData.headPitch * ((float) Math.PI / 180.0F));
            rotBone.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180.0F));
        }
    }
    
}
