package com.pz.metalmithExtra.dataGener;

import com.pz.metalmithExtra.Metalmithextra;
import com.pz.metalmithExtra.register.ModItem;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModENUSProvider extends LanguageProvider {
    public ModENUSProvider(PackOutput output) {
        super(output, Metalmithextra.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
    }
}
