package com.starfish_studios.another_furniture.forge;

import com.starfish_studios.another_furniture.AnotherFurniture;
import com.starfish_studios.another_furniture.client.AnotherFurnitureClient;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = AnotherFurniture.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class AnotherFurnitureForgeClient {
    @SubscribeEvent
    public static void init(FMLClientSetupEvent event) {
        AnotherFurnitureClient.init();

    }
}
