package com.icesoup.magic.Items;

import com.icesoup.magic.Magic;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class MagicItems {

    //Define Item Objects
    public static final Item Potato_Dust = new DustItem(new Item.Settings().group(Magic.General));
    public static final Item Carrot_Dust = new DustItem(new Item.Settings().group(Magic.General));
    public static final Item Dried_Potato = new Item(new Item.Settings().group(Magic.General));
    public static final Item Dried_Carrot = new Item(new Item.Settings().group(Magic.General));
    public static final Item Escape_Rope = new EscapeRopeItem(new Item.Settings().group(Magic.General).maxCount(1));
    public static final Item Tenderizer = new TenderizerItem(10,-3.0F);


    public static void register()
    {
        //Register Items
        Registry.register(Registry.ITEM, new Identifier("magicdust","potato_dust"), Potato_Dust);
        Registry.register(Registry.ITEM, new Identifier("magicdust","carrot_dust"), Carrot_Dust);
        Registry.register(Registry.ITEM, new Identifier("magicdust","dried_potato"), Dried_Potato);
        Registry.register(Registry.ITEM, new Identifier("magicdust","dried_carrot"), Dried_Carrot);
        Registry.register(Registry.ITEM, new Identifier("magicdust","escape_rope"), Escape_Rope);
        Registry.register(Registry.ITEM, new Identifier("magicdust","tenderizer"), Tenderizer);
    }
}
