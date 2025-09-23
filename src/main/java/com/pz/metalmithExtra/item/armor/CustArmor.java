package com.pz.metalmithExtra.item.armor;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;

public class CustArmor extends ArmorItem {

    public CustArmor(Type p_266831_, Properties p_40388_) {
        super(CustArmorMaterial.FLAM_IRON_NUGGET, p_266831_, p_40388_);
    }

    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {
            @Override
            public @NotNull HumanoidModel<?> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, HumanoidModel<?> original) {
                return new HumanoidModel<>(new ModelPart(Collections.emptyList(),
                        Map.of(
                                "Head",new FlamIronArmorModel<>(Minecraft.getInstance().getEntityModels().bakeLayer(FlamIronArmorModel.LAYER_LOCATION)).Head,
                                "Body",new FlamIronArmorModel<>(Minecraft.getInstance().getEntityModels().bakeLayer(FlamIronArmorModel.LAYER_LOCATION)).Body,
                                "LeftArm",new FlamIronArmorModel<>(Minecraft.getInstance().getEntityModels().bakeLayer(FlamIronArmorModel.LAYER_LOCATION)).LeftArm,
                                "LeftLeg",new FlamIronArmorModel<>(Minecraft.getInstance().getEntityModels().bakeLayer(FlamIronArmorModel.LAYER_LOCATION)).LeftLeg,
                                "RightArm",new FlamIronArmorModel<>(Minecraft.getInstance().getEntityModels().bakeLayer(FlamIronArmorModel.LAYER_LOCATION)).RightArm,
                                "RightLeg",new FlamIronArmorModel<>(Minecraft.getInstance().getEntityModels().bakeLayer(FlamIronArmorModel.LAYER_LOCATION)).RightLeg

                        )
                ));

            }
        });
    }
}
