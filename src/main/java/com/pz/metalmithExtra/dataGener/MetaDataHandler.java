package com.pz.metalmithExtra.dataGener;

import com.pz.metalmithExtra.Metalmithextra;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Metalmithextra.MODID,bus = Mod.EventBusSubscriber.Bus.FORGE)
public class MetaDataHandler {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        ExistingFileHelper efh = event.getExistingFileHelper();
        PackOutput packOutput = gen.getPackOutput();

        event.getGenerator().addProvider(
                // 告诉生成器仅在生成服务端资源时运行
                event.includeServer(),
               new ModRecipeProvider(packOutput)
        );
    }
}
