package com.pz.metalmithExtra.item.armor;

import metalmith.items.ItemsRegistration;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class CustArmorMaterial {
    public static final ArmorMaterial FLAM_IRON_NUGGET = new ArmorMaterial() {
        @Override
        public int getDurabilityForType(ArmorItem.Type p_266807_) {
            return  (new int[]{407, 592, 555, 748})[p_266807_.getSlot().getIndex()];
        }

        @Override
        public int getDefenseForType(ArmorItem.Type p_267168_) {
            return  (new int[]{4, 9, 7, 4})[p_267168_.getSlot().getIndex()];
        }

        @Override
        public int getEnchantmentValue() {
            return 15;
        }

        @Override
        public SoundEvent getEquipSound() {
            return SoundEvents.ARMOR_EQUIP_NETHERITE;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(ItemsRegistration.FLAM_IRON_NUGGET.get());
        }

        @Override
        public String getName() {
            return "metalmithextra:flam_iron_nugget";
        }

        @Override
        public float getToughness() {
            return 3F;
        }

        @Override
        public float getKnockbackResistance() {
            return 0.1F;
        }
    }  ;


}
