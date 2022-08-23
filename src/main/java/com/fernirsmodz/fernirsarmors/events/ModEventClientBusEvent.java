package com.fernirsmodz.fernirsarmors.events;

import com.fernirsmodz.fernirsarmors.FernirsArmors;
import com.fernirsmodz.fernirsarmors.entity.client.armor.AdventurerArmorRender;
import com.fernirsmodz.fernirsarmors.item.custom.AdventurerArmorItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = FernirsArmors.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)

public class ModEventClientBusEvent {

    @SubscribeEvent
    public static void registerArmorRenderers(final FMLClientSetupEvent event){
        GeoArmorRenderer.registerArmorRenderer(AdventurerArmorItem.class, new AdventurerArmorRender());
    }
}
