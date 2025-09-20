package com.pz.metalmithExtra.dataGener;

import com.pz.metalmithExtra.register.ModItem;
import metalmith.items.ItemsRegistration;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.packs.VanillaRecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.data.ForgeRecipeProvider;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {


    public ModRecipeProvider(PackOutput p_248933_) {
        super(p_248933_);
    }


    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> p_251297_) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItem.FLAM_IRON_BROADSWORD.get())
                .pattern(" XY")
                .pattern("XYX")
                .pattern("ZX ")
                .define('X', Items.IRON_INGOT)
                .define('Y', ItemsRegistration.FLAM_IRON_INGOT.get())
                .define('Z',Items.STICK)
                .unlockedBy("has",has(ItemsRegistration.FLAM_IRON_INGOT.get()))
                .save(p_251297_);


    }
}
