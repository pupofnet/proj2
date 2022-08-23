package com.fernirsmodz.fernirsarmors.entity.client.armor;

import com.fernirsmodz.fernirsarmors.item.custom.AdventurerArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class AdventurerArmorRender extends GeoArmorRenderer<AdventurerArmorItem> {
    public AdventurerArmorRender() {
        super(new AdventurerArmorModel());

        this.headBone ="armorHead";
        this.bodyBone ="armorBody";
        this.leftArmBone="armorLeftArm";
        this.rightArmBone="armorRightArm";
        this.leftLegBone="armorLeftLeg";
        this.rightLegBone="armorRightLeg";
        this.leftBootBone="armorLeftBoot";
        this.rightBootBone="armorRightBoot";
    }
}
