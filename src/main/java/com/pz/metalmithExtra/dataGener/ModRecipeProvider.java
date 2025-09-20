package com.pz.metalmithExtra.dataGener;

import com.pz.metalmithExtra.register.ModItem;
import metalmith.items.ArmorRegistration;
import metalmith.items.ItemsRegistration;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {


    public ModRecipeProvider(PackOutput p_248933_) {
        super(p_248933_);
    }


    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> p_251297_) {

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItem.FLAM_BROADSWORD.get())
                .pattern(" XY")
                .pattern("XYX")
                .pattern("ZX ")
                .define('X', Items.IRON_INGOT)
                .define('Y', ItemsRegistration.FLAM_IRON_INGOT.get())
                .define('Z',Items.STICK)
                .unlockedBy("has",has(ItemsRegistration.FLAM_IRON_INGOT.get()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItem.FLAM_SPEAR.get())
                .pattern("  Y")
                .pattern(" Z ")
                .pattern("Z  ")
                .define('Y', ItemsRegistration.FLAM_IRON_INGOT.get())
                .define('Z',Items.STICK)
                .unlockedBy("has",has(ItemsRegistration.FLAM_IRON_INGOT.get()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItem.NUGGET_FLAM_HELMET.get())
                .pattern("   ")
                .pattern(" Z ")
                .pattern("ZYZ")
                .define('Y', ArmorRegistration.FLAM_IRON_HELMET.get())
                .define('Z',Items.NETHERITE_SCRAP)
                .unlockedBy("has",has(ArmorRegistration.FLAM_IRON_HELMET.get()))
                .save(p_251297_);

     ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItem.NUGGET_FLAM_CHESTPLATE.get())
                .pattern(" Z ")
                .pattern("ZYZ")
                .pattern("ZZZ")
                .define('Y', ArmorRegistration.FLAM_IRON_CHESTPLATE.get())
                .define('Z',Items.NETHERITE_SCRAP)
                .unlockedBy("has",has(ArmorRegistration.FLAM_IRON_CHESTPLATE.get()))
                .save(p_251297_);

     ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItem.NUGGET_FLAM_LEGGINGS.get())
                .pattern("ZYZ")
                .pattern("ZZZ")
                .pattern(" Z ")
                .define('Y', ArmorRegistration.FLAM_IRON_LEGGINGS.get())
                .define('Z',Items.NETHERITE_SCRAP)
                .unlockedBy("has",has(ArmorRegistration.FLAM_IRON_LEGGINGS.get()))
                .save(p_251297_);

 ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItem.NUGGET_FLAM_BOOTS.get())
                .pattern("   ")
                .pattern("ZYZ")
                .pattern("Z Z")
                .define('Y', ArmorRegistration.FLAM_IRON_BOOTS.get())
                .define('Z',Items.NETHERITE_SCRAP)
                .unlockedBy("has",has(ArmorRegistration.FLAM_IRON_BOOTS.get()))
                .save(p_251297_);

    }


}
