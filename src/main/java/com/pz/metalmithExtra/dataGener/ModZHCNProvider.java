package com.pz.metalmithExtra.dataGener;

import com.pz.metalmithExtra.Metalmithextra;
import com.pz.metalmithExtra.register.ModItem;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModZHCNProvider extends LanguageProvider {
    public ModZHCNProvider(PackOutput output) {
        super(output, Metalmithextra.MODID, "zh_cn");
    }

    @Override
    protected void addTranslations() {
        this.addItem(ModItem.FLAM_BROADSWORD,"炽玄铁阔剑");
        this.addItem(ModItem.FLAM_SPEAR,"炽玄铁矛");
        this.addItem(ModItem.NUGGET_FLAM_HELMET,"下界炽玄铁头盔");
        this.addItem(ModItem.NUGGET_FLAM_CHESTPLATE,"下界炽玄铁胸甲");
        this.addItem(ModItem.NUGGET_FLAM_LEGGINGS,"炽玄铁护腿");
        this.addItem(ModItem.NUGGET_FLAM_BOOTS,"炽玄铁靴子");

    }
}
