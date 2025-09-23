package com.pz.metalmithExtra.item.armor;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
                HumanoidModel<LivingEntity> livingEntityHumanoidModel = new HumanoidModel<>(new ModelPart(Collections.emptyList(),
                        Map.of(
                                "head", new FlamIronArmorModel<>(Minecraft.getInstance().getEntityModels().bakeLayer(FlamIronArmorModel.LAYER_LOCATION)).head,
                                "body", new FlamIronArmorModel<>(Minecraft.getInstance().getEntityModels().bakeLayer(FlamIronArmorModel.LAYER_LOCATION)).body,
                                "left_arm", new FlamIronArmorModel<>(Minecraft.getInstance().getEntityModels().bakeLayer(FlamIronArmorModel.LAYER_LOCATION)).left_arm,
                                "left_leg", new FlamIronArmorModel<>(Minecraft.getInstance().getEntityModels().bakeLayer(FlamIronArmorModel.LAYER_LOCATION)).left_leg,
                                "right_arm", new FlamIronArmorModel<>(Minecraft.getInstance().getEntityModels().bakeLayer(FlamIronArmorModel.LAYER_LOCATION)).right_arm,
                                "right_leg", new FlamIronArmorModel<>(Minecraft.getInstance().getEntityModels().bakeLayer(FlamIronArmorModel.LAYER_LOCATION)).right_leg,
                                "hat", new ModelPart(Collections.emptyList(), Collections.emptyMap())

                        )
                ));

                return livingEntityHumanoidModel;
            }
        });
    }
}
