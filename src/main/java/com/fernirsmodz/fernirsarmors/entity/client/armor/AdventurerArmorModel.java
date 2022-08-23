package com.fernirsmodz.fernirsarmors.entity.client.armor;

import com.fernirsmodz.fernirsarmors.FernirsArmors;
import com.fernirsmodz.fernirsarmors.item.custom.AdventurerArmorItem;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AdventurerArmorModel extends AnimatedGeoModel<AdventurerArmorItem> {
    @Override
    public ResourceLocation getModelLocation(AdventurerArmorItem object) {
        return new ResourceLocation(FernirsArmors.MOD_ID,"models/item/adventurer_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(AdventurerArmorItem object) {
        return new ResourceLocation(FernirsArmors.MOD_ID,"textures/models/armor/adventurer_armor.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(AdventurerArmorItem animatable) {
        return new ResourceLocation(FernirsArmors.MOD_ID, "animation/adventurer_armor_animation.json");
    }
}
