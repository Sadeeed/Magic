package com.icesoup.magic.Items;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class TenderizerMaterial implements ToolMaterial {
    private final int durability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int miningLevel;
    private final int enchantability;
    private final Ingredient repairIngredient;

    public static ToolMaterial Tenderizer_Material = new TenderizerMaterial(1200, 8.0F, 3.0F, 3, 10, Ingredient.ofItems(Items.IRON_INGOT));

    public TenderizerMaterial(int durability, float miningSpeed, float attackDamage, int miningLevel, int enchantability, Ingredient ingredient){
        this.durability = durability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.miningLevel = miningLevel;
        this.enchantability = enchantability;
        this.repairIngredient = ingredient;
    }

    @Override
    public int getDurability() {
        return durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return miningLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairIngredient;
    }
}
