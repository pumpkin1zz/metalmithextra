package com.pz.metalmithExtra;

import com.mojang.logging.LogUtils;
import com.pz.metalmithExtra.item.armor.FlamIronArmorModel;
import com.pz.metalmithExtra.register.ModItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Metalmithextra.MODID)
public class Metalmithextra {

    // Define mod id in a common place for everything to reference
    public static final String MODID = "metalmithextra";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();


    public Metalmithextra() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();



        register(modEventBus,
                ModItem.ITEMS
        );

        modEventBus.addListener(this::addCreative);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void register(IEventBus modEventBus , DeferredRegister<?>... registers) {
        for (DeferredRegister<?> register : registers) {
            register.register(modEventBus);
        }
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItem.FLAM_BROADSWORD);
            event.accept(ModItem.FLAM_SPEAR);

        }
        if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(ModItem.NUGGET_FLAM_HELMET);
            event.accept(ModItem.NUGGET_FLAM_CHESTPLATE);
            event.accept(ModItem.NUGGET_FLAM_LEGGINGS);
            event.accept(ModItem.NUGGET_FLAM_BOOTS);
        }
    }


    @Mod.EventBusSubscriber(modid = Metalmithextra.MODID,bus = Mod.EventBusSubscriber.Bus.MOD,value = Dist.CLIENT)
    public class ClienModEvent {
        @SubscribeEvent
        public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
            event.registerLayerDefinition(FlamIronArmorModel.LAYER_LOCATION,FlamIronArmorModel::createBodyLayer);
        }
    }
}
