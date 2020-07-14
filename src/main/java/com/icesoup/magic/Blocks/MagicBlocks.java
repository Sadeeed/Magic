package com.icesoup.magic.Blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class MagicBlocks {

    //Define Block Objects
    public static final Block Portal_Residue = new Block(FabricBlockSettings.of(Material.STONE).lightLevel(12).dropsNothing().nonOpaque().noCollision());


    public static void register(){
        Registry.register(Registry.BLOCK, new Identifier("magicdust","portal_residue"),Portal_Residue);
    }
}

