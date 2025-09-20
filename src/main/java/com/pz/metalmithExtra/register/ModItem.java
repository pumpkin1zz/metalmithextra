package com.pz.metalmithExtra.register;

import com.pz.metalmithExtra.Metalmithextra;
import com.pz.metalmithExtra.item.CustSword;
import com.pz.metalmithExtra.item.armor.CustArmorMaterial;
import metalmith.items.ToolsRegistration;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItem {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Metalmithextra.MODID);

    public static final RegistryObject<Item> FLAM_BROADSWORD = ITEMS.register(
            "flam_iron_broadsword",
            ()-> new CustSword(ToolsRegistration.FLAM_IRON_TIER, 7, -2.7F,0.5F ,new Item.Properties()));


    public static final RegistryObject<Item> FLAM_SPEAR = ITEMS.register(
            "flam_spear",
            () -> new CustSword(ToolsRegistration.FLAM_IRON_TIER,5,-2.6F,0.75F,new Item.Properties())
    );

    public static final RegistryObject<Item> NUGGET_FLAM_HELMET = ITEMS.register(
      "nugget_flam_helmet",
            () -> new ArmorItem(CustArmorMaterial.FLAM_IRON_NUGGET, ArmorItem.Type.HELMET,new Item.Properties())
    );
    public static final RegistryObject<Item> NUGGET_FLAM_CHESTPLATE = ITEMS.register(
      "nugget_flam_chestplate",
            () -> new ArmorItem(CustArmorMaterial.FLAM_IRON_NUGGET, ArmorItem.Type.CHESTPLATE,new Item.Properties())
    );
    public static final RegistryObject<Item> NUGGET_FLAM_LEGGINGS = ITEMS.register(
      "nugget_flam_leggings",
            () -> new ArmorItem(CustArmorMaterial.FLAM_IRON_NUGGET, ArmorItem.Type.LEGGINGS,new Item.Properties())
    );
    public static final RegistryObject<Item> NUGGET_FLAM_BOOTS = ITEMS.register(
      "nugget_flam_boots",
            () -> new ArmorItem(CustArmorMaterial.FLAM_IRON_NUGGET, ArmorItem.Type.BOOTS,new Item.Properties())
    );
}
