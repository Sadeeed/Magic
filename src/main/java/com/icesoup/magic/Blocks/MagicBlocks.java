package com.icesoup.magic.Blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class MagicBlocks {

    //Define Block Objects
    public static final Block Escape_Portal = new Block(FabricBlockSettings.of(Material.PORTAL).lightLevel(12).dropsNothing().nonOpaque().noCollision());


    public static void register(){
        Registry.register(Registry.BLOCK, new Identifier("magicsoup","escape_portal"),Escape_Portal);
    }
}
