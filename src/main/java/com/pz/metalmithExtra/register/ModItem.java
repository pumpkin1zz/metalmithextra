package com.pz.metalmithExtra.register;

import com.pz.metalmithExtra.Metalmithextra;
import com.pz.metalmithExtra.item.Broadsword;
import metalmith.items.ToolsRegistration;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItem {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Metalmithextra.MODID);

    public static final RegistryObject<Item> FLAM_IRON_BROADSWORD = ITEMS.register(
            "flam_iron_broadsword",
            ()-> new Broadsword(ToolsRegistration.FLAM_IRON_TIER, 7, -2.7F,6.5F ,new Item.Properties()));


}
