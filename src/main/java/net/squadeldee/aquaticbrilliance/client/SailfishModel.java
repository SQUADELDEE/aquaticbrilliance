package net.squadeldee.aquaticbrilliance.client;

import net.minecraft.resources.ResourceLocation;
import net.squadeldee.aquaticbrilliance.AquaticBrilliance;
import net.squadeldee.aquaticbrilliance.entity.custom.SailfishEntity;
import net.squadeldee.aquaticbrilliance.entity.custom.SailfishEntity;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

import javax.annotation.Nullable;

public class SailfishModel extends AnimatedGeoModel<SailfishEntity> {
    @Override
    public ResourceLocation getModelResource(SailfishEntity object) {
        return new ResourceLocation(AquaticBrilliance.MOD_ID, "geo/sailfish.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SailfishEntity object) {
        return new ResourceLocation(AquaticBrilliance.MOD_ID, "textures/entity/sailfish/sailtexture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SailfishEntity animatable) {
        return new ResourceLocation(AquaticBrilliance.MOD_ID, "animations/sailfish.animation.json");
    }

    @Override
    public void setLivingAnimations(SailfishEntity entity, Integer uniqueID, @Nullable AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone rotBone = this.getAnimationProcessor().getBone("bone");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (entity.isInWater()) {
            rotBone.setRotationX(extraData.headPitch * ((float) Math.PI / 180.0F));
            rotBone.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180.0F));
        }
    }
    
}
