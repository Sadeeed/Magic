package com.icesoup.magic.Items;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Rarity;

public class TenderizerItem extends AxeItem {
    public TenderizerItem(int attack_multiplier, float attack_speed) {
        super(TenderizerMaterial.Tenderizer_Material, attack_multiplier, attack_speed, new Item.Settings()
                .maxCount(1)
                .group(ItemGroup.TOOLS)
                .rarity(Rarity.RARE));
    }
}
